package org.example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

public class Launch_Quit
{
    WebDriver driver;
    @BeforeMethod
    public void launch()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
    }

   @AfterMethod
    public void quit()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    }
}
