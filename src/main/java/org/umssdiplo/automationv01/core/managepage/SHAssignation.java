package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHAssignation extends BasePage {
    @FindBy(name = "assignment_button")
    private WebElement assignmentTab;

    @FindBy(name = "new_assignment")
    private WebElement addAssignmentButton;

    @FindBy(name = "save")
    private WebElement acceptNewAssignment;

    @FindBy(className = "swal2-confirm swal2-styled")
    private WebElement Ok;

    @FindBy(name = "employee")
    private WebElement employeeKeyElement;
    @FindBy(name = "equipment")
    private WebElement equipmentKeyElement;
    @FindBy(name = "observations")
    private WebElement observationsElement;

    @FindBy(id = "mat-dialog-0")
    private WebElement employeeOption;
    @FindBy(id= "mat-option-13")
    private WebElement employeeSelect;

    @FindBy(id = "mat-dialog-0")
    private WebElement equipmentOption;
    @FindBy(id = "mat-option-0")
    private WebElement equipmentSelect;



    public void NuevaAsignacion(){
        CommonEvents.clickButton(addAssignmentButton);
    }
    public void setData() {
        String observations = PropertyAccessor.getInstance().getSHDataProperty("observations");
        CommonEvents.jsClickElement(employeeKeyElement);
        CommonEvents.jsClickElement(employeeSelect);

        CommonEvents.jsClickElement(equipmentKeyElement);
        CommonEvents.jsClickElement(equipmentSelect);
        CommonEvents.setInputField(observationsElement, observations);
    }
    public void registerNewAssignment(){
        CommonEvents.jsClickElement(acceptNewAssignment);
    }
    public void registeredAssignment(){
        CommonEvents.jsClickElement(Ok);
    }
}

