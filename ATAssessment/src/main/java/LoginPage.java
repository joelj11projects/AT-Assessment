import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "txtUsername")
    private WebElement userName;

    public void enterUsername(){
        userName.sendKeys("Admin");
    }

    @FindBy(id = "txtPassword")
    private WebElement passWord;

    public void enterPassword(){
        passWord.sendKeys("AdminAdmin");
    }

    @FindBy(id = "btnLogin")
    private WebElement loginBtn;

    public void clickLogin(){
        loginBtn.click();
    }
}
