package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;

import static com.ilcarro.pages.BasePage.driver;

public class LinksSteps {

    @Then("User should see five links in the navigation bar")
    public void verify_Links_Navigation_bar(DataTable dataTable)
    {
        List<String> linksInNaviBar=dataTable.asList();
        for(String link:linksInNaviBar)
        {
           new HomePage(driver).verifyLinksInNaviBar(link);
        }


    }
}
