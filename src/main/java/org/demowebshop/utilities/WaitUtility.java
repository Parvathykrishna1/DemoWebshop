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

    public void waitForElementToBeVisible(WebDriver driver,String target,Enum locatorType) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        if(locatorType.equals(LocatorType.Id)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(target)));
        }
        if(locatorType.equals(LocatorType.Name)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(target)));
        }
        if(locatorType.equals(LocatorType.ClassName)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(target)));
        }
        if(locatorType.equals(LocatorType.Xpath)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(target)));
        }
        if(locatorType.equals(LocatorType.CssSelector)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(target)));
        }
        if(locatorType.equals(LocatorType.TagName)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(target)));
        }
        if(locatorType.equals(LocatorType.LinkText)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(target)));
        }
        if(locatorType.equals(LocatorType.PartialLinkText)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(target)));
        }
    }

    public void WaitToBeElementToClickable(WebDriver driver,String target,Enum locatorType){
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
            if (locatorType.equals(LocatorType.Id)){
                wait.until(ExpectedConditions.elementToBeClickable(By.id(target)));
            }
            if (locatorType.equals(LocatorType.ClassName)){
                wait.until(ExpectedConditions.elementToBeClickable(By.className(target)));
            }
            if (locatorType.equals(LocatorType.CssSelector)){
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(target)));
            }
            if (locatorType.equals(LocatorType.TagName)){
                wait.until(ExpectedConditions.elementToBeClickable(By.tagName(target)));
            }
            if (locatorType.equals(LocatorType.LinkText)){
                wait.until(ExpectedConditions.elementToBeClickable(By.linkText(target)));
            }
            if (locatorType.equals(LocatorType.PartialLinkText)){
                wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(target)));
            }
            if (locatorType.equals(LocatorType.Xpath)){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath(target)));
            }
            if (locatorType.equals(LocatorType.Name)){
                wait.until(ExpectedConditions.elementToBeClickable(By.name(target)));
            }
        }

    }
