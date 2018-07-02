package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class HeaderWithLogin extends BasePage {

    @FindBy(name = "org_button")
    private WebElement organizationTab;

    @FindBy(name = "emp_button")
    private WebElement employeeTab;

    @FindBy(id = "accidentLink")
    private WebElement accidentsTab;

    @FindBy(name = "assignment_button")
    private WebElement assignTab;

    @FindBy(name = "equipment_button")
    private WebElement equipmentTab;

    public SHOrganization clickOrganizationTab() {
        CommonEvents.clickButton(organizationTab);
        return new SHOrganization();
    }

    public SHEmployee clickEmployeeTab() {
        CommonEvents.clickButton(employeeTab);
        return new SHEmployee();
    }

    public SHAccident clickAccidentTab() {
        CommonEvents.clickButton(accidentsTab);
        return new SHAccident();
    }

    public SHAssignation clickAssignTab() {
        CommonEvents.clickButton(assignTab);
        return new SHAssignation();
    }
    public SHEquipmentType clickEquipmentTab(){
        CommonEvents.clickButton((equipmentTab));
        return new SHEquipmentType();
    }

    public SHEquiposSegu clickequiposTab() {
        CommonEvents.clickButton(equipostab);
        return new SHEquiposSegu();
    }
}