package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAssignation extends BasePage {

    @FindBy(name = "Assignation_equips")
    private WebElement AsignacionEquipos;

    @FindBy(id = "new_assignment")
    private WebElement new_assigment;

    @FindBy(xpath = "//*[@id=\"Assignation_equips\"]/div[2]/button")
    private WebElement close_modal;

    public SHAssignationModal ClickRegistarAccBtn() {
        CommonEvents.clickButton(new_assigment);
        return new SHAssignationModal();
    }
    public void Close(){
        CommonEvents.clickButton(close_modal);
    }

}
