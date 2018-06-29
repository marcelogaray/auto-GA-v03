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

    @FindBy(name = "view")
    private WebElement viewEquipmentTypeList;

    @FindBy(name = "name")
    private WebElement equipmentTypeName;

    @FindBy(name = "description")
    private WebElement equipmentTypeDescription;

    @FindBy(name = "create")
    private WebElement createEquipmetType;

    @FindBy(name = "cancel")
    private WebElement cancelEquipmentType;

    @FindBy(xpath ="/html/body/div[2]/div/div[3]/button[1]")
    private WebElement buttonOk;

    public void isViewButtonVisible() {
        CommonEvents.waitWebElementIsVisible(viewButton);
    }
    public void isVisibleViewList() {
        CommonEvents.waitWebElementIsVisible(viewEquipmentTypeList);
    }

    public void clickViewEquipmentType() {
        CommonEvents.clickButton(viewButton);
    }
    public void clickRegisterNewEquipmentType(){
        CommonEvents.clickButton((newRegister));
    }
    public void isCreateButtonVisible() {
        CommonEvents.waitWebElementIsVisible(createEquipmetType);
    }

    public void setData() {

        String name = PropertyAccessor.getInstance().getSHDataProperty("name");
        String description = PropertyAccessor.getInstance().getSHDataProperty("description");
        isCreateButtonVisible();
        CommonEvents.setInputField(equipmentTypeName, name);
        CommonEvents.setInputField(equipmentTypeDescription, description);
        CommonEvents.clickButton(createEquipmetType);
    }

    public void clickButtonOk(){

        CommonEvents.clickButton(buttonOk);
    }
}


