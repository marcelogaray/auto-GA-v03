package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHAccident extends BasePage {
    @FindBy(id = "RegistrarAccidente")
    private WebElement registrarAccBtn;
    @FindBy(xpath = "/html/body/app-root/app-accident/div/div/div[2]/div/mat-list/mat-list-item[2]/div/div[2]/h3")
    private WebElement nuevoRegistro;

    public SHAccidentFomModal ClickRegistarAccBtn() {
        if (CommonEvents.isClickable(registrarAccBtn)) {
            CommonEvents.clickButton(registrarAccBtn);
        }
        return new SHAccidentFomModal();
    }

    public boolean isAccientePresent() {
        return CommonEvents.isPresent(nuevoRegistro);
    }


}
