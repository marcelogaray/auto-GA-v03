package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignation extends BasePage {

    @FindBy(name = "edit_assignment")
    private WebElement buttonEditModal;


    public void isEditButtonVisible() {
        CommonEvents.waitWebElementIsVisible(buttonEditModal);
    }
    public SHAssignModalEdit clickEditModal(){
        isEditButtonVisible();
        CommonEvents.clickButton(buttonEditModal);
        return new SHAssignModalEdit();
    }
}