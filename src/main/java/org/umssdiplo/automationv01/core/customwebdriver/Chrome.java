package org.umssdiplo.automationv01.core.customwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements CustomWebDriver {
    @Override
    public WebDriver generateWebDriver() {
        return new ChromeDriver();
    }
}