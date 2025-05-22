package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;

    // Constructor
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // ✅ initialize elements
    }

    // WebElements using PageFactory
    @FindBy(xpath = "(//input[@class = 'css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
    WebElement fromCity;

    @FindBy(xpath = "(//input[@class = 'css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
    WebElement toCity;

    @FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
    WebElement ddate;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
    WebElement searchButton;

    // Method to search flight
    public void searchFlightDetails() {
        fromCity.sendKeys("AMD");
        toCity.sendKeys("PNQ");
        ddate.click();
        searchButton.click();
    }
}


