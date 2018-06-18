package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.smartHouse.ModalAsiaEquip;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class ModalAsigEquipos {

    public ModalAsiaEquip modalAsiaEquip;

    @Given("^presionar el boton de asignacion de equipos$")
    public void pensionerElBatonDeAssignationDeEquips() throws Throwable {
         modalAsiaEquip = LoadPage.Assignation_equips();
    }
    @And("^presionar nueva asignacion$")
    public void presionarNuevaAsignacion() throws Throwable {
        modalAsiaEquip.setCredenciales();
    }
}
