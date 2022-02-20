package org.demowebshop.testscripts;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.demowebshop.automationcore.Base;
import org.demowebshop.listeners.TestListener;
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
    ThreadLocal<ExtentTest> extentTest = TestListener.getTestInstance();

    @Test(priority = 1, description = "TC_001_Verification of user registration")
    public void verifyRegistration() {
        extentTest.get().assignCategory("Sanity");
        home = new HomePage(driver);
        register = home.clickOnRegisterMenu();
        List<List<String>> data = excel.excelDataReader("RegisterPage");
        RandomDataUtility randomData = new RandomDataUtility();
        String email = randomData.getRandomString("email");
        register.selectGender(data.get(1).get(0));
        extentTest.get().log(Status.PASS, "Gender selected successfulyy");
        register.enterFirstName(data.get(1).get(1));
        extentTest.get().log(Status.PASS, "First name entered successfully");
        register.enterLastName(data.get(1).get(2));
        extentTest.get().log(Status.PASS, "last name entered successfully");
        register.enterEmail(email);
        extentTest.get().log(Status.PASS, "email entered successfully");
        register.enterPassword(data.get(1).get(3));
        extentTest.get().log(Status.PASS, "password entered successfully");
        register.enterConfirmPassword(data.get(1).get(3));
        extentTest.get().log(Status.PASS, "confirm password entered successfully");
        userAccount = register.clickOnRegisterButton();
        extentTest.get().log(Status.PASS, "clicked on registration button successfully");
        String actualEmail = userAccount.getUserAccountEmail();
        extentTest.get().log(Status.PASS, "Email address recieved successfully");
        Assert.assertEquals(actualEmail, email, "ERROR::Registration Failed");
        extentTest.get().log(Status.PASS, "User registarion passes successfully");
    }
}
