package org.umssdiplo.automationv01.core.managepage.smartHouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SHLogin extends BasePage {
    @FindBy(name = "username")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(name = "login_button")
    private WebElement loginBtn;

    @FindBy(id = "login")
    private WebElement aceptLoginBtn;

    @FindBy(name = "close_login_button")
    private WebElement closeLoginBtn;
    public void setCredentials() {

        WebElement waitElement = (new WebDriverWait(webDriver, 20))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("login_button")));
        CommonEvents.clickButton(loginBtn);
        String username = "admin";
        String password = "123";
        waitElement = (new WebDriverWait(webDriver, 20))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        CommonEvents.setInputField(usernameInputField, username);
        waitElement = (new WebDriverWait(webDriver, 20))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        CommonEvents.setInputField(passwordInputField, password);
        waitElement = (new WebDriverWait(webDriver, 100))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("login")));
        CommonEvents.clickButton(aceptLoginBtn);
        waitElement = (new WebDriverWait(webDriver, 200))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("close_login_button")));
        CommonEvents.clickButton(closeLoginBtn);
    }
}