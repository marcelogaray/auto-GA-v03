package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.util.List;

public class SHEquipmentType extends BasePage {
    @FindBy(name = "equipmentType")
    private WebElement viewButton;

    @FindBy(name = "new_register")
    private WebElement newRegister;

    @FindBy(name = "view")
    private WebElement viewEquipmentTypeList;

    @FindBy(name = "name")
    private WebElement name;

    @FindBy(name = "description")
    private WebElement description;

    @FindBy(name = "create")
    private WebElement createEquipmetType;

    @FindBy(name = "cancel")
    private WebElement cancelEquipmentType;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
    private WebElement buttonOk;

    @FindBy(className = "mat-list-text")
    private WebElement equipmentTypeList;

    public void isViewButtonVisible() {
        CommonEvents.waitWebElementIsVisible(viewButton);
    }

    public void isVisibleViewList() {
        CommonEvents.waitWebElementIsVisible(viewEquipmentTypeList);
    }

    public void clickViewEquipmentType() {
        CommonEvents.clickButton(viewButton);
    }

    public void clickRegisterNewEquipmentType() {
        CommonEvents.clickButton((newRegister));
    }

    public void isCreateButtonVisible() {
        CommonEvents.waitWebElementIsVisible(createEquipmetType);
    }

    public void setNameField(String nameField) {
        CommonEvents.setInputField(name, nameField);
    }

    public void setDescriptionField(String descriptionField) {
        CommonEvents.setInputField(description, descriptionField);
    }

    public void setData(String name, String description) {
        setNameField(name);
        setDescriptionField(description);
        isCreateButtonVisible();
        CommonEvents.clickButton(createEquipmetType);
    }

    public void clickButtonOk() {

        CommonEvents.clickButton(buttonOk);
    }

    public boolean verifyListEquipmentType(String EqTypeName) {
        List<WebElement> elements = CommonEvents.findElementsClassName(equipmentTypeList);
        return CommonEvents.findWebElement(elements, EqTypeName).getText().equals(EqTypeName);
    }
}
