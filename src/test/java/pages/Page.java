package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {

    WebDriver driver;
    public Page(WebDriver driver){
        this.driver=driver;
    }

    public void waitUntilTheElementAAppearsId(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }
    public void waitUntilTheElementAAppearsCss(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));
    }
    public void waitUntilTheElementAAppearsXpath(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));
    }

    public void clickId(String clickId){
        driver.findElement(By.id(clickId)).click();
    }

    public void clickCss(String clickCss){
        driver.findElement(By.cssSelector(clickCss)).click();
    }

    public void textXpath(String elementId, String textXpath){
        driver.findElement(By.xpath(elementId)).sendKeys(textXpath);
    }

    public void clickKeyboard(String elementId, Keys keyboard){
        driver.findElement(By.xpath(elementId)).sendKeys(keyboard);


    }
}
