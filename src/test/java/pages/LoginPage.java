package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

    public final String email= "//div[@id='plhLoginEmail']/input[1]";
    public final String password="//div[@class='ems-field text ems-field-pass']//input[1]";
    public final String btnSave=".btnLogin";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
