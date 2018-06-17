package org.umssdiplo.automationv01.core.managepage.Accidente;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Accidente extends BasePage {
    @FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/a[4]")
    private WebElement accidentbtn;
    @FindBy(xpath = "/html/body/app-root/app-accident/div/div/a")
    private WebElement registrarAccidente;

    @FindBy(id = "mat-dialog-0")
    private WebElement accidenteForm;

    @FindBy(name = "title")
    private WebElement titulo;

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
