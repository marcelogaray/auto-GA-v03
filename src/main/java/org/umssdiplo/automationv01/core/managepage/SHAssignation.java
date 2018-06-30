package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class SHAssignation extends BasePage {
    @FindBy(name = "assignment_button")
    private WebElement assignmentTab;

    @FindBy(name = "new_assignment")
    private WebElement addAssignmentButton;

    @FindBy(name = "save")
    private WebElement acceptNewAssignment;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
    private WebElement Ok;

    @FindBy(name = "employee")
    private WebElement employeeKeyElement;

    @FindBy(name = "equipment")
    private WebElement equipmentKeyElement;

    @FindBy(name = "observations")
    private WebElement observationsElement;

    @FindBy(id = "mat-dialog-0")
    private WebElement employeeOption;

    @FindBy(name = "view_assignment")
    private WebElement viewAssignment;

    @FindBy(className = "mat-list")
    private WebElement equipmentAssignment;

    @FindBy(className = "mat-list")
    private List<WebElement> employeeWithassignments;

    public  boolean assignationIsPresent(){
        return viewAssignment.isEnabled();
    }

}