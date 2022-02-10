package org.demowebshop.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;
import java.util.Set;

public class PageUtility {
    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void enterText(WebElement element, String value) {
        element.sendKeys(value);
    }

    public String getElementText(WebElement element) {
        return element.getText();
    }

    public String getAttributeValue(WebElement element, String attribute) {

        return element.getAttribute(attribute);
    }

    public String getTagName(WebElement element) {
        return element.getTagName();
    }

    public void clearValue(WebElement element) {
        element.clear();
    }

    public Point getLocation(WebElement element) {
        return element.getLocation();
    }

    public Dimension getSize(WebElement element) {
        return element.getSize();
    }

    public boolean isEnabled(WebElement element) {
        return element.isEnabled();
    }

    public boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public boolean isSelected(WebElement element) {
        return element.isSelected();
    }

    public Dimension getElementSize(WebElement element) {
        return element.getSize();
    }


    public void selectByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void deSelectByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }


    public void selectByIndex(WebElement element, int value) {
        Select select = new Select(element);
        select.selectByIndex(value);
    }

    public void deSelectByIndex(WebElement element, int value) {
        Select select = new Select(element);
        select.selectByIndex(value);
    }

    public void selectByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.deselectByValue(value);
    }

    public void deSelectByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.deselectByValue(value);
    }

    public List<WebElement> dropDownValuesOptions(WebElement element) {
        Select select = new Select(element);
        return select.getOptions();
    }


    public void selectByIsMultiple(WebElement element) {
        Select select = new Select(element);
        select.isMultiple();
    }

    public void selectByDeSelectAll(WebElement element) {
        Select select = new Select(element);
        select.deselectAll();
    }


    public void acceptAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public String alertGetText(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void alertDismiss(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void alertPrompt(WebDriver driver, String value) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(value);
    }

    public void doubleClick(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.doubleClick().build().perform();
    }

    public void rightClick(WebDriver driver, WebElement source) {
        Actions actions = new Actions(driver);
        actions.contextClick(source).build().perform();
    }

    public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();
    }

    public void dragAndDropByOffset(WebDriver driver, WebElement source, int x, int y) {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(source, x, y).build().perform();

    }

    public void moveToElement(WebDriver driver, WebElement source, int x, int y) {
        Actions actions = new Actions(driver);
        actions.moveToElement(source, x, y).build().perform();
    }

    public void clickAndHold(WebDriver driver, WebElement drag, WebElement drop) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(drag).moveToElement(drop).build().perform();
    }


    public void navigateTo(WebDriver driver, String value) {
        driver.navigate().to(value);
    }

    public void navigateForward(WebDriver driver) {
        driver.navigate().forward();
    }

    public void navigateBack(WebDriver driver) {
        driver.navigate().back();
    }

    public void navigateRefresh(WebDriver driver) {
        driver.navigate().refresh();
    }

    public String windowHandlesToGetParent(WebDriver driver) {
        return driver.getWindowHandle();

    }

    public Set<String> windowHandlesToGetChild(WebDriver driver) {
        return driver.getWindowHandles();
    }


    public void frameByIndex(WebDriver driver, int i) {
        Frame frame = new Frame();
        driver.switchTo().frame(i);
    }

    public void frameByNameOrId(WebDriver driver, String value) {
        Frame frame = new Frame();
        driver.switchTo().frame(value);
    }

    public void frameByWebElement(WebDriver driver, WebElement element) {
        Frame frame = new Frame();
        driver.switchTo().frame(element);
    }


}

