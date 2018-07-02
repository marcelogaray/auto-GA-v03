package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.dataProviders.FileReaderManager;
import org.umssdiplo.automationv01.core.dataTypes.Employee;
import org.umssdiplo.automationv01.core.managepage.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.HeaderWithoutLogin;
import org.umssdiplo.automationv01.core.managepage.SHAssignation;
import org.umssdiplo.automationv01.core.managepage.SHLogin;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.List;
import java.util.Map;

public class CommonSteps {
    private SHLogin login;
    private HeaderWithLogin headerWithLogin;
    private HeaderWithoutLogin headerWithoutLogin;
    private SHEmployee employee;
    private SHNewEmployeeForm employeeForm;
    private Employee employeeData;
    private SHAssignation assignment;
    private SHAccident shAccident;
    private SHAccidentFormModal shAccidentFomModal;
    private SHSwalNotification shSwalNotification;
    private SHAccidentVieWmodal shAccidentVieWmodal;
    private SHAssignModalView modalView;
    private SHAssignModalDelete modalDelete;
    private int countAssignments;

    @Given("^I loging to 'SMARTHOUSE' page")
    public void smarthouse_s_page_is_loaded() throws Throwable {
        headerWithoutLogin = LoadPage.headerWithoutLogin();
        login = headerWithoutLogin.openLoginPage();
    }

    @When("^fill properly credentials in 'Login' modal$")
    public void fill_credentials_with_admin_user() throws Throwable {
        headerWithLogin = login.fillCredentials();
    }

    @When("^Go to 'Asignacion de Equipos' on 'Header' page, press the button 'Nueva Asignacion' on 'Asignacion de Equipos' page$")
    public void go_to_Asignacion_de_Equipos_on_Header_page_press_the_button_Nueva_Asignacion_on_Asignacion_de_Equipos_page() throws Throwable {
        assignment = headerWithLogin.clickAssignTab();
        assignment.newAssignment();
    }


    @When("^Go to 'Asignacion de Equipos' on 'Header' page$")
    public void go_to_Asignacion_de_Equipos_on_Header_page() throws Throwable {
        assignment = headerWithLogin.clickAssignTab();
    }
    @When("^user selects an employee, a equipment and enters observations of the assignment made on 'Asignar Equipo' modal$")
    public void user_selects_an_employee_a_equipment_and_enters_observations_of_the_assignment_made() throws Throwable {
        assignment.setData();

    }

    @When("^Click on the 'see' button of a registered assignment on 'Asignacion de Equipos' page$")
    public void click_on_the_see_button_of_a_registered_assignment_on_Asignacion_de_Equipos_page() throws Throwable {
        modalView = assignment.clicViewModal() ;
    }
    @When("^Click on 'Nueva asignacion'$")
    public void click_on_Nueva_asignacion() throws Throwable {
        assignment.newAssignment();
    }

    @And("^Create new assignment$")
    public void create_new_assignment() throws Throwable {
        assignment.setData();
        assignment.registerNewAssignment();
        assignment.registeredAssignment();
    }

    @When("^Click on remove assignment of the first employee from the list on 'Asignacion de equipos' page$")
    public void click_on_remove_assignment_of_the_first_employee_from_the_list_on_Asignacion_de_equipos_page() throws Throwable {
        modalDelete = assignment.clicViewModal();
    }
    @When("^Click on the button to see the first assignment in the list on 'Asignacion de Equipos' page$")
    public void click_on_the_button_to_see_the_first_assignment_in_the_list_on_Asignacion_de_Equipos_page() throws Throwable {
        modalView = assignment.clicViewModal();
    }

    @When("^click over 'Crear' button on 'Asignar equipo' modal$")
    public void click_over_Crear_button_on_Asignar_equipo_modal() throws Throwable {
        assignment.registerNewAssignment();
    }

    @Then("^'La asignacion fue registrada correctamente' information message should be displayed on 'Asignacion de Equipos' page$")
    public void la_asignacion_fue_registrada_correctamente_information_message_should_be_displayed() throws Throwable {
        assignment.registeredAssignment();
    }

    @And("^I logOut From 'SMARTHOUSE' Page$")
    public void logOut_From_SMATHOUSE_Page() throws Throwable {
        headerWithoutLogin.openLoginPage();
        login.clicklogOutButton();
    }

    @And("^go to 'Employee' on 'Header' page$")
    public void load_employee_page() throws Throwable {
        employee = headerWithLogin.clickEmployeeTab();
    }

    @And("^click over 'Nuevo Empleado' button on 'Employee' page$")
    public void open_new_employee_page() throws Throwable {
        employeeForm = employee.clickNewEmployeeButton();
    }

    @And("^fill new employee form on 'New Employee Form' page with duplicate 'employee code'$")
    public void click_over_new_employee_button() throws Throwable {
        employeeData = FileReaderManager.getInstance().getJsonReader().getEmployeeData();
        employeeForm.fillNewEmployeeForm(employeeData);
    }

    @And("^click over 'Guardar' button on 'New Employee Form' page$")
    public void click_over_guardar_new_employee_button() throws Throwable {
        employeeForm.clickAcceptNewEmployee();
    }

    @Then("^'El codigo de empleado ya se encuentra asignado a otro empleado' information message should be displayed$")
    public void is_message_code_duplicated_showed() throws Throwable {
        String messageExpected = String.format("El codigo de empleado %s ya se encuentra asignado a otro empleado", employeeData.getEmployeeCode());
        Assert.assertEquals(employeeForm.getAlertMessage(), messageExpected);
    }


    @Then("^Verify that the assignments are listed on 'Asignacion de equipos' page$")
    public void verify_that_the_assignments_are_listed_on_Asignacion_de_equipos_page() throws Throwable {
        Assert.assertTrue(assignment.assignationIsPresent(), "No se listan las asignaciones realizadas");
    }

    @And("^click on 'Accidentes' button on navigation NavigationBar$")
    public void clik_On_Accidentes_On_Navigarion_Bar() throws Throwable {
        shAccident = headerWithLogin.clickAccidentTab();
    }

    @When("^click on 'Registrar Accidente' button on Accident Page$")
    public void click_On_Reg_Accident_Btn_On_Acc_Page() throws Throwable {
        shAccidentFomModal = shAccident.ClickRegistarAccBtn();
    }

    @When("^click on 'Crear' button form 'Registrar Accidente' Modal Form$")
    public void clik_On_Crear_Btn_Accident_Mododal_Form() throws Throwable {
        shSwalNotification = shAccidentFomModal.clickBtnCrear();
    }

    @When("^click on 'aceptar' button from Alert message of Success$")
    public void clik_Accept_Btn_Alert() throws Throwable {
        shSwalNotification.clickAcceptBtn();
    }

    @Then("^click on view of  new registered accident on accedent page$")
    public void click_View_Modal_From_Accident_Page(DataTable accientCode) throws Throwable {
        List<Map<String, String>> data = accientCode.asMaps(String.class, String.class);
        shAccidentVieWmodal = shAccident.clickViewModal(data.get(0).get("code"));
    }

    @And("^I close de 'Registro Accidente'Form Modal$")
    public void close_Accident_Modal_Form() throws Throwable {
        shAccidentFomModal.closeModalDialog();
    }

    @And("^I click on close button form view Accident  modal form from Accident page$")
    public void close_View_Accident_Modal_Form() throws Throwable {
        shAccidentVieWmodal.closeAccidentViewDialog();
    }

    @When("^one required data is filled  on 'Registro Accidente' Modal Form$")
    public void fill_Modal_Form_WithOne_Valid_Req_Data() throws Throwable {
        shAccidentFomModal.fillModalFomOneReqData();
    }

    @When("^required data is filled on 'Registro Accidente' Modal Form$")
    public void fill_Modal_Form_With_Valid_Req_Data(DataTable defaulData) throws Throwable {
        List<Map<String, String>> data = defaulData.asMaps(String.class, String.class);
        shAccidentFomModal.fillModalFomFullData(data.get(0).get("titleAcc"), data.get(0).get("codeAcc"),
                data.get(0).get("lvlRiskCode"), data.get(0).get("dateEvent"), data.get(0).get("Description"));
    }

    @When("^required data is filled witout one of them on 'Registro Accidente' Modal Form$")
    public void fill_Modal_Form_Without_One_Valid_Req_Data(DataTable defaulData) throws Throwable {
        List<Map<String, String>> data = defaulData.asMaps(String.class, String.class);
        shAccidentFomModal.fillModalFomOneIncData(data.get(0).get("titleAcc"), data.get(0).get("codeAcc"),
                data.get(0).get("lvlRiskCode"), data.get(0).get("dateEvent"), data.get(0).get("Description"));
    }

    @Then("^verify that 'Registro Accidente'Form Modal is Displayed$")
    public void check_Accident_Modal_Form_Displayed() throws Throwable {
        Assert.assertTrue(shAccidentFomModal.isModalDialogPresent(), "El Formulario no se Cargo Correctamente");
    }

    @Then("^verify Alert message of Success message is shown for new accident register$")
    public void verify_Success_Message_is_Displayed() throws Throwable {
        Assert.assertTrue(shSwalNotification.isDialogPresent(), "Error, El dialogo no esta presente");
        Assert.assertTrue(shSwalNotification.isSuccess(), "Error, No se muestra success");
    }

    @Then("^verify 'Crear' button from 'Registro Accidente' Modal Form is enable$")
    public void verify_Crear_Btn_Modal_Fom_isEnable() throws Throwable {
        Assert.assertFalse(shAccidentFomModal.isCrearBtnEnable(), "Error, El boton crear no esta habilitado");
    }

    @Then("^verify 'Crear' button from 'Registro Accidente' Modal Form is disable$")
    public void verify_Crear_Btn_Modal_Form_Disable() throws Throwable {
        Assert.assertTrue(shAccidentFomModal.isCrearBtnEnable(), "Error, El boton crear no esta deshabilitado");
    }

    @Then("^verify new registered accident is shown in accedent page$")
    public void verify_Registered_Accident_Shown(DataTable accientCode) throws Throwable {
        List<Map<String, String>> data = accientCode.asMaps(String.class, String.class);
        Assert.assertTrue(shAccident.verifyListelement(data.get(0).get("codeAcc")), "Error, el Accidente no existe en la lista de accientes");
    }

    @Then("verify default data inserted into 'Registrar Accidente' Modal Form is shown into 'Ver Accidente Registrado' modal view")
    public void verify_Default_Data_IsShown(DataTable defaulData) throws Throwable {
        List<Map<String, String>> data = defaulData.asMaps(String.class, String.class);
        Assert.assertTrue(shAccidentVieWmodal.getEmployee().equals(data.get(0).get("employeeCode")) ||
                shAccidentVieWmodal.getEmployee().equals("1"), "El Codigo de Empleado no es el mismo");
        Assert.assertTrue(shAccidentVieWmodal.getTitle().equals(data.get(0).get("titleAcc")), "El Titulo del Acciente no es el mismo");
        Assert.assertTrue(shAccidentVieWmodal.getCode().equals(data.get(0).get("codeAcc")), "El Codigo del accidente o no es el mismo");
        Assert.assertTrue(shAccidentVieWmodal.getLevelRisk().equals(data.get(0).get("lvlRiskCode")), "El Nivel de Riesgo no es el mismo");
        Assert.assertTrue(shAccidentVieWmodal.getAcidentType().equals(data.get(0).get("accTypeCode")), "El Tipo de Acciente no es el mismo");
        Assert.assertTrue(shAccidentVieWmodal.getDateEvent().equals(data.get(0).get("dateEvent")), "La Fecha del Accidente no es la misma");
        Assert.assertTrue(shAccidentVieWmodal.getDescription().equals(data.get(0).get("Description")), "La descripcion del accidente no es la misma");
        Assert.assertTrue(shAccidentVieWmodal.getStatus().equals(data.get(0).get("statusCode")), "El Estado del accidente no es el mismo");
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
        Assert.assertTrue(modalView.isModalDialogPresent());
        modalView.isCerrarButtonVisible();

    }

    @When("^Click on the 'Close' button on modal 'Ver asignación'$")
    public void click_on_the_Close_button_on_modal_Ver_asignación() throws Throwable {
        modalView.clickclose();
    }

    @Then("^The modal 'Ver asignación' closes$")
    public void the_modal_Ver_asignación_closes() throws Throwable {
        Assert.assertTrue(assignment.isButtonSeePresent());
    }

    @When("^I reopen the modal 'Ver asignación' on 'Asignación de equipos' page$")
    public void i_reopen_the_modal_Ver_asignación_on_Asignación_de_equipos_page() throws Throwable {
        modalView = assignment.clicViewModal();
        modalView.isCloseXButtonVisible();
    }

    @When("^Click on the 'X' button on modal 'Ver asignación'$")
    public void click_on_the_X_button_on_modal_Ver_asignación() throws Throwable {
        modalView.clickCloseX();
    }

    @Then("^The modal 'Ver asignacion' closes$")
    public void the_modal_Ver_asignacion_closes() throws Throwable {
        Assert.assertTrue(assignment.isButtonSeePresent());
    }
    @When("^Obtain the total of assignments made to the employee$")
    public void obtain_the_total_of_assignments_made_to_the_employee() throws Throwable {
        modalDelete.isDeleteButtonPresent();
        modalDelete.isListPresent();
        countAssignments = modalDelete.getSizeAssignments();
    }

    @When("^Click on the dumpster button to remove the assignment on the modal 'Editar Asignacion'$")
    public void click_on_the_dumpster_button_to_remove_the_assignment_on_the_modal_Editar_Asignacion() throws Throwable {
        modalDelete.deleteOnEditForm();
    }

    @When("^The modal 'Confirmar eliminacion' is displayed$")
    public void the_modal_Confirmar_eliminacion_is_displayed() throws Throwable {
        Assert.assertTrue(modalDelete.isConfirmModalPresent(), "El modal 'Confirmar eliminacion' no se desplego");
    }

    @When("^Click on the 'Aceptar' button, on the modal 'Confirmar eliminacion'$")
    public void click_on_the_Aceptar_button_on_the_modal_Confirmar_eliminacion() throws Throwable {
        modalDelete.acceptDelete();
    }

    @And("^The message 'La asignacion se elimino correctamente' is displayed$")
    public void the_message_La_asignacion_se_elimino_correctamente_is_displayed() throws Throwable {
        modalDelete.messageDelete();
    }

    @Then("^The assignment is not present in the in the list of assignments made$")
    public void the_assignment_is_not_present_in_the_in_the_list_of_assignments_made() throws Throwable {
        modalDelete = assignment.clicViewModal();
        modalDelete.isDeleteButtonPresent();
        int assignments = countAssignments - 1;
        Assert.assertEquals(modalDelete.getSizeAssignments(), assignments, "La asignacion no fue eliminada");
    }

    @And("^I close edit modal$")
    public void i_close_edit_modal() throws Throwable {
        modalDelete.closeEditModal();
    }
}