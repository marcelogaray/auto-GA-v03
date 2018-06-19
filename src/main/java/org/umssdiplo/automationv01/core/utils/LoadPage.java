package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHAccident;
import org.umssdiplo.automationv01.core.managepage.smartHouse.SHLogin;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }

    public static SHLogin smartHousePage() {
        ManageDriver.getInstance().getWebDriver().navigate().to(PropertyAccessor.getInstance().getSmartHouseBaseUrl());
        return new SHLogin();
    }
}
