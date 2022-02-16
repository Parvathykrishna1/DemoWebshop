package org.demowebshop.pages;

import org.demowebshop.utilities.TestHelperUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends TestHelperUtility {
    WebDriver driver;

    /**Page Constructor**/
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**Page Elements**/
    private final String _loginMenu = "//div[@class='header-links']//a[@class='ico-login']";
    @FindBy(xpath = _loginMenu)
    private WebElement loginMenu;

    private final String _registerMenu = "//a[@class='ico-register']";
    @FindBy(xpath = _registerMenu)
    private WebElement registerMenu;

    private final String _allMenus="//ul[@class='top-menu']//li//a";
    @FindBy(xpath =_allMenus )
    private List<WebElement> allMenus;

    /**User Action Methods**/
    public String getHomePageTitle() {
        String title = page.getPageTitle(driver);
        return title;
    }

    public LoginPage clickOnLoginMenu() {
        page.clickOnElement(loginMenu);
        return new LoginPage(driver);
    }

    public RegisterPage clickOnRegisterMenu() {
        page.clickOnElement(registerMenu);
        return new RegisterPage(driver);
    }

    public ProductListPage clickOnProductMenu(String text) {
        for (int i = 0; i < allMenus.size(); i++) {
            String value = allMenus.get(i).getText();
            if (value.equals(text)) {
                page.clickOnElement(allMenus.get(i));
                break;
            }
        }
        return new ProductListPage(driver);
    }
}
