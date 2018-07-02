package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.dataProviders.FileReaderManager;
import org.umssdiplo.automationv01.core.dataTypes.Employee;
import org.umssdiplo.automationv01.core.dataTypes.Organization;
import org.umssdiplo.automationv01.core.managepage.*;
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
    private SHOrganization organization;
    private SHEmployee employee;
    private SHNewEmployeeForm employeeForm;
    private Employee employeeData;
    private SHAssignation assignment;
    private SHAccident shAccident;
    private SHAccidentFormModal shAccidentFomModal;
    private SHSwalNotification shSwalNotification;
    private SHAccidentVieWmodal shAccidentVieWmodal;
    private SHAccidentEditFormModal shAccidentEditFormModal;
    private SHDeleteConfirmModal deleteConfirmModal;
    private SHViewAccident viewAccident;
    private int countAccident;
    private Organization organizationData;
    private SHAssignModalView modalView;
    private SHAssignModalDelete modalDelete;
    private int countAssignments;
    private SHAssignModalEdit modalEdit;
    private SHEquipmentType equipmentType;
    private SHAssignModalForm modalForm;

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

    @When("^Click on the dumpster button to remove the assignment on 'Asignacion de equipos' page$")
    public void click_on_the_dumpster_button_to_remove_the_assignment_on_Asignacion_de_equipos_page() throws Throwable {
        modalDelete = assignment.clicViewModalDelete();
    }

    @When("^Go to 'Asignacion de Equipos' on 'Header' page,assignments are listed$")
    public void go_to_Asignacion_de_Equipos_on_Header_page_assignments_are_listed() throws Throwable {
        assignment = headerWithLogin.clickAssignTab();
    }

    @When("^Click on the edit button to the first assignment on 'Asignacion de equipos' page$")
    public void click_on_the_edit_button_to_the_first_assignment_on_Asignacion_de_equipos_page() throws Throwable {
        modalEdit = assignment.clickEditModal();
    }

    @When("^The modal 'Editar Asignación' is displayed, with the list of assignments made to that employee$")
    public void the_modal_Editar_Asignación_is_displayed_with_the_list_of_assignments_made_to_that_employee() throws Throwable {
        Assert.assertTrue(modalEdit.isModalEditPresent());
    }

    @And("^Click on the edit button of one of the equipments assigned to that employee$")
    public void click_on_the_edit_button_of_one_of_the_equipments_assigned_to_that_employee() throws Throwable {
        modalEdit.clickAssignmentSpecific();
    }


    @When("^Click on the 'Aceptar' button, on the modal 'Confirmar eliminacion'$")
    public void click_on_the_Aceptar_button_on_the_modal_Confirmar_eliminacion() throws Throwable {
        modalDelete.acceptDelete();
    }

    @Then("^Se muestra el mensaje 'La asignacion se elimino correctamente'$")
    public void se_muestra_el_mensaje_La_asignacion_se_elimino_correctamente() throws Throwable {
        modalDelete.messageDelete();
    }

    @Then("^The assignment is not present in the in the list of assignments made$")
    public void the_assignment_is_not_present_in_the_in_the_list_of_assignments_made() throws Throwable {
        modalDelete = assignment.clicViewModalDelete();
        modalDelete.isDeleteButtonPresent();
        int assignments = countAssignments - 1;
        Assert.assertEquals(modalDelete.getSizeAssignments(), assignments, "La asignacion no fue eliminada");
    }

    @And("^I close edit modal$")
    public void i_close_edit_modal() throws Throwable {
        modalDelete.closeEditModal();
    }

    @When("^Click on the 'see' button of a registered assignment on 'Asignacion de Equipos' page$")
    public void click_on_the_see_button_of_a_registered_assignment_on_Asignacion_de_Equipos_page() throws Throwable {
        modalView = assignment.clicViewModal();
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
        modalDelete = assignment.clicViewModalDelete();
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
        login.clickLogOutButton();
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

    @When("^Go to 'Asignacion de Equipos' on 'Header' page$")
    public void go_to_Asignacion_de_Equipos_on_Header_page() throws Throwable {
        assignment = headerWithLogin.clickAssignTab();
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

    @And("^I select accident menu 'Accidentes'$")
    public void openRegisterModal() throws Throwable {
        shAccident = headerWithLogin.clickAccidentTab();
    }

    @And("^I click on 'Registrar accidente' button$")
    public void selectAccidentMenu() throws Throwable {
        shAccidentFomModal = shAccident.ClickRegistarAccBtn();
    }

    @And("^Close modal 'Registro de Accidente' from 'x' button$")
    public void closeModalAccidentRegister() throws Throwable {
        shAccidentFomModal.closeFromXButtonHeader();
    }

    @And("^Close modal 'Registro de Accidente' from 'Cancel' button$")
    public void closeModalAccidentRegisterFromCancel() throws Throwable {
        shAccidentFomModal.closeFromCancelButton();
    }

    @Then("^I verify if the modal is not present$")
    public void verifyModalNotPresent() throws Throwable {
        Assert.assertEquals(shAccident.isAccientePresent(), false, "Modal was not close");
    }

    @And("^click on 'Crear' button on modal 'Registro de Accidente'$")
    public void clickCreateButton() throws Throwable {
        shAccidentFomModal.clickCreateButton();
    }

    @When("^I click on edit button on list of accidents$")
    public void clickEditButton() throws Throwable {
        shAccidentEditFormModal = shAccident.clickEditButton();
    }

    @When("^I set empty value to field 'Titulo' on form edit modal$")
    public void setEmptyValueTitleField() throws Throwable {
        shAccidentEditFormModal.setTitleField();
    }

    @Then("^Verify if 'Guardar' button is disabled$")
    public void checkSaveButtonIsDisabled() throws Throwable {
        Assert.assertTrue(shAccidentEditFormModal.isSaveBtnEnable(), "El botón 'Guardar' no esta deshabilitado.");
    }

    @Then("^verify 'Empleado' show data employee from accident on 'Editar accidente'$")
    public void checkEmployeeValueAccident() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getEmployeeValue(), "1", "El dato empleado no " +
                "corresponde al registro seleccionado.");
    }

    @Then("^verify 'Título' show data title from accident on 'Editar accidente'$")
    public void checkTitleValueAccident() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getTitleValue(), "Titulo Accidente", "El dato de " +
                "titulo no corresponde al registro seleccionado.");
    }

    @Then("^verify 'Código' show data code from accident on 'Editar accidente'$")
    public void checkCodeValueAccident() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getCodeValue(), "Codigo", "El dato de " +
                "código no corresponde al registro seleccionado.");
    }

    @Then("^verify 'Nivel de riesgo' show data level risk from accident on 'Editar accidente'$")
    public void checkLevelRiskValueAccident() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getLevelRiskValue(), "1", "El dato de " +
                "nivel de riesgo no corresponde al registro seleccionado.");
    }

    @Then("^verify 'Tipo de accidente' show data type accident from accident on 'Editar accidente'$")
    public void checkTypeAccidentValue() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getAccidentTypeValue(), "1", "El dato de " +
                "nivel de riesgo no corresponde al registro seleccionado.");
    }

    @Then("^verify 'Fecha de suceso' show data success date from accident on 'Editar accidente'$")
    public void checkSuccessDateAccidentValue() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getDateEventValue(), "05-05-2018", "El dato de " +
                "fecha de suceso no corresponde al registro seleccionado.");
    }

    @Then("^verify 'Descripcion' show data description from accident on 'Editar accidente'$")
    public void checkDescriptionAccidentValue() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getDescriptionValue(), "Descripcion", "El dato de " +
                "descripción no corresponde al registro seleccionado.");
    }

    @Then("^verify 'Estado' show data state from accident on 'Editar accidente'$")
    public void checkStateAccidentValue() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getStatusValue(), "Estado", "El dato de " +
                "estado no corresponde al registro seleccionado.");
    }

    @Then("^verify that \"([^\"]*)\" is displayed in the 'Empleado' textfield on 'Editar accidente' modal page$")
    public void verifyThatIsDisplayedInTheEmpleadoTextfieldOnEditarAccidenteModalPage(String nameEmployee) throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getEmployeeValue(), nameEmployee, "El nombre del empleado no corresponde al registro seleccionado.");
    }

    @And("^I fill edit modal form 'Editar Accidente'$")
    public void fillEditModalForm() throws Throwable {
        shAccidentEditFormModal.fillEditModalForm();
    }

    @And("^click on 'Guardar' button on modal 'Editar Accidente'$")
    public void clickSaveEditModalForm() throws Throwable {
        shAccident = shAccidentEditFormModal.clickSaveButton();
    }

    @Then("^verify 'Título' show data title from accident on 'Editar accidente'$")
    public void checkTitleValueEditedAccident() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getTitleValue(), "Titulo Accidente 2", "El dato de " +
                "titulo no corresponde al registro editado seleccionado.");
    }

    @Then("^verify 'Código' show data code from accident on 'Editar accidente'$")
    public void checkCodeValueEditedAccident() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getCodeValue(), "Codigo 2", "El dato de " +
                "código no corresponde al registro editado seleccionado.");
    }

    @Then("^verify 'Nivel de riesgo' show data level risk from accident on 'Editar accidente'$")
    public void checkLevelRiskValueEditedAccident() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getLevelRiskValue(), "2", "El dato de " +
                "nivel de riesgo no corresponde al registro editado seleccionado.");
    }

    @Then("^verify 'Descripcion' show data description from accident on 'Editar accidente'$")
    public void checkDescriptionAccidentValueEdited() throws Throwable {
        Assert.assertEquals(shAccidentEditFormModal.getDescriptionValue(), "Descripcion 2", "El dato de " +
                "descripción no corresponde al registro editado seleccionado.");
    }


    @And("^I select accident option on menú$")
    public void selectAccidentTab() throws Throwable {
        shAccident = headerWithLogin.clickAccidentTab();
    }

    @When("^I click on accident delete option$")
    public void clickDeleteButton() throws Throwable {
        deleteConfirmModal = shAccident.clickDeleteButton();
    }

    @Then("^I verify if a confirm delete modal is opened$")
    public void verifyConfirmDeleteModal() throws Throwable {
        Assert.assertTrue(deleteConfirmModal.isModalDialogPresent(), "El modal de confirmación de eliminación " +
                "no ha sido desplegado");
    }

    @And("^I open Accident tab option$")
    public void openAccidentTab() throws Throwable {
        shAccident = headerWithLogin.clickAccidentTab();
    }

    @When("^I click on view icon$")
    public void clickViewIcon() throws Throwable {
        viewAccident = shAccident.clickViewButton();
    }

    @Then("^Verify if the employee value is correct$")
    public void verifyEmployeeValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getEmployeeValue(), "1", "El valor del empleado no es el correcto.");
    }

    @Then("^Verify if the title value is correct$")
    public void verifyTitleValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getTitleValue(), "Titulo Accidente", "El valor del título no es el correcto.");
    }

    @Then("^Verify if the code value is correct$")
    public void verifyCodeValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getCodeValue(), "Codigo", "El valor del código no es el correcto.");
    }

    @Then("^Verify if the level risk value is correct$")
    public void verifyLevelRiskValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getLevelRiskValue(), "1", "El valor del nivel de riesgo no es el correcto.");
    }

    @Then("^Verify if the accidentType value is correct$")
    public void verifyAccidentTypeValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getAccidentType(), "1", "El valor del tipo de accidente no es el correcto.");
    }

    @Then("^Verify if the date event value is correct$")
    public void verifyDateEventValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getDateEvent(), "2018-05-05T00:00:00.000+0000", "El valor de la fecha de suceso no es el correcto.");
    }

    @Then("^Verify if the description value is correct$")
    public void verifyDescriptionValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getDescription(), "Descripcion", "El valor de la descripcion no es el correcto.");
    }

    @Then("^Verify if the status value is correct$")
    public void verifyStatusValueIsCorrect() throws Throwable {
        Assert.assertEquals(viewAccident.getStatus(), "1", "El valor del estado no es el correcto.");
    }

    @And("^I click on 'Aceptar' button the accident selected is deleted$")
    public void clickConfirmButtonDeleteModal() throws Throwable {
        shAccident = deleteConfirmModal.clickDeleteButton();
    }

    @Then("^Verify the size of accident registers decrease in a one item$")
    public void compareListSize() throws Throwable {
        int result = countAccident - 1;
        Assert.assertEquals(shAccident.getSizeOfRegisters(), result, "No se elimino el registro seleccionado.");
    }

    @And("^go to 'Estructura Organizacional' on 'Header' page$")
    public void goToEstOrg() {
        organization = headerWithLogin.clickOrganizationTab();
    }

    @And("^click 'Detail' button on 'Gerencia General Enabled' option on 'Organization' page$")
    public void goToActiveArea() {
        organization.openActiveOrganizationDetailView();
    }

    @And("^click 'Nueva Area' button on 'Organization' page$")
    public void clickNewOrganization() {
        organization.openNewOrganizationModalForm();
    }

    @And("^fill 'New Organization' modal form on 'Organization' page with 'start date' biger than 'end date'$")
    public void fillFormOrganizationDataWithStartBigerEndDate() {
        organizationData = FileReaderManager.getInstance().getJsonReader().getOrganizationData("organization_ORG_Case7");
        organization.fillNewOrganizationForm(organizationData);
    }

    @And("^fill 'New Organization' modal form on 'Organization' page with property data$")
    public void fillFormOrganizationDataProperty() {
        organizationData = FileReaderManager.getInstance().getJsonReader().getOrganizationData("organization_ORG_Case10");
        organization.fillNewOrganizationFormCorrectly(organizationData);
    }

    @And("^click 'Crear' button on 'New Organization' modal on 'Organization' page$")
    public void clickCreateOrganizationButton() {
        organization.clickSaveOrganizationButton();
    }

    @Then("^'La fecha de inicio de actividades debe ser menor a la fecha final' information message should be displayed.$")
    public void idStartDateBiggerEndDate() {
        String expectedMessage = String.format("La fecha de inicio de actividades (%s) debe ser menor a la fecha final (%s).", organizationData.getInitDateActivitiesNewOrg(), organizationData.getEndDateActivitiesNewOrg());
        Assert.assertEquals(organization.getAlertMessage(), expectedMessage);
    }

    @And("^click 'Detail' button on 'Gerencia General' option on 'Organization' page$")
    public void goToArea() {
        organization.openOrganizationDetailView();
    }

    @And("^click 'Eliminar' button on 'Organization' page$")
    public void clickRemoveOrganizationButton() {
        organization.removeOrganization();
    }

    @Then("^'El area con id XX no puede eliminarse ya que tiene areas y/o empleados asignados' information message should be displayed$")
    public void areaWithEmployeeMessageIsDisplayed() {
        Assert.assertEquals(organization.getAlertMessage(), "El area con id 2 no puede eliminarse ya que tiene areas y/o empleados asignados.");
    }

    @And("^click 'Eliminar' button on 'Item ITM-001' element on 'Organization' page$")
    public void clickRemoveItemButton() {
        organization.removeItem();
    }

    @And("^click 'Cancelar' button on 'New Organization' modal form$")
    public void clickCancelNewOrganization() {
        organization.clickCancelNewOrganizationButton();
    }

    @And("^go to 'Home' on 'Header' page$")
    public void goToHome() {
        headerWithoutLogin.clickHomeTab();
    }

    @And("^click 'Detail' button on 'Gerencia General Disabled' option on 'Organization page'$")
    public void goToDisabledArea() {
        organization.openInactiveOrganizationDetailView();
    }

    @Then("^'Nueva Area' button is not present on 'Organization' page$")
    public void isNewOrganizationButtonNotPresent() {
        Assert.assertFalse(organization.isNewOrganizationButtonPresent(), "'New Organization' button is present.");
    }

    @Then("^'El item con id XX no puede eliminarse ya que se encuentra asignado a un empleado' information message should be displayed.$")
    public void itemWithEmployeeMessageIsDisplayed() {
        Assert.assertEquals(organization.getAlertMessage(), "El item con id 29 no puede eliminarse ya que se encuentra asignado a un empleado.");
    }

    @And("^click 'Eliminar' button on 'Organization' page.$")
    public void clickRemoveOrganizationButton2() {
        organization.removeOrganization2();
    }

    @And("^click 'Aceptar' button on 'Information Message' modal$")
    public void clickOkButtonMessageConfirmation() {
        organization.clickOkButtonMessageAlert();
    }

    @Then("^the area should not be present in the list$")
    public void isAreaDeletedPresente() {
        Assert.assertFalse(organization.isOrganizationMaktDetailButtonVisible(), "The Area was not be eliminated");
    }

    @And("^navigate to 'Gerencia General' option on 'Organization' page$")
    public void goToGGArea() {
        organization.openActiveOrganizationDetailView();
    }

    @And("^click 'Nuevo Item' button on 'Organization' page$")
    public void clickNuevoItemButton() {
        organization.clickNewItemButton();
    }

    @And("^fill 'New Item' modal form on 'Organization' page$")
    public void fillNewItemForm() {
        organization.fillNewItemForm("ITM-050");
    }

    @And("^click 'Crear' button on 'New Item' modal on 'Organization' page$")
    public void clickCrearItemButton() {
        organization.clickSaveItemButton();
    }

    @And("^verify 'El Item fue creado correctamente' message info is displayed on 'Organization' page$")
    public void verifyItemCreatedMessage() {
        Assert.assertEquals(organization.getAlertMessage(), "El Item fue creado correctamente");
    }

    @Then("^new item must be present in items list$")
    public void isPresentNewItem() {
        Assert.assertTrue(organization.isNewItemVisible(), "The new item is not present in the list items.");
    }

    @And("^verify 'El área fue creado correctamente' message info is displayed on 'Organization' page$")
    public void verifyOrgCreatedMessage() {
        Assert.assertEquals(organization.getAlertMessage(), "El área fue creado correctamente");
    }

    @And("^click 'Aceptar' button on 'Message Information' modal on 'Organization' page$")
    public void clickAceptarInformationMessageOrganization() {
        organization.clickAcceptButtonMessage();
    }

    @And("^click 'Aceptar' button on 'Message Information' modal on 'Employee Form' page$")
    public void clickAceptarInformationMessageEmployeeForm() {
        employeeForm.clickAcceptButtonMessage();
    }

    @Then("^the new area must be present in the areas list.$")
    public void isNewAreaPresent() {
        Assert.assertTrue(organization.isNewOrganizationVisible(), "The new organization is not present in the list.");
    }

    @When("^The modal 'Ver asignacion' is displayed that lists all the equipment that was assigned to that employee$")
    public void the_modal_Ver_asignacion_is_displayed_that_lists_all_the_equipment_that_was_assigned_to_that_employee() throws Throwable {
        Assert.assertTrue(modalView.isModalDialogPresent(), "el modal 'Ver asignacion' no se desplego correctamente");
        modalView.isButtonCloseVisible();
    }

    @Then("^Verify if the employee's name is correct$")
    public void verify_if_the_employee_s_name_is_correct() throws Throwable {
        Assert.assertEquals(modalView.getEmployeeName(), "EMP-14-David Justiniano Negrete López", "El nombre del empleado no es el esperado");
        modalView.closeModalView();
        Assert.assertTrue(modalView.isModalDialogPresent());
        modalView.isCerrarButtonVisible();

    }

    @Then("^Verify if the employee's name is correct in modal Edit assignment$")
    public void verify_if_the_employee_s_name_is_correct_in_modal_Edit_assignment() throws Throwable {
        Assert.assertEquals(modalEdit.getEmployeeName(), "EMP-14-David Justiniano Negrete López", "El nombre del empleado no coincide");
        modalEdit.closeModalEdit();
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
        modalDelete = assignment.clicViewModalDelete();
        modalDelete.isDeleteButtonPresent();
        int assignments = countAssignments - 1;
        Assert.assertEquals(modalDelete.getSizeAssignments(), assignments, "La asignacion no fue eliminada");
    }

    @And("^I close edit modal$")
    public void i_close_edit_modal() throws Throwable {
        modalDelete.closeEditModal();
    }

    @Given("^Click on 'Equipos de Seguridad' button on Header page$")
    public void click_on_Equipos_de_Seguridad_button_on_Header_page() throws Throwable {
        equipmentType = headerWithLogin.clickEquipmentTab();

    }

    @Given("^Click on the button 'Ver tipos de equipos registrados'$")
    public void click_on_the_button_Ver_tipos_de_equipos_registrados() throws Throwable {
        equipmentType.isViewButtonVisible();
        equipmentType.clickViewEquipmentType();
    }

    @Given("^Click on the button 'Nuevo registro'$")
    public void click_on_the_button_Nuevo_registro() throws Throwable {
        equipmentType.isVisibleViewList();
        equipmentType.clickRegisterNewEquipmentType();
    }

    @When("^required data is filled on 'Nuevo registro de tipo de equipo' modal form$")
    public void required_data_is_filled_on_Nuevo_registro_de_tipo_de_equipo_modal_form() throws Throwable {
        equipmentType.setData();
    }

    @When("^click on 'Crear' button on modal 'Nuevo registro de tipo de equipo'$")
    public void click_on_Crear_button_on_modal_Nuevo_registro_de_tipo_de_equipo() throws Throwable {
        equipmentType.clickButtonOk();
    }

    @Then("^verify new registered equipment type \"([^\"]*)\" is shown in equipment type page$")
    public void verify_new_registered_equipment_type_is_shown_in_equipment_type_page(String name) throws Throwable {
        Assert.assertTrue(equipmentType.verifyListEquipmentType(name), "No esta registrado");
    }


    @When("^Click on the 'Nueva asignación' button on 'Asignacion de equipos' page$")
    public void click_on_the_Nueva_asignación_button_on_Asignacion_de_equipos_page() throws Throwable {
        modalForm = assignment.clickFormModal();
    }

    @When("^The modal 'Asignar equipo' is displayed$")
    public void the_modal_Asignar_equipo_is_displayed() throws Throwable {
        Assert.assertTrue(modalForm.isFormModalPresent());
    }

    @When("^Just enter data in the 'Observaciones' field on the 'Asignar equipo' modal$")
    public void just_enter_data_in_the_Observaciones_field_on_the_Asignar_equipo_modal() throws Throwable {
        modalForm.setObservations();
    }

    @Then("^The 'Crear' button is not enabled on the 'Asignar equipo' modal$")
    public void the_Crear_button_is_not_enabled_on_the_Asignar_equipo_modal() throws Throwable {
        Assert.assertFalse(modalForm.isButtonCreateEnabled(), "Crear boton esta habilitado");

    }

    @And("Close the 'Asignar equipo' modal$")
    public void close_the_Asignar_equipo_modal() throws Throwable {
        modalForm.cancelAssignment();
    }
}