package org.demowebshop.testscripts;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.demowebshop.automationcore.Base;
import org.demowebshop.listeners.TestListener;
import org.demowebshop.pages.HomePage;
import org.demowebshop.pages.LoginPage;
import org.demowebshop.pages.UserAccountPage;
import org.demowebshop.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPageTest extends Base {
    HomePage home;
    LoginPage login;
    UserAccountPage userAccountPage;
    ExcelUtility excel = new ExcelUtility();
    ThreadLocal<ExtentTest> extentTest = TestListener.getTestInstance();

    @Test(priority = 1, description = "TC_002_Verification of user login ")
    public void verifyValidLogin() {
        home = new HomePage(driver);
        login = home.clickOnLoginMenu();
        List<List<String>> data = excel.excelDataReader("LoginPage");
        String uname = data.get(1).get(0);
        login.enterUserName(uname);
        extentTest.get().log(Status.PASS, "User name enetred successfully");
        String pswd = data.get(1).get(1);
        login.enterPassword(pswd);
        extentTest.get().log(Status.PASS, "Password enetred successfully");
        userAccountPage = login.clickOnLoginButton();
        extentTest.get().log(Status.PASS, "clicked on login button successfully");
        String actualEmailId = userAccountPage.getUserAccountEmail();
        Assert.assertEquals(actualEmailId, uname, "ERROR::Invalid Email ID");
        extentTest.get().log(Status.PASS, "user logged in successfully");
    }
}
