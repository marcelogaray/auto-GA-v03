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
    private SHAssignation assignment;
    private SHAssignModalView modalView;

    @Given("^Given I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @And("^I fill properly credentials with admin user$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @And("^I logOut From 'SMARTHOUSE' Page$")
    public void logOut_From_SMATHOUSE_Page() throws Throwable {
        headerWithoutLogin.openLoginPage();
        login.clickLogOutButton();
    }

    @When("^Go to 'Asignacion de Equipos' on 'Header' page$")
    public void go_to_Asignacion_de_Equipos_on_Header_page() throws Throwable {
        assignment = headerWithLogin.clickAssignTab();
    }

    @When("^Click on the button to see the first assignment in the list on 'Asignacion de Equipos' page$")
    public void click_on_the_button_to_see_the_first_assignment_in_the_list_on_Asignacion_de_Equipos_page() throws Throwable {
        modalView = assignment.clicViewModal();
    }

    @When("^The modal 'Ver asignacion' is displayed that lists all the equipment that was assigned to that employee$")
    public void the_modal_Ver_asignacion_is_displayed_that_lists_all_the_equipment_that_was_assigned_to_that_employee() throws Throwable {
        Assert.assertTrue(modalView.isModalDialogPresent(), "el modal 'Ver asignacion' no se desplego correctamente");
        modalView.isButtonCloseVisible();
    }

    @Then("^Verify if the employee's name is correct$")
    public void verify_if_the_employee_s_name_is_correct() throws Throwable {
        Assert.assertEquals(modalView.getEmployeeName(), "EMP-14 - David Justiniano Negrete López", "El nombre del empleado no es el esperado");
        modalView.closeModalView();
    }

    @Then("^Verify if the equipment assignment is correct$")
    public void verify_if_the_equipment_assignment_is_correct() throws Throwable {
        Assert.assertEquals(modalView.getEquipmentName(), "Casco", "El equipo no esta en la lista");
    }
}
