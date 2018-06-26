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
    public void goToEstOrg() {
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

    @And("^fill 'New Organization' modal form on 'Organization' page with 'start date' biger than 'end date'$")
    public void fillFormOrganizationDataWithStartBigerEndDate() {
        organization.fillNewOrganizationForm();
    }

    @And("^click 'Crear' button on 'New Organization' modal on 'Organization' page$")
    public void clickCreateOrganizationButton() {
        organization.clickSaveOrganizationButton();
    }

    @And("^verify 'El área fue creado correctamente' message info is displayed on 'Organization' page$")
    public void verifyOrgCreatedMessage() {
        Assert.assertEquals(organization.getMessageOrgCreated(), organization.getAlertMessage());
    }

    @And("^click 'Aceptar' button on 'Message Information' modal on 'Organization' page$")
    public void clickAceptarInformationMessage() {
        organization.clickAcceptButtonMessage();
    }

    @Then("^the new area must be present in the areas list.$")
    public void idStartDateBiggerEndDate() {
        Assert.assertTrue(organization.isNewOrganizationVisible(), "The new organization is not present in the list.");
    }
}