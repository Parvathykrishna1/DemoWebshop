package org.demowebshop.utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

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
}

