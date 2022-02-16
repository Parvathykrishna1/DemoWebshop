package org.demowebshop.pages;

import org.demowebshop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestHelperUtility {
    WebDriver driver;

    /**Page Constructor**/
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**Page elements**/

    private final String _addToCartMenu = "add-to-cart-button-14";
    @FindBy(id = _addToCartMenu)
    private WebElement addToCartMenu;

    private final String _shoppingCartCartMenu = "//a[@class='ico-cart']";
    @FindBy(xpath = _shoppingCartCartMenu)
    private WebElement shoppingCartCartMenu;

    /**User action methods**/
    public void clickOnAddToCartButton() {
        page.clickOnElement(addToCartMenu);
    }

    public ShoppingCartPage clickOnShoppingCartMenu() {
        page.clickOnElement(shoppingCartCartMenu);
        return new ShoppingCartPage(driver);
    }
}


