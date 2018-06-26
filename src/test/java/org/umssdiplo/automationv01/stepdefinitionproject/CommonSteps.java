package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class CommonSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHAccident accident;
    private SHDeleteConfirmModal deleteConfirmModal;

    @Given("^Given I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^I select accident option on menú$")
    public void selectAccidentTab() throws Throwable {
        accident = headerWithLogin.clickAccidentTab();
    }

    @When("^I click on accident delete option$")
    public void clickDeleteButton() throws Throwable {
        deleteConfirmModal = accident.clickDeleteButton();
    }

    @Then("^I verify if a confirm delete modal is opened$")
    public void verifyConfirmDeleteModal() throws Throwable {
        Assert.assertTrue(deleteConfirmModal.isModalDialogPresent(), "El modal de confirmación de eliminación " +
                "no ha sido desplegado");
    }
}