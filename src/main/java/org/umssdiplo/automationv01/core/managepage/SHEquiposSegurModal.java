package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SHEquiposSegurModal extends BasePage {

    //############### Nuevo Registro de equipos  #################
    @FindBy(id = "mat-dialog-1")
    private WebElement modalDialog;

    @FindBy(id = "eqiposIndumentarias1")
    private WebElement EquiposIndumentarias;

    @FindBy(id = "TipoEquipo1")
    private WebElement ClicTiopoEquipo;
    @FindBy(id = "mat-option-2")
    private WebElement OptionTipoEquipo;

    @FindBy(id = "EstadoEquipo1")
    private WebElement ClicEstadoEquipo;
    @FindBy(id = "mat-option-0")
    private WebElement OptionEstadoEquipo;

    @FindBy(id = "Descripcion")
    private WebElement Descipcion;

    @FindBy(id = "crear")
    //*[@id="crear"]/button
    private WebElement crearEquipoBtn;

    //############################ Ver Tipos De Equipos Registrados #################################

    @FindBy(id = "TipoEquipoIndumentaria")
    private WebElement TipoEquipoIndumentaria;

    @FindBy(id = "TipoDescripcion")
    private WebElement TipoDescripcion;


    //######################## Metodos de Nuevo Registro de Equipos #################################

    public boolean isCrearBtnEnable() {
        return CommonEvents.isClickable(crearEquipoBtn);

    }

    public void setEquiposIndumentarias() {CommonEvents.setInputField(EquiposIndumentarias, "casco duro"); }

    public void setTipoEquipo() {
        CommonEvents.jsClickElement(ClicTiopoEquipo);
        CommonEvents.jsClickElement(OptionTipoEquipo);
    }

    public void setEstadoEquipo() {
        CommonEvents.jsClickElement(ClicEstadoEquipo);
        CommonEvents.jsClickElement(OptionEstadoEquipo);
    }
    public void setDescripcion() {CommonEvents.setInputField(Descipcion, "este casco es de alta resistencia"); }

    public void fillModalFomOneIncData() {
        setEquiposIndumentarias();
        setTipoEquipo();
        setEstadoEquipo();
        setDescripcion();
    }
    //########################### Metodos Ver Tipos De Equipos Registrados ############################

    public void setTipoEquipoIndumentaria() {CommonEvents.setInputField(TipoEquipoIndumentaria, "guante Cuero"); }

    public void setTipoDescripcion() {CommonEvents.setInputField(TipoDescripcion, "este guante es de alta resistencia"); }

    public void fillModalTipoEquipo() {
        setTipoEquipoIndumentaria();
        setTipoDescripcion();
    }


}
