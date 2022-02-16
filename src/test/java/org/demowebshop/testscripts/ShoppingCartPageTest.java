package org.demowebshop.testscripts;

import org.demowebshop.automationcore.Base;
import org.demowebshop.pages.HomePage;
import org.demowebshop.pages.ProductListPage;
import org.demowebshop.pages.ProductPage;
import org.demowebshop.pages.ShoppingCartPage;
import org.demowebshop.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ShoppingCartPageTest extends Base {
    HomePage home;
    ExcelUtility excel = new ExcelUtility();
    ProductListPage productList;
    ProductPage product;
    ShoppingCartPage shoppingCart;

    @Test(priority = 1)
    public void verifyProductAddedInShoppingCart() {
        home = new HomePage(driver);
        List<List<String>> data = excel.excelDataReader("JewelryPage");
        String option = data.get(1).get(0);
        productList = home.clickOnProductMenu(option);
        String value = data.get(2).get(1);
        productList.clickOnSortBy(value);
        String prdt = data.get(1).get(2);
        product=productList.clickOnProduct(prdt);
        product.clickOnAddToCartButton();
        shoppingCart=product.clickOnShoppingCartMenu();
        String actual = shoppingCart.getProductNameDisplayed();
        String expected = "Black & White Diamond Heart";
        Assert.assertEquals(actual, expected, "ERROR::Cart MissMatch");
    }
}