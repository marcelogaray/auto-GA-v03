package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class SHAccident extends BasePage {

    @FindBy(id = "RegistrarAccidente")
    private WebElement registrarAccBtn;

    @FindBy(xpath = "//*[@id=\"listAccidents\"]/div/a[2]")
    private WebElement editButton;

    public SHAccident() {
        CommonEvents.isClickable(registrarAccBtn);
    }

    public SHAccidentFormModal ClickRegistarAccBtn() {
        CommonEvents.waitUntil(2000);
        CommonEvents.clickButton(registrarAccBtn);
        return new SHAccidentFormModal();
    }

    public SHAccidentEditFormModal clickEditButton() {
        CommonEvents.waitUntil(3000);
        CommonEvents.clickButton(editButton);
        return new SHAccidentEditFormModal();
    }
}