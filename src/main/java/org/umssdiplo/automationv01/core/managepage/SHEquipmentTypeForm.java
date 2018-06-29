package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHEquipmentTypeForm extends BasePage{
    @FindBy(name = "name")
    private WebElement equipmentTypeName;

    @FindBy(name = "description")
    private WebElement equipmentTypeDescription;

    @FindBy(name = "create")
    private WebElement createEquipmetType;

    @FindBy(name = "cancel")
    private WebElement cancelEquipmentType;

    public void isCancelButtonVisible() {
        CommonEvents.waitWebElementIsVisible(cancelEquipmentType);
    }


    public void setNameField(){
        CommonEvents.setInputField(equipmentTypeName, "TipoEquipo");
    }
    public void setDescriptionField(){
        CommonEvents.setInputField(equipmentTypeDescription, "Descripcion");
    }

    public void setData() {

//        String name = PropertyAccessor.getInstance().getSHDataProperty("name");
        String description = PropertyAccessor.getInstance().getSHDataProperty("description");
        isCancelButtonVisible();
        CommonEvents.setInputField(equipmentTypeDescription, description);
        CommonEvents.clickButton(createEquipmetType);


    }
}
