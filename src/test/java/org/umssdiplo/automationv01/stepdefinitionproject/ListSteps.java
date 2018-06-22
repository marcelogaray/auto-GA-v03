package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.HeaderWithoutLogin;
import org.umssdiplo.automationv01.core.managepage.SHAssignation;
import org.umssdiplo.automationv01.core.managepage.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class ListSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHAssignation assignment;

    @Given("^I loging to 'SMARTHOUSE' page with properly credentials$")
    public void i_loging_to_SMARTHOUSE_page_with_properly_credentials() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @Given("^I fill properly credentials with user admin$")
    public void i_fill_properly_credentials_with_user_admin() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @When("^Go to 'Asignacion de Equipos' on 'Header' page$")
    public void go_to_Asignacion_de_Equipos_on_Header_page() throws Throwable {
        assignment = headerWithLogin.clickAssignTab();
    }

}
