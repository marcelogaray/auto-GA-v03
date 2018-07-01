package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHEquiposSegu extends BasePage {

    @FindBy(id = "nuevo_equipo")
    private WebElement registrarEquipoBtn;

    @FindBy(id = "crear")
    private WebElement crearEquipoBtn;

    public SHEquiposSegu() {
        CommonEvents.isClickable(registrarEquipoBtn);
    }

    public  SHEquiposSegurModal ClickRegistarEquipoBtn() {
        CommonEvents.clickButton(registrarEquipoBtn);
        return new SHEquiposSegurModal();
    }

    public SHEquiposSegurModal ClickCrear(){
        CommonEvents.clickButton(crearEquipoBtn);
        return new SHEquiposSegurModal();
    }

}
