package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class LoginPage {

    public WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver, String loginPage) {
        driver.get(loginPage);
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//*[@id=\"i0116\"]")
    private WebElement inputEmail;

    @FindBy(xpath = "//*[@id=\"i0118\"]")
    private WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"idSIButton9\"]")
    private WebElement acceptBtn;

    final String xpathSelectMe = "/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div[1]/div/div[1]";
    @FindBy(xpath = xpathSelectMe)
    private WebElement selectMe;

    public void login(String email, String password){
        wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"i0116\"]")));
        wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"idSIButton9\"]")));
        inputEmail.sendKeys(email);
        acceptBtn.click();
        wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"i0118\"]")));
        wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"idSIButton9\"]")));
        inputPassword.sendKeys(password);
        acceptBtn.click();
        acceptBtn.click();

        wait.until(visibilityOfElementLocated(By.xpath(xpathSelectMe)));
        selectMe.click();

    }
}
