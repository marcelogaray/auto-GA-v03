package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHAssignment;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepDefinitionMod1Case2 {
    private SHAssignment assignment;
    @Given("^El usuario selecciona la opcion 'Asignacion de equipos'$")
    public void el_usuario_selecciona_la_opcion_Asignacion_de_equipos() throws Throwable {
        assignment = LoadPage.assignmentPage();
        assignment.ListarAsignaciones();
    }

    @Then("^Se listan las asignaciones$")
    public void se_listan_las_asignaciones() throws Throwable {

    }

}
