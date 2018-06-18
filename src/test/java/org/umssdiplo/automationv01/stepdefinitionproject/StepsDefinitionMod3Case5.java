package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHEmployee;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHLogin;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHOrganization;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionMod3Case5 {
    private SHLogin login;
    private SHOrganization organization;

    @Given("^'SMARTHOUSE' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.smartHousePage();
    }
    @And("^set admin credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }
    @And("^open organization detail and remove child on 'SmartHouse'$")
    public void openNewOrganizationOnSmartHouse() throws Throwable {
        organization = new SHOrganization();
        organization.removeOrganization();
    }
}
