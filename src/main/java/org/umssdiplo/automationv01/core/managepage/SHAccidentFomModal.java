package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccidentFomModal extends BasePage {

    /**
     * dialog that contains form
     */
    @FindBy(id = "mat-dialog-1")
    private WebElement modalDialog;

    /**
     * buttons form the dialog
     */
    @FindBy(id = "btnClose")
    private WebElement closeBtn;

    @FindBy(xpath = "//*[@id='mat-dialog-1']/app-accident-new-form/form/mat-dialog-actions/button[2]")
    private WebElement crearBtn;

    @FindBy(id = "btnCancel")
    private WebElement cancelBtn;

    /**
     * fields from the dialog
     */
    @FindBy(name = "employee")
    private WebElement employeeAuto;
    @FindBy(id = "mat-option-19")
    private WebElement employeeOption;
    @FindBy(name = "title")
    private WebElement title;
    @FindBy(name = "code")
    private WebElement code;
    @FindBy(name = "levelRisk")
    private WebElement levelRisk;
    @FindBy(name = "accidentTypeKey")
    private WebElement accidentTypeSelect;
    @FindBy(id = "mat-option-2")
    private WebElement accidentTypeOption1;
    @FindBy(id = "mat-option-105")
    private WebElement accidentTypeOption2;
    @FindBy(id = "mat-option-124")
    private WebElement accidentTypeOption3;
    @FindBy(name = "dateEvent")
    private WebElement dateEvent;
    @FindBy(name = "describeIssue")
    private WebElement description;
    @FindBy(name = "status")
    private WebElement statusSelect;
    @FindBy(id = "mat-option-0")
    private WebElement statusOption;

    /**
     * returns true if modal dialog is displayed
     */
    public boolean isModalDialogPresent() {
        boolean resp;
        resp = modalDialog.isDisplayed();
        return resp;
    }

    /**
     * make click  into employee autocomplete field
     * and select one option
     */
    public void setEmployeeField() {
        CommonEvents.jsClickElement(employeeAuto);
        CommonEvents.jsClickElement(employeeOption);

    }

    /**
     * set title field
     */
    public void setTitleField() {
        CommonEvents.setInputField(title, "Titulo Accidente");
    }

    /**
     * set code field
     */
    public void setCodeField() {
        CommonEvents.setInputField(code, "Codigo");
    }

    /**
     * set levelRisk field
     */
    public void setLevelRiskField() {
        CommonEvents.setInputField(levelRisk, "1");
    }

    /**
     * set dateEvent field
     */
    public void setDateEventField() {
        CommonEvents.setDateInputField(dateEvent, "5-5-2018");
    }

    /**
     * set Description field
     */
    public void setDescriptionField() {
        CommonEvents.setInputField(description, "Descripcion");
    }

    /**
     * make click on "Crear" button form "Registrar acciennte" Form Modal
     */
    public void clickBtnCrear() {
        CommonEvents.jsClickElement(crearBtn);
    }

    /**
     * click on AccidentType Material Select attribute
     * then select one opcion depends on if option that is ramdon generate is present
     */
    public void setAccidentTypeSelectField() {
        CommonEvents.jsClickElement(accidentTypeSelect);
        if (CommonEvents.isPresent(accidentTypeOption1)) {
            CommonEvents.jsClickElement(accidentTypeOption1);
        } else if (CommonEvents.isPresent(accidentTypeOption2)) {
            CommonEvents.jsClickElement(accidentTypeOption2);
        } else if (CommonEvents.isPresent(accidentTypeOption3)) {
            CommonEvents.jsClickElement(accidentTypeOption3);
        }
    }

    /**
     * click on status Material Select attribute
     * select one option
     */

    public void setStatusSelectField() {

        CommonEvents.jsClickElement(statusSelect);
        CommonEvents.jsClickElement(statusOption);
    }

    /**
     * fill the modal form with full data
     */
    public void fillModalFomFullData() {
        setEmployeeField();
        setTitleField();
        setCodeField();
        setLevelRiskField();
        setDateEventField();
        setDescriptionField();
        setStatusSelectField();
        setAccidentTypeSelectField();
    }

    /**
     * fill the modal form without accidettype field
     */
    public void fillModalFomWithoutFullData() {
        setEmployeeField();
        setTitleField();
        setCodeField();
        setLevelRiskField();
        setDateEventField();
        setDescriptionField();
        setStatusSelectField();
    }

    /**
     * fill the modal form with only one field( employee)
     */
    public void fillModalFomWithOneData() {
        setEmployeeField();
    }

    /**
     * veryfy is "disabled" attribute is present
     * on "crear" button form Modal Form "Registrar Accidente"
     * returns true if attribuite is present
     * returns false is attribute is not present
     */
    public boolean isCrearBtnEnable() {
        return CommonEvents.isAttributPresent(crearBtn, "disabled");
    }
}
