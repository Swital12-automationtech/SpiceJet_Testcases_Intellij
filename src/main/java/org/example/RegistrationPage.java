package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class RegistrationPage {
    WebDriver driver;

    // Constructor
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // ✅ initialize elements
    }

    // WebElements using PageFactory
    @FindBy(xpath = " //div[contains(text(), 'Signup')]")
    WebElement signuplink;
    @FindBy(xpath = "//select[@class='form-control form-select ']")
    WebElement sel;
    @FindBy(id = "first_name")
    WebElement fn;
    @FindBy(id = "last_name")
    WebElement ln;
    @FindBy(xpath = "//input[@class= ' form-control']")
    WebElement phone;
    @FindBy(id = "email_id")
    WebElement email;
    @FindBy(id = "new-password")
    WebElement pass;
    @FindBy(id = "c-password")
    WebElement confirmpass;
    @FindBy(xpath ="//div[@class='form-check']//input")
    WebElement checkbox;

    public void registrationnew() {
        signuplink.click();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> i2 = window.iterator();
        String Parentid = i2.next();
        String Childid = i2.next();
        driver.switchTo().window(Childid);
    }
    public void details() throws InterruptedException {
        Select s1 = new Select(sel);
        s1.selectByValue("MISS");
        fn.sendKeys("Swital");
        Thread.sleep(2000);
        ln.sendKeys("Macwan");
        Thread.sleep(2000);
        phone.sendKeys("9892813939");
        Thread.sleep(2000);
        email.sendKeys("Swital@gmail.com");
        Thread.sleep(2000);
        pass.sendKeys("Ab@123456");
        confirmpass.sendKeys("Ab@123456");
        Thread.sleep(2000);
        checkbox.click();

    }
}
