package org.umssdiplo.automationv01.core.managepage.smartHouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccident extends BasePage {
    @FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/a[2]")
    private WebElement accidentbtn;
    @FindBy(xpath = "//*[@id=\"mat-dialog-title-1\"]/div[2]/button")
    private WebElement accFormClosBtn;
    @FindBy(xpath = "/html/body/app-root/app-accident/div/div/a")
    private WebElement registrarAccidente;

    @FindBy(id = "mat-dialog-0")
    private WebElement accidenteForm;

    @FindBy(name = "title")
    private WebElement titulo;

    public void accidentFomDeploy() {
        CommonEvents.clickButton(accidentbtn);
        CommonEvents.clickButton(registrarAccidente);
        CommonEvents.isVisible(accidenteForm);
        CommonEvents.clickButton(accFormClosBtn);
    }


    public void accesTabAccidents() {
        CommonEvents.clickButton(accidentbtn);
    }

    public void clickRegistarAccidente() {
        CommonEvents.clickButton(registrarAccidente);

    }

    public boolean verifyRegistroAccidente() throws Exception {
        try {
            CommonEvents.isVisible(accidenteForm);
            return true;

        } catch (Exception ex) {
            return false;
        }

    }

    public void setFormData() {
        CommonEvents.setInputField(titulo, "esto es titulo");
    }

}
