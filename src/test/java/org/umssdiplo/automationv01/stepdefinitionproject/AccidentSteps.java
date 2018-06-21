package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.SHAccident;
import org.umssdiplo.automationv01.core.managepage.SHAccidentFomModal;

public class AccidentSteps {
    private SHAccident shAccident = new SHAccident();
    private HeaderWithLogin headerWithLogin = new HeaderWithLogin();
    private SHAccidentFomModal shAccidentFomModal = new SHAccidentFomModal();

    @And("^Clicked on 'Accidentes' on TabNAv$")
    public void clikOnAccTabNav() throws Throwable {
        headerWithLogin.clickAccidentTab();

    }

    @When("^Click on 'Registrar Accidente' on Accidente Page$")
    public void clickOnBtnRegAccPage() throws Throwable {
        shAccident.ClickRegistarAccBtn();
    }

    @Then("^AccidenteFormModal is Displayed$")
    public void checkModalFomDisplayed() throws Throwable {
        Assert.assertTrue(shAccidentFomModal.isModalDialogPresent());

    }
}
