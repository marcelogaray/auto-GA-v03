package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class ModalAsigEquipos {

    public SHAssignation modalAsiaEquip;
    public HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHLogin login;
    private SHAssignation assignment;
    private SHAssignationModal shAssignationModal = new SHAssignationModal();


    @Given("^insert login$")
    public void insertLogin() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
        headerWithLogin = login.fillCredentials();
    }

    @And("^press the button 'asignacion de equipos'$")
    public void pressTheButtonAsignacionDeEquipos() throws Throwable {
        assignment = headerWithLogin.clickAssignTab();
    }

   @And("^press 'nueva asignacion'$")
    public void pressNuevaAsignacion() throws Throwable {
       assignment.ClickRegistarAccBtn(); }
}
