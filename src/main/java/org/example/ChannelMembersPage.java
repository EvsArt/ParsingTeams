package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashSet;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ChannelMembersPage {

    DBWorking dbWorking;

    public WebDriver driver;
    WebDriverWait wait;

    public ChannelMembersPage(WebDriver driver, String channelPage) {
        driver.get(channelPage);
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(600));
    }

    final String membersBtn = "/html/body/div[2]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/td-members-tab/div/div[2]/div/div[1]/div[2]/div/button";
    @FindBy(xpath = membersBtn)
    private WebElement openMembersBtn;

    private WebElement getImgAtPos(int n){
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        String xpath = "/html/body/div[2]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/td-members-tab/div/div[2]/div/div[1]/div[2]/div[2]/div/div["+(n+1)+"]/div/div[1]/div[1]/div/profile-picture/img";
        try {
            wait.until(visibilityOfElementLocated(By.xpath(xpath)));
        }catch (TimeoutException e){
            throw new NoSuchElementException("Попытка поиска обновлённого элемента");
        }
        return driver.findElement(By.xpath(xpath));
    }


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/td-members-tab/div/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/span")
    private WebElement test;


    public void getEmails(HashSet<String> listOfEmails, String lastEmail){
        wait.until(visibilityOfElementLocated(By.xpath(membersBtn)));
        openMembersBtn.click();

        wait.until(visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/td-members-tab/div/div[2]/div/div[1]/div[2]/div[2]/td-members-tab-header/div/div[1]/div/div/span")));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        js.executeScript("document.querySelector(\".td-members-scroll-container\").scrollBy(0,100)");
        System.out.println("Первая прокрутка выполнена!");

            try {
                do {

                    for (WebElement elem : driver.findElements(By.className("ts-profile-img"))) {
                        try {
                            listOfEmails.add(elem.getAttribute("upn"));
                        } catch (StaleElementReferenceException ignore) {
                        }
                    }
                    System.out.println("Длина списка равна " + listOfEmails.size());
                    js.executeScript("document.querySelector(\".td-members-scroll-container\").scrollBy(0,200);");

                } while (!listOfEmails.contains(lastEmail));

            }catch (NoSuchElementException ignore) {
                System.out.println("Элемента нет");
            }

    }

}
