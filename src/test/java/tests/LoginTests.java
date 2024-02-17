package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.MainPage;

import java.time.Duration;

public class LoginTests{
    private WebDriver driver;
    private MainPage mainPage;
    private LoginPage loginPage;

  @BeforeEach
     void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage= new MainPage(driver);
        loginPage= new LoginPage(driver);
        driver.get("https://www.monsternotebook.com.tr");

  }

    @Test
     void monsterLoginTest(){

        mainPage.waitUntilTheElementAAppearsCss(mainPage.myAcc);
        mainPage.clickCss(mainPage.myAcc);

        mainPage.waitUntilTheElementAAppearsId(mainPage.btnLogin);
        mainPage.clickId(mainPage.btnLogin);

        loginPage.waitUntilTheElementAAppearsXpath(loginPage.email);
        loginPage.textXpath(loginPage.email,"monster@gmail.com");

        loginPage.waitUntilTheElementAAppearsXpath(loginPage.password);
        loginPage.textXpath(loginPage.password,"123456");

        loginPage.waitUntilTheElementAAppearsCss(loginPage.btnSave);
        loginPage.clickCss(loginPage.btnSave);
   }

      @Test
      void prodSearch(){

      mainPage.waitUntilTheElementAAppearsXpath(mainPage.prodSearch);
      mainPage.textXpath(mainPage.prodSearch,"monster sirt cantasi");
      mainPage.clickKeyboard(mainPage.prodSearch, Keys.ENTER);

      }

      @AfterEach
        void tearDown(){
        driver.close();

      }

}
