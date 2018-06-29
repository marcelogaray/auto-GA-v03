package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHEquipmentType extends BasePage {

    @FindBy(name = "equipmentType")
    private WebElement viewButton;

    @FindBy(name = "new_register")
    private WebElement newRegister;

    @FindBy(name = "description")
    private WebElement equipmentTypeDescription;

    @FindBy(name = "create")
    private WebElement createEquipmetType;

    @FindBy(name = "cancel")
    private WebElement cancelEquipmentType;

    public void isViewButtonVisible() {
        CommonEvents.waitWebElementIsVisible(viewButton);
    }

    public void clickViewEquipmentType() {
        CommonEvents.clickButton(viewButton);
    }

    public SHEquipmentTypeForm clickNewRegister() {
        CommonEvents.clickButton(newRegister);
        return new SHEquipmentTypeForm();
    }

    /*public void setData() {

//        String name = PropertyAccessor.getInstance().getSHDataProperty("name");
        String description = PropertyAccessor.getInstance().getSHDataProperty("description");

        CommonEvents.setInputField(equipmentTypeDescription, description);
        CommonEvents.clickButton(createEquipmetType);*/

    }
}

