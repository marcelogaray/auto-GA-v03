package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccident extends BasePage {

    @FindBy(id = "RegistrarAccidente")
    private WebElement registrarAccBtn;

    @FindBy(xpath = "//*[@id=\"listAccidents\"]/div/a[1]")
    private WebElement viewButton;

    public SHAccidentFormModal clickRegistarAccBtn() {
        if (CommonEvents.isClickable(registrarAccBtn)) {
            CommonEvents.clickButton(registrarAccBtn);
        }
        return new SHAccidentFormModal();
    }

    public SHViewAccident clickViewButton() {
        CommonEvents.waitUntil(5000);
        if (CommonEvents.isClickable(viewButton)) {
            CommonEvents.clickButton(viewButton);
        }
        return new SHViewAccident();
    }
}
