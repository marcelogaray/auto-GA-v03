package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHEquiposSegu extends BasePage {

    @FindBy(id = "nuevo_equipo")
    private WebElement registrarEquipoBtn;

    @FindBy(id = "crear")
    private WebElement crearEquipoBtn;

    @FindBy(id = "Show_tipo_equipos")
    private WebElement VerTipoEquipos;

    @FindBy(id = "Nuevo_Tipo_Equipo")
    private WebElement NuevoTipoEquipo;

    @FindBy(id = "creartipoEquipo")
    private WebElement CrearTipoEquipo;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
    private WebElement confirmacionTipoEquipo;

    @FindBy(xpath = "//*[@id=\"lista\"]/div/a[1]")
    private WebElement verButton;


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

    public  SHEquiposSegurModal ClickVerTiposEquiposRegistrados() {
        CommonEvents.clickButton(VerTipoEquipos);
        return new SHEquiposSegurModal();
    }

    public  SHEquiposSegurModal ClickNuevoTipoEquipo() {
        CommonEvents.clickButton(NuevoTipoEquipo);
        return new SHEquiposSegurModal();
    }
    public SHEquiposSegurModal ClickCrearTipoEquipo(){
        CommonEvents.clickButton(CrearTipoEquipo);
        return new SHEquiposSegurModal();
    }
    public SHEquiposSegurModal ClickconfirmacionTipoEquipo(){
        CommonEvents.clickButton(confirmacionTipoEquipo);
        return new SHEquiposSegurModal();
    }
    public SHEquiposSegurModalView clickVerButton(){
        CommonEvents.waitUntil(3000);
        CommonEvents.clickButton(verButton);
        return new SHEquiposSegurModalView();
    }
}
