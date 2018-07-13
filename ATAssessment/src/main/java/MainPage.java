
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class MainPage {
    @FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")
    private WebElement pimBtn;

    public void clickPim(){
        pimBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"menu_pim_addEmployee\"]/span[2]")
    private WebElement addBtn;

    public void clickAddEmployee(){
        addBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]")
    private WebElement employeeListBtn;

    public void clickEmployeeList(){
        employeeListBtn.click();
    }


}
