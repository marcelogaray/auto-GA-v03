package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.SmarthHouse.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class LoginSteps {
    private SHLogin login;

    @Given("^Given I loging to 'SMARTHOUSE' page with properly credentials$")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^I fill credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        login.fillCredentials();
    }

}
