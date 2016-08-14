 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.selenium;

import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Barnaby Golden
 *
 */
public final class SimpleIT {

    /**
     * Driver.
     */
    private WebDriver driver;

    /**
     * Simple Selenium test that accesses google.com.
     */
    @Test
    public void simpleTest() {

        if (SystemUtils.IS_OS_WINDOWS) {
            System.setProperty(
              "webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        } else {
            System.setProperty(
              "webdriver.gecko.driver", "src/test/resources/geckodriver");
        }


        final DesiredCapabilities capabilities = DesiredCapabilities.firefox();

        capabilities.setCapability("marionette", true);

        driver = new FirefoxDriver(capabilities);

        driver.get("http://www.google.com");

        driver.quit();
    }
}
