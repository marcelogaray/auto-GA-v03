package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccidentEditFormModal extends BasePage {

    @FindBy(id = "editAccidentTitle")
    private WebElement editTitleModal;

    @FindBy(id = "save")
    private WebElement saveButton;

    @FindBy(name = "title")
    private WebElement title;

    @FindBy(name = "code")
    private WebElement code;

    @FindBy(name = "levelRisk")
    private WebElement levelRisk;

    @FindBy(name = "describeIssue")
    private WebElement description;

    public boolean isEditModalPresent() {
        return editTitleModal.isDisplayed();
    }

    public void setTitleField() {
        CommonEvents.setInputField(title, "Titulo Accidente 2");
    }

    public void setCodeField() {
        CommonEvents.setInputField(code, "Codigo 2");
    }

    public void setLevelRiskField() {
        CommonEvents.setInputField(levelRisk, "2");
    }

    public void setDescriptionField() {
        CommonEvents.setInputField(description, "Descripcion 2");
    }

    public SHAccident clickSaveButton() {
        CommonEvents.waitUntil(2000);
        CommonEvents.clickButton(saveButton);
        return new SHAccident();
    }

    public void fillEditModalForm() {
        setTitleField();
        setCodeField();
        setLevelRiskField();
        setDescriptionField();
    }

    public String getTitleValue() {
        return title.getAttribute("value");
    }

    public String getCodeValue() {
        return code.getAttribute("value");
    }

    public String getLevelRiskValue() {
        return levelRisk.getAttribute("value");
    }

    public String getDescriptionValue() {
        return description.getAttribute("value");
    }
}