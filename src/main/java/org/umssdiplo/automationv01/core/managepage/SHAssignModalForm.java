package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHAssignModalForm extends BasePage {
    @FindBy(id = "mat-dialog-1")
    private WebElement newFormModal;

    @FindBy(name = "observations")
    private WebElement observationsElement;

    @FindBy(name = "save")
    private WebElement createElement;

    @FindBy(name = "cancel")
    private WebElement cancelAssignmentElement;

    public boolean isFormModalPresent() {

        return newFormModal.isDisplayed();
    }

    public void setObservations(){
        String observations = PropertyAccessor.getInstance().getSHDataProperty("observations");
        CommonEvents.setInputField(observationsElement, observations);
    }

    public boolean isButtonCreateEnabled(){

        return createElement.isEnabled();
    }

    public void cancelAssignment(){

        CommonEvents.clickButton(cancelAssignmentElement);
    }
}