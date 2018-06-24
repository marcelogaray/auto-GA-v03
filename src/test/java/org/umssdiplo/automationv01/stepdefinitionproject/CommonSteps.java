package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.HeaderWithoutLogin;
import org.umssdiplo.automationv01.core.managepage.SHLogin;
import org.umssdiplo.automationv01.core.managepage.SHOrganization;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class CommonSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHOrganization organization;

    @Given("^I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @When("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^go to 'Estructura Organizacional' on 'Header' page$")
    public void load_Organization_page() {
        organization = headerWithLogin.clickOrganizationTab();
    }

    @And("^click 'Detail' button on 'Gerencia General Enabled' option on 'Organization' page$")
    public void goToArea() {
        organization.openActiveOrganizationDetailView();
    }

    @And("^click 'Nuea Area' button on 'Organization' page$")
    public void clickNewOrganization() {
        organization.openNewOrganizationModalForm();
    }

    @And("^click 'Cancelar' button on 'New Organization' modal form$")
    public void clickCancelNewOrganization() {
        organization.clickCancelNewOrganizationButton();
    }

    @And("^go to 'Home' on 'Header' page$")
    public void goToHome() {
        headerWithoutLogin.clickHomeTab();
    }

    @And("^click 'Detail' button on 'Gerencia General Disabled' option on 'Organization page'$")
    public void goToDisabledArea() {
        organization.openInactiveOrganizationDetailView();
    }

    @Then("^'Nueva Area' button is not present on 'Organization' page$")
    public void isNewOrganizationButtonNotPresent() {
        Assert.assertFalse(organization.isNewOrganizationButtonPresent(), "'New Organization' button is present.");
    }
}