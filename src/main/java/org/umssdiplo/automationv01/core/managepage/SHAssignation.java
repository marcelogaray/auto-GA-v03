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

    @FindBy(id = "mat-option-13")
    private WebElement employeeSelect;

    @FindBy(id = "mat-dialog-0")
    private WebElement equipmentOption;

    @FindBy(id = "mat-option-100")
    private WebElement equipmentSelect;

    @FindBy(name = "logout_button")
    private WebElement logOut;

    @FindBy(name = "view_assignment")
    private WebElement viewAssignment;

    public void isCrearButtonVisible() {
        CommonEvents.waitWebElementIsVisible(acceptNewAssignment);
    }

    public void isViewButtonVisible() {
        CommonEvents.waitWebElementIsVisible(viewAssignment);
    }

    public boolean isCrearButtonEnabled() {
        acceptNewAssignment.isEnabled();
        return isCrearButtonEnabled();
    }





    public boolean assignationIsPresent() {
        isViewButtonVisible();
        return viewAssignment.isEnabled();
    }


    @FindBy(name = "view_assignment")
    private WebElement view_assignmentElement;


    @FindBy(name = "delete_assignment")
    private WebElement deleteElement;

    @FindBy(name = "edit_assignment")
    private WebElement buttonEditModal;
    @FindBy(name = "logout_button")
    private WebElement logOut;
    public void isEditButtonVisible() {
        CommonEvents.waitWebElementIsVisible(buttonEditModal);
    }


    public SHAssignModalDelete clicViewModal (){
        CommonEvents.clickButton(deleteElement);
        return new SHAssignModalDelete();
    }
    public SHAssignModalDelete clicViewModalDelete() {
        CommonEvents.clickButton(deleteElement);
        return new SHAssignModalDelete();
    }





    public void newAssignment() {
        CommonEvents.clickButton(addAssignmentButton);
    }

    public void setData() {
        String observations = PropertyAccessor.getInstance().getSHDataProperty("observations");
        isCrearButtonVisible();
        CommonEvents.jsClickElement(employeeKeyElement);
        CommonEvents.jsClickElement(employeeSelect);
        CommonEvents.jsClickElement(equipmentKeyElement);
        CommonEvents.jsClickElement(equipmentSelect);
        CommonEvents.setInputField(observationsElement, observations);
    }

    public void registerNewAssignment() {

        CommonEvents.jsClickElement(acceptNewAssignment);
    }

    public void registeredAssignment() {

        CommonEvents.jsClickElement(Ok);
    }


    public boolean isButtonSeePresent() {
        return view_assignmentElement.isDisplayed();
    }
    @FindBy(name = "closeX")
    private WebElement closeX;

    public SHAssignModalView clicViewModal (){
        CommonEvents.clickButton(view_assignmentElement);
        return new SHAssignModalView();
    }
    public SHAssignModalEdit clickEditModal() {
        isEditButtonVisible();
        CommonEvents.clickButton(buttonEditModal);
        return new SHAssignModalEdit();
    }

    public void isLogoutButtonVisible() {
        CommonEvents.waitWebElementIsVisible(logOut);
    }

    public void logOutSystem() {
        isLogoutButtonVisible();
        CommonEvents.clickButton(logOut);
    }
}