package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.SmarthHouse.SHLogin;

public final class LoadPage {
    public static SHLogin loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getSmartHouseBaseUrl());
        return new SHLogin();
    }
}
