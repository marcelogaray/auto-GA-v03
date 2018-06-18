package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHAccident;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionSHAccidentes {
    private SHAccident accidente;
    private SHLogin login;

    @Given("^'SmathHome' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.smartHousePage();
    }

    @And("^set admins credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @And("^Accident Form Deploy$")
    public void accessAccidentLink() throws Throwable {
        accidente = new SHAccident();
        accidente.accidentFomDeploy();

    }

}
