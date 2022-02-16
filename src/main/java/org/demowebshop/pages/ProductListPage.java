package org.demowebshop.pages;

import org.demowebshop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductListPage extends TestHelperUtility {
    WebDriver driver;

    /**Page Constructor**/
    public ProductListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**Page Elements**/
    private final String _sortByOption = "products-orderby";
    @FindBy(id = _sortByOption)
    private List<WebElement> sortByOption;

    private final String _blackDiamond = "//h2[@class='product-title']//a[@href='/black-white-diamond-heart']";
    @FindBy(xpath = _blackDiamond)
    private List<WebElement> blackDiamond;

    /**User action methods**/
    public void clickOnSortBy(String value) {
        for (int i = 0; i < sortByOption.size(); i++) {
            String val = sortByOption.get(i).getText();
            if (val.equals(value)) {
                page.selectDropDownByValue(sortByOption.get(i), value);
            }
        }
    }

    public ProductPage clickOnProduct(String prdt) {
        for (int i = 0; i < blackDiamond.size(); i++) {
            String value = blackDiamond.get(i).getText();
            if (value.equals(prdt)) {
                page.clickOnElement(blackDiamond.get(i));
                break;
            }
        }
        return new ProductPage(driver);
    }

}