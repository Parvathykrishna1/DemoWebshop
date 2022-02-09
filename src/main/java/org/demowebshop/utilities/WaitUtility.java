package org.demowebshop.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility {
    public static final long PAGE_LOAD_WAIT = 20;
    public static final long EXPLICIT_WAIT = 50;
    public enum LocatorType{
        Id,Name,ClassName,Xpath,CssSelector,TagName,LinkText,PartialLinkText;
    }

    public void waitForElementToBeVisible(WebDriver driver,String target,Enum locatortype) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        if(locatortype.equals(LocatorType.Id)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(target)));
        }
        if(locatortype.equals(LocatorType.Name)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(target)));
        }
        if(locatortype.equals(LocatorType.ClassName)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(target)));
        }
        if(locatortype.equals(LocatorType.Xpath)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(target)));
        }
        if(locatortype.equals(LocatorType.CssSelector)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(target)));
        }
        if(locatortype.equals(LocatorType.TagName)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(target)));
        }
        if(locatortype.equals(LocatorType.LinkText)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(target)));
        }
        if(locatortype.equals(LocatorType.PartialLinkText)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(target)));
        }
    }

    public void WaitToBeClickable(){

    }
}
