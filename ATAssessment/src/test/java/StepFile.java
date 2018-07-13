import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.lexer.Pa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.applet.Main;

public class StepFile {

    public WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver",
                "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        driver.quit();


        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @Given("^the login page$")
    public void the_login_page()  {
        driver.get(Constant.theWebsite);
    }

    @When("^I login$")
    public void i_login() {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.enterUsername();
        loginpage.enterPassword();
        loginpage.clickLogin();
    }

    @When("^I click the PIM tab$")
    public void i_click_the_PIM_tab() {
        MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
        mainpage.clickPim();
    }

    @When("^then the Add Employee Tab$")
    public void then_the_Add_Employee_Tab() {
        MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
        WebElement wait = (new WebDriverWait(driver,20)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu_pim_addEmployee\"]/span[2]")));
        mainpage.clickAddEmployee();

    }

    @When("^I fill out the Employee Details correctly$")
    public void i_fill_out_the_Employee_Details_correctly() {
        AddEmployee addemployee = PageFactory.initElements(driver, AddEmployee.class);
        WebElement wait = (new WebDriverWait(driver,20)).until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
        addemployee.enterFirstname();
        addemployee.enterLastname();
        addemployee.enterLocation();

    }

    @When("^I choose to create Login Details by clicking the appropriate button$")
    public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button(){
        AddEmployee addemployee = PageFactory.initElements(driver, AddEmployee.class);
        addemployee.clickLoginDetails();
    }

    @When("^I fill out the Login Details correctly$")
    public void i_fill_out_the_Login_Details_correctly(){
        AddEmployee addemployee = PageFactory.initElements(driver, AddEmployee.class);
        addemployee.enterNewUsername();
        addemployee.enterNewPassname();
        addemployee.enterNewConfirmPassname();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @When("^I click the Save button$")
    public void i_click_the_Save_button() {
        AddEmployee addemployee = PageFactory.initElements(driver, AddEmployee.class);
        addemployee.clickSave();
        try {
            Thread.sleep(15000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Then("^I can search for the Employee I have just created$")
    public void i_can_search_for_the_Employee_I_have_just_created()  {
        Boolean wait = (new WebDriverWait(driver,20)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"materialize-lean-overlay-1\"]")));
        MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
        mainpage.clickEmployeeList();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Then("^select them for inspection$")
    public void select_them_for_inspection() {
        EmployeeList employeelist = PageFactory.initElements(driver, EmployeeList.class);
        employeelist.enterSearchBox();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
