package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.smartHouse.Header;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHEmployee;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHLogin;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHOrganization;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionMod3Case5 {
    private SHLogin login;
    private SHOrganization organization;
    private Header menu;

    @Given("^M3C5: 'SMARTHOUSE' page is loaded$")
    public void smartHousePageIsLoaded() throws Throwable {
        menu = LoadPage.smartHousePage();
    }
    @And("^M3C5: open 'Login' page$")
    public void openLoginPage() throws Throwable {
        login = menu.clickLoginButton();
    }
    @And("^M3C5: set admin credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentialsOnLoginForm();
    }
    @And("^M3C5: accept credentials on 'Login' page$")
    public void acceptLoginCredentials() throws Throwable {
        login.acceptLoginCredentials();
    }
    @And("^M3C5: close 'Login' page$")
    public void closeLoginPage() throws Throwable {
        login.closeLoginPage();
    }
    @And("^M3C5: open 'Organization' page$")
    public void openOrganizationPage() throws Throwable {
        organization = menu.clickOrganizationTab();
    }
    @And("^M3C5: open 'Organization' detail$")
    public void openOrganizationDetail() throws Throwable {
        organization.openOrganizationDetailView();
    }
    @And("^M3C5: remove child 'Organization'$")
    public void openNewOrganizationOnSmartHouse() throws Throwable {
        organization.removeOrganization();
    }
    @And("^M3C5: 'SMARTHOUSE' page is closed")
    public void closePage() throws Throwable {
        LoadPage.closePage();
    }
}
