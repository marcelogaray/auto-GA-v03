package org.umssdiplo.automationv01.core.managepage.smartHouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHAssignment extends BasePage {
    @FindBy(name = "assignment_button")
    private WebElement assignmentTab;

    @FindBy(name = "new_assignment")
    private WebElement addAssignmentButton;

    @FindBy(name = "save_assignment_button")
    private WebElement acceptNewAssignment;

    @FindBy(name = "employeeKey")
    private WebElement employeeKeyElement;
    @FindBy(name = "equipmentKey")
    private WebElement equipmentKeyElement;
    @FindBy(name = "observations")
    private WebElement observationsElement;

    @FindBy(xpath = "//*[@id=\"mat-option-4\"]")
    private WebElement employeeOption;
    @FindBy(xpath = "/html/body/app-root/app-assignmentform/form/mat-card/mat-list/mat-list-item[1]/div/mat-input-container/div/div[1]/div")
    private WebElement employeeSelect;

    @FindBy(xpath = "//*[@id=\"mat-option-3\"]")
    private WebElement equipmentOption;
    @FindBy(xpath = "/html/body/app-root/app-assignmentform/form/mat-card/mat-list/mat-list-item[4]/div/mat-input-container/div/div[1]/div")
    private WebElement equipmentSelect;


    public void NuevaAsignacion(){
        CommonEvents.clickButton(addAssignmentButton);
    }
    public void setDatos() {

        CommonEvents.jsClickElement(employeeSelect);
        CommonEvents.jsClickElement(employeeOption);
        CommonEvents.jsClickElement(equipmentSelect);
        CommonEvents.jsClickElement(equipmentOption);
        String observations = PropertyAccessor.getInstance().getSHDataProperty("observations");
    }

    public void registrarNuevaAsignacion(){
        CommonEvents.clickButton(acceptNewAssignment);
    }

}