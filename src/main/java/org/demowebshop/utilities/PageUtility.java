package org.demowebshop.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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

    public void selectDropDownByText(Select select, String value) {
        select.selectByVisibleText(value);
    }

    public void selectDropDownByIndex(Select select, int value) {
        select.selectByIndex(value);
    }

    public void selectDropDownByVisibleValue(Select select, String value) {
        select.selectByValue(value);
    }


    public void acceptAlert(Alert alert) {
        alert.accept();
    }

    public String alertGetText(Alert alert) {
        return alert.getText();
    }

    public void alertDismiss(Alert alert) {
        alert.dismiss();
    }

    public void alertPrompt(Alert alert, String value) {
        alert.sendKeys(value);
    }

    public void doubleClick(WebElement element, Actions action) {
        action.doubleClick(element).build().perform();
    }

    public void dragAndDrop(WebElement source, WebElement target, Actions action) {
        action.dragAndDrop(source, target).build().perform();
    }

    public void dragAndDropByDragBy(WebElement source, Actions action, int x, int y) {
        action.dragAndDropBy(source, x, y);

    }

    public void clickAndHold(WebElement drag, WebElement drop, Actions action) {
        action.clickAndHold(drag).moveToElement(drop).build().perform();
    }

}

