package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends Page{

    public final String myAcc= ".mod-mini-login-header";
    public final String btnLogin="lnkUyeOlmak";
    public final String prodSearch="//input[@class='header-fix-btn-search']";

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
