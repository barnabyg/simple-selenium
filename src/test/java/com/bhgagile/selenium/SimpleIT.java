 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

        driver = new FirefoxDriver();

        driver.get("http://www.google.com");

        driver.quit();
    }
}
