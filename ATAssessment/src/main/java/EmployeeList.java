import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeList {

    @FindBy(id = "employee_name_quick_filter_employee_list_value")
    private WebElement searchBtn;

    public void enterSearchBox() {

        searchBtn.sendKeys("Jlol");
        searchBtn.sendKeys(Keys.chord(Keys.ENTER, ""));
    }
}
