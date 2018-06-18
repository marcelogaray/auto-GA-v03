package org.umssdiplo.automationv01.core.managepage.Accidente;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Accidente extends BasePage {
    @FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/a[2]")
    private WebElement accidentbtn;
    @FindBy(xpath = "//*[@id=\"mat-dialog-title-1\"]/div[2]/button")
    private WebElement accFormClosBtn;
    @FindBy(id = "RegistrarAccidente")
    private WebElement registrarAccidente;
    @FindBy(xpath = "//*[@id=\"mat-dialog-1\"]/app-accident-new-form/form/mat-dialog-actions/button[2]")
    private WebElement crearbtn;

    @FindBy(id = "mat-dialog-0")
    private WebElement accidenteForm;
    @FindBy(name = "employee")
    private WebElement employee;
    @FindBy(name = "title")
    private WebElement titulo;
    @FindBy(name = "code")
    private WebElement codigo;
    @FindBy(name = "levelRisk")
    private WebElement nivelriesgo;
    @FindBy(name = "dateEvent")
    private WebElement fecha;
    @FindBy(name = "describeIssue")
    private WebElement descripcion;

    @FindBy(name = "status")
    private WebElement statusSelect;
    @FindBy(xpath = "//*[@id=\"mat-option-0\"]")
    private WebElement starusOption;
    @FindBy(name = "accidentTypeKey")
    private WebElement tipoAccidenteSelect;
    ////*[@id="mat-select-0"]/div/div[1]
    @FindBy(id = "mat-option-2")
    private WebElement tipoAccidenteOption;

    public void accidentFomDeploy() {
        CommonEvents.clickButton(accidentbtn);
        CommonEvents.clickButton(registrarAccidente);
        // boolean d = CommonEvents.isAttribtuePresent(crearbtn,"disabled");
        //setFormFullData();
        //CommonEvents.clickButton(accFormClosBtn);
    }


    public void setFormFullData() {
        String employeeAc = PropertyAccessor.getInstance().getSHDataProperty("employeeAC");
        String tituloAc = PropertyAccessor.getInstance().getSHDataProperty("titleAC");
        String codigoAc = PropertyAccessor.getInstance().getSHDataProperty("codigoAC");
        String levelRiskAc = PropertyAccessor.getInstance().getSHDataProperty("levelRiskAC");
        String fechaAC = PropertyAccessor.getInstance().getSHDataProperty("dateEventAC");
        String descAc = PropertyAccessor.getInstance().getSHDataProperty("describeIssueAC");
        CommonEvents.setInputField(employee, employeeAc);


        CommonEvents.setInputField(titulo, tituloAc);
        CommonEvents.setInputField(codigo, codigoAc);
        CommonEvents.setInputField(nivelriesgo, levelRiskAc);
        CommonEvents.setInputField(fecha, fechaAC);
        CommonEvents.setInputField(descripcion, descAc);


        CommonEvents.jsClickElement(statusSelect);
        CommonEvents.jsClickElement(starusOption);

        CommonEvents.jsClickElement(tipoAccidenteSelect);
        CommonEvents.jsClickElement(tipoAccidenteOption);
        //CommonEvents.clickButton(crearbtn);
        //String resp = CommonEvents.isEnable(crearbtn,"ng-reflect-disabled");
        //CommonEvents.isVisible(crearbtn);

    }

}
