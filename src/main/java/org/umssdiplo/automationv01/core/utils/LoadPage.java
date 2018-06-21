package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.HeaderWithLogin;
import org.umssdiplo.automationv01.core.managepage.HeaderWithoutLogin;

public final class LoadPage {
    public static HeaderWithLogin headerPageWithLogin() {
        ManageDriver.getInstance().getWebDriver().navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new HeaderWithLogin();
    }

    public static HeaderWithoutLogin headerWithoutLogin() {
        ManageDriver.getInstance().getWebDriver().navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new HeaderWithoutLogin();
    }
}