package org.umssdiplo.automationv01.core.managepage.smartHouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Header  extends BasePage {
    private SHOrganization shOrganization;
    private SHLogin shLogin;

    @FindBy(name = "login_button")
    private WebElement loginBtn;

    @FindBy(name = "org_button")
    private WebElement organizationTab;

    @FindBy(name = "emp_button")
    private WebElement employeeTab;

    public SHOrganization getShOrganization() {
        if(shOrganization==null){
            shOrganization= new SHOrganization();
        }
        return shOrganization;
    }

    public SHLogin getShLogin() {
        if(shLogin==null){
            shLogin= new SHLogin();
        }
        return shLogin;
    }

    public SHLogin clickLoginButton(){
        CommonEvents.clickButton(loginBtn);
        return getShLogin();
    }

    public SHOrganization clickOrganizationTab(){
        CommonEvents.clickButton(organizationTab);
        return getShOrganization();
    }
}
