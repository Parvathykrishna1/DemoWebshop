package org.demowebshop.testscripts;

import org.demowebshop.automationcore.Base;
import org.demowebshop.pages.HomePage;
import org.demowebshop.pages.LoginPage;
import org.demowebshop.pages.RegisterPage;
import org.demowebshop.pages.UserAccountPage;
import org.demowebshop.utilities.ExcelUtility;
import org.demowebshop.utilities.RandomDataUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterPageTest extends Base {
    HomePage home;
    LoginPage login;
    UserAccountPage userAccount;
    RegisterPage register;
    ExcelUtility excel = new ExcelUtility();

    @Test(priority = 1)
    public void verifyRegistration() {
        home = new HomePage(driver);
        register = home.clickOnRegisterMenu();
        List<List<String>> data = excel.excelDataReader("RegisterPage");
        RandomDataUtility randomData = new RandomDataUtility();
        String email = randomData.getRandomString("email");
        register.selectGender(data.get(1).get(0));
        register.enterFirstName(data.get(1).get(1));
        register.enterLastName(data.get(1).get(2));
        register.enterEmail(email);
        register.enterPassword(data.get(1).get(3));
        register.enterConfirmPassword(data.get(1).get(3));
        userAccount = register.clickOnRegisterButton();
        String actualEmail = userAccount.getUserAccountEmail();
        Assert.assertEquals(actualEmail, email, "ERROR::Registration Failed");
    }
}
