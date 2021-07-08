package com.demoqa.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpecialMethods {
    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickJS(WebDriver driver, By by) {
        WebElement element  = driver.findElement(by);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public static void clickFILE(WebDriver driver, By by){
        WebElement element = driver.findElement(by);
        ((RemoteWebElement) element).setFileDetector(new LocalFileDetector());
        element.sendKeys("resources\\clase1.txt");
    }
}
