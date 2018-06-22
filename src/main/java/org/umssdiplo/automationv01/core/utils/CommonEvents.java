package org.umssdiplo.automationv01.core.utils;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;

import java.util.List;

public class CommonEvents {

    /**
     * This method set text content to web element.
     *
     * @param webElement Is web element.
     * @param content    Is the content that will be set to the web element.
     */
    public static void setInputField(WebElement webElement, String content) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        if(isInputOfTypeDate(webElement)) {
            webElement.sendKeys(Keys.DELETE);
        } else {
            webElement.clear();
        }
        webElement.sendKeys(content);
    }

    /**
     * This method set text content to date web element.
     *
     * @param webElement Is web element.
     * @param content    Is the content that will be set to the web element.
     */
    public static void setDateInputField(WebElement webElement, String content) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.sendKeys(Keys.DELETE);
        webElement.sendKeys(content);
    }

    /**
     * This method perform a click action in a web element.
     *
     * @param webElement Is the web element that will be pressed.
     */
    public static void clickButton(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * This method perform a click in a non visible element in the UI.
     *
     * @param webElement the WebElement non visible in the UI.
     */
    public static void jsClickElement(WebElement webElement) {
        ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver())
                .executeScript("arguments[0].click();", webElement);
    }

    /**
     * This method verifies if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isVisible(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    /**
     * This method verifies if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isPresent(WebElement webElement) {
        try {
            return webElement.isEnabled();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    /**
     * This method perform a search in a WebElement list based on a content string parameter.
     *
     * @param elements is the WebElements lists.
     * @param content  is the content parameter.
     * @return the WebElement search result.
     */
    public static WebElement findWebElement(List<WebElement> elements, String content) {
        return elements.stream()
                .filter(element -> content.equals(element.getText()))
                .findAny()
                .orElse(null);
    }

    /**
     * This method return the text content of a WebElement.
     *
     * @param webElement is the WebElement to extract the text.
     * @return the text content of the WebElement.
     */
    public static String getTextContent(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    /**
     * This method get title of current page.
     *
     * @return title of the current page.
     */
    public static String getPageTitle() {
        return ManageDriver.getInstance().getWebDriver().getTitle();
    }

    /**
     * This method press enter key to web element.
     *
     * @param webElement is the WebElement.
     */
    public static void pressEnterKey(WebElement webElement) {
        webElement.sendKeys(Keys.ENTER);
    }

    /***
     * This method to know if an element is clickable
     * @param webElement
     * @return
     */
    public static boolean isClickable(WebElement webElement) {
        return ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement)).isEnabled();
    }

    /**
     * This method return true if the current FluentWebElement is an input of type date
     */
    private static boolean isInputOfTypeDate(WebElement webElement)
    {
        return ("input".equalsIgnoreCase(webElement.getTagName()) && "date".equalsIgnoreCase(webElement.getAttribute("type")));
    }

    /***
     * Wait util a time determined
     * @param waitTime
     */
    public static void waitUntil(long waitTime) {
        try {
            WebDriverWait webDriverWait = ManageDriver.getInstance().getWebDriverWait();
            synchronized (webDriverWait) {
                webDriverWait.wait(waitTime);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /***
     * Verify if an atributte is present on web element
     * @param webElement
     * @param attr
     * @return
     */
    public static boolean isAttributPresent(WebElement webElement, String attr) {
        String value = webElement.getAttribute(attr);
        return value != null ? value.equals("true") : false;
    }

    /***
     * Verify if an element is displayed first to verify if is present
     * @param webElement
     * @return
     */
    public static boolean elementIsPresent(WebElement webElement) {
        try {
            return webElement.isDisplayed() ? isPresent(webElement) : false;
        } catch (ExceptionHasMessage e) {
            return false;
        }
    }
}