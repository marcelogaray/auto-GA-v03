package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.HeaderWithoutLogin;
import org.umssdiplo.automationv01.core.managepage.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class LoginSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;


    @Given("^Given I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }


}
