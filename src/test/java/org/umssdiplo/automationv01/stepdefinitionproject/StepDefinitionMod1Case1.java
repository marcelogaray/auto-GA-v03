package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHAssignment;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepDefinitionMod1Case1 {

    private SHAssignment assignment;

    @Given("^El usuario selecciona la opcion 'Asignación de Equipos' y selecciona el boton 'Nueva Asignación'$")
    public void el_usuario_selecciona_la_opcion_Asignación_de_Equipos_y_selecciona_el_boton_Nueva_Asignación() throws Throwable {
            assignment = LoadPage.assignmentPage();
            assignment.NuevaAsignacion();
    }

    @When("^El usuario selecciona el empleado <\"([^\"]*)\"> el equipo a ser asignado <\"([^\"]*)\"> y observaciones <\"([^\"]*)\">$")
    public void el_usuario_selecciona_el_empleado_el_equipo_a_ser_asignado_y_observaciones(String arg1, String arg2, String arg3) throws Throwable {
            assignment.setDatos();
    }

    @When("^El usuario presione click en el boton Crear$")
    public void el_usuario_presione_click_en_el_boton_Crear() throws Throwable {
        assignment.registrarNuevaAsignacion();
    }

}
