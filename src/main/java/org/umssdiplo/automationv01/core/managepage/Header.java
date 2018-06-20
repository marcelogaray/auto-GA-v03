package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Header  extends BasePage {

    @FindBy(name = "login_button")
    private WebElement loginBtn;

    @FindBy(name = "org_button")
    private WebElement organizationTab;

    @FindBy(name = "emp_button")
    private WebElement employeeTab;

    @FindBy(name = "accidents_button")
    private WebElement accidentsTab;

    @FindBy(name = "aassign_button")
    private WebElement assignTab;

    @FindBy(name = "reports_button")
    private WebElement reportsTab;

    public SHLogin clickLoginButton(){
        CommonEvents.clickButton(loginBtn);
        return new SHLogin();
    }

    public SHOrganization clickOrganizationTab(){
        CommonEvents.clickButton(organizationTab);
        return new SHOrganization();
    }

    public SHEmployee clickEmployeeTab(){
        CommonEvents.clickButton(employeeTab);
        return new SHEmployee();
    }
    public SHAccident clickAccidentTab(){
        CommonEvents.clickButton(employeeTab);
        return new SHAccident();
    }
    public SHAssignation clickAssignTab(){
        CommonEvents.clickButton(employeeTab);
        return new SHAssignation();
    }
    public SHReport clickReportTab(){
        CommonEvents.clickButton(employeeTab);
        return new SHReport();
    }
}