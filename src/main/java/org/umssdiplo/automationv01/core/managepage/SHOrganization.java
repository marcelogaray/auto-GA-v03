package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHOrganization extends BasePage {
    @FindBy(name = "org_1")
    private WebElement organizationDetailButton;

    @FindBy(name = "newItem_button")
    private WebElement newItemButton;

    @FindBy(id = "swal2-content")
    private WebElement messageAlert;

    @FindBy(name = "code")
    private WebElement codeFieldInputElement;

    @FindBy(name = "cityKey")
    private WebElement citySelectElement;

    @FindBy(id = "mat-option-156")
    private WebElement cityOptionElement;

    @FindBy(name = "positionKey")
    private WebElement positionSelectElement;

    @FindBy(id = "mat-option-5")
    private WebElement positionOptionElement;

    @FindBy(name = "salaryScaleKey")
    private WebElement salarialScaleSelectElement;

    @FindBy(id = "mat-option-10389")
    private WebElement salarialScaleOptionElement;

    @FindBy(name = "typeContractKey")
    private WebElement typeContractSelectElement;

    @FindBy(id = "mat-option-0")
    private WebElement typeContractOptionElement;

    @FindBy(name = "save_new_item")
    private WebElement saveItemButton;

    @FindBy(xpath = ".//h3[contains(text(),'ITM-050')]")
    private WebElement newItem;

    @FindBy(className = "swal2-confirm")
    private WebElement acceptButtonMessageConfirmation;

    public void openActiveOrganizationDetailView() {
        CommonEvents.clickButton(organizationDetailButton);
    }

    public void clickNewItemButton() {
        CommonEvents.clickButton(newItemButton);
    }

    public void clickSaveItemButton() {
        CommonEvents.clickButton(saveItemButton);
    }

    private void setCodeInputField() {
        CommonEvents.setInputField(codeFieldInputElement, PropertyAccessor.getInstance().getNewItemCode());
    }

    private void clickPositionSelectElement() {
        CommonEvents.clickButton(positionSelectElement);
    }

    private void clickPositionOptionElement() {
        CommonEvents.clickButton(positionOptionElement);
    }

    private void clickSalaryScaleSelectElement() {
        CommonEvents.clickButton(salarialScaleSelectElement);
    }

    private void clickSalaryScaleOptionElement() {
        CommonEvents.clickButton(salarialScaleOptionElement);
    }

    private void clickTypeContractSelectElement() {
        CommonEvents.clickButton(typeContractSelectElement);
    }

    private void clickTypeContractOptionElement() {
        CommonEvents.clickButton(typeContractOptionElement);
    }

    private void clickCitySelectElement() {
        CommonEvents.clickButton(citySelectElement);
    }

    private void clickCityOptionElement() {
        CommonEvents.clickButton(cityOptionElement);
    }

    public void clickAcceptButtonMessage() {
        CommonEvents.clickButton(acceptButtonMessageConfirmation);
    }

    public boolean isNewItemVisible() {
        return CommonEvents.isVisible(newItem);
    }

    public String getAlertMessage() {
        return CommonEvents.getTextContent(messageAlert);
    }

    public String getMessageItemCreated() {
        return PropertyAccessor.getInstance().getMessageItemCreated();

    }

    public void fillNewItemForm() {
        setCodeInputField();
        clickCitySelectElement();
        clickCityOptionElement();
        clickPositionSelectElement();
        clickPositionOptionElement();
        clickSalaryScaleSelectElement();
        clickSalaryScaleOptionElement();
        clickTypeContractSelectElement();
        clickTypeContractOptionElement();
    }
}