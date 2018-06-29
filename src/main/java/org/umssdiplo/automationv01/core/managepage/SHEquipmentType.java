package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHEquipmentType extends BasePage{

    @FindBy(name = "equipmentType")
    private WebElement viewButton;

    @FindBy(name = "new_register")
    private WebElement newRegister;

    public void isViewButtonVisible() {
        CommonEvents.waitWebElementIsVisible(viewButton);
    }

    public void clickViewEquipmentType(){
        CommonEvents.clickButton(viewButton);
    }
    public SHEquipmentTypeForm clickNewRegister() {
        CommonEvents.clickButton(newRegister);
        return new SHEquipmentTypeForm();
    }
}
