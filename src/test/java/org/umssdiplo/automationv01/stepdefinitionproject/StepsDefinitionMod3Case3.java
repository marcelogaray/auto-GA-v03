package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.smartHouse.Header;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHEmployee;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHLogin;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHOrganization;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionMod3Case3 {
    private Header menu;
    private SHLogin login;
    private SHEmployee employee;

    @Given("^M3C3: 'SMARTHOUSE' page is loaded$")
    public void smartHousePageIsLoaded() throws Throwable {
        menu = LoadPage.smartHousePage();
    }
    @And("^M3C3: open 'Login' page$")
    public void openLoginPage() throws Throwable {
        login = menu.clickLoginButton();
    }
    @And("^M3C3: set admin credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentialsOnLoginForm();
    }
    @And("^M3C3: accept credentials on 'Login' page$")
    public void acceptLoginCredentials() throws Throwable {
        login.acceptLoginCredentials();
    }
    @And("^M3C3: close 'Login' page$")
    public void closeLoginPage() throws Throwable {
        login.closeLoginPage();
    }
    @And("^M3C3: open 'Employee' page$")
    public void openEmployeePage() throws Throwable {
        employee = menu.clickEmployeeTab();
    }
    @And("^M3C3: open new 'Employee' form$")
    public void openNewEmployeeForm() throws Throwable {
        employee.clickNewEmployeeButton();
    }
    @And("^M3C3: complete new 'Employee' form$")
    public void openNewOrganizationOnSmartHouse() throws Throwable {
        employee.setNewEmployeeForm();
    }
    @And("^M3C3: accept new 'Employee' form$")
    public void acceptNewEmployeeForm() throws Throwable {
        employee.clickAcceptNewEmployee();
    }
    @Given("^M3C3: 'SMARTHOUSE' page is closed")
    public void closePage() throws Throwable {
        LoadPage.closePage();
    }
}
