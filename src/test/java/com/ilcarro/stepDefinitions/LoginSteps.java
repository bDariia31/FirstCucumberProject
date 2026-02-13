package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    LoginPage login;


    @And("User clicks on Login Link")
    public void click_on_Login_link()
    {

        new HomePage(driver).clickOnLoginLink();
    }
    @And("User enters corect data")
    public void enters_corect_data()
    {
        login=new LoginPage(driver);
        login.enterData("maritest@gmail.com","Test1234$");


    }

    @And("User clicks on Yalla button")
    public void clicks_on_Yalla_button()
    {
         login.clickOnYalla();

    }

    @Then("User verifies Success message is displayed")
    public void verify_Success_Login()
    {
        login.varifyMessage("Logged in success");
    }

    @And("User enters corect email and wrong password")
    public void enter_wrong_password(DataTable table)
    {
        login.enterWrongPassword(table);

    }

    @Then("User verifies Error message is displayed")
    public void verify_Error_login()
    {
        login.verifyMessage("Login or Password incorrect");
    }



}
