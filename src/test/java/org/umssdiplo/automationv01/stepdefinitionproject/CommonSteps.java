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
    private SHViewAccident viewAccident;

    @Given("^Given I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^I open Accident tab option$")
    public void openAccidentTab() throws Throwable {
        accident = headerWithLogin.clickAccidentTab();
    }

    @When("^I click on view icon$")
    public void clickViewIcon() throws Throwable {
        viewAccident = accident.clickViewButton();
    }

    @Then("^Verify if the employee value is correct$")
    public void verifyEmployeeValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getEmployeeValue(), "1", "El valor del empleado no es el correcto.");
    }

    @Then("^Verify if the title value is correct$")
    public void verifyTitleValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getTitleValue(), "Titulo Accidente", "El valor del título no es el correcto.");
    }

    @Then("^Verify if the code value is correct$")
    public void verifyCodeValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getCodeValue(), "Codigo", "El valor del código no es el correcto.");
    }

    @Then("^Verify if the level risk value is correct$")
    public void verifyLevelRiskValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getLevelRiskValue(), "1", "El valor del nivel de riesgo no es el correcto.");
    }

    @Then("^Verify if the accidentType value is correct$")
    public void verifyAccidentTypeValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getAccidentType(), "1", "El valor del tipo de accidente no es el correcto.");
    }

    @Then("^Verify if the date event value is correct$")
    public void verifyDateEventValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getDateEvent(), "2018-05-05T00:00:00.000+0000", "El valor de la fecha de suceso no es el correcto.");
    }

    @Then("^Verify if the description value is correct$")
    public void verifyDescriptionValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getDescription(), "Descripcion", "El valor de la descripcion no es el correcto.");
    }

    @Then("^Verify if the status value is correct$")
    public void verifyStatusValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getStatus(), "1", "El valor del estado no es el correcto.");
    }
}