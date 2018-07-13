import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployee {

    @FindBy(id = "firstName")
    private WebElement addFirstName;
    public void enterFirstname(){


        addFirstName.sendKeys("Jlol");
    }

    @FindBy(id = "lastName")
    private WebElement addLastName;

    public void enterLastname(){
        addLastName.sendKeys("Joshyyy");
    }

    @FindBy(xpath = "//*[@id=\"location_inputfileddiv\"]/div/input")
    private WebElement addLocation;

    public void enterLocation() {
        addLocation.click();
        addLocation.sendKeys(Keys.chord(Keys.ARROW_DOWN, ""));
        addLocation.sendKeys(Keys.chord(Keys.ARROW_DOWN, ""));
        addLocation.sendKeys(Keys.chord(Keys.ARROW_DOWN, ""));
        addLocation.sendKeys(Keys.chord(Keys.ENTER, ""));
    }

    @FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
    private WebElement loginDetailsBtn;

    public void clickLoginDetails() {
        loginDetailsBtn.click();
    }


    @FindBy(id = "username")
    private WebElement usernameBtn;

    public void enterNewUsername() {
        usernameBtn.sendKeys("j44elll");
    }

    @FindBy(id = "password")
    private WebElement passwordBtn;

    public void enterNewPassname() {
        passwordBtn.sendKeys("jjpassword");
    }

    @FindBy(id = "confirmPassword")
    private WebElement confirmPasswordBtn;

    public void enterNewConfirmPassname() {
        confirmPasswordBtn.sendKeys("jjpassword");
    }

    @FindBy(xpath = "//*[@id=\"systemUserSaveBtn\"]")
    private WebElement saveBtn;

    public void clickSave() {
        saveBtn.click();
    }
}
