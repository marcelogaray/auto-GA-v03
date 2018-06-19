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

    @Given("^'SMARTHOUSE' page is loaded$")
    public void smartHousePageIsLoaded() throws Throwable {
        menu = LoadPage.smartHousePage();
    }
    @And("^open 'Login' page$")
    public void openLoginPage() throws Throwable {
        login = menu.clickLoginButton();
    }
    @And("^set admin credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentialsOnLoginForm();
    }
    @And("^accept credentials on 'Login' page$")
    public void acceptLoginCredentials() throws Throwable {
        login.acceptLoginCredentials();
    }
    @And("^close 'Login' page$")
    public void closeLoginPage() throws Throwable {
        login.closeLoginPage();
    }
    @And("^open 'Employee' page$")
    public void openEmployeePage() throws Throwable {
        employee = menu.clickEmployeeTab();
    }
    @And("^open new 'Employee' form$")
    public void openNewEmployeeForm() throws Throwable {
        employee.clickNewEmployeeButton();
    }
    @And("^complete new 'Employee' form$")
    public void openNewOrganizationOnSmartHouse() throws Throwable {
        employee.setNewEmployeeForm();
    }
    @And("^accept new 'Employee' form$")
    public void acceptNewEmployeeForm() throws Throwable {
        employee.clickAcceptNewEmployee();
    }
    @Given("^'SMARTHOUSE' page is closed")
    public void closePage() throws Throwable {
        LoadPage.closePage();
    }
}
