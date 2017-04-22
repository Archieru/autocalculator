package com.bar42.exness.tests;

import com.bar42.exness.pages.CalculatorPage;
import com.bar42.exness.steps.CalculatorPageSteps;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class BaseTest
{
    private static boolean initialized = false;
    protected static CalculatorPageSteps onCalculatorPage = new CalculatorPageSteps();
    protected static final float BASE_LOT_SIZE = 2.34f;
    
    @BeforeClass
    public static void beforeEverything()
    {
        if (initialized) { return; }
    
        Configuration.browser = "firefox";
        Configuration.timeout = 10000;
        Configuration.screenshots = true;
        Configuration.startMaximized = true;
    
        new CalculatorPage().loadPage();
        initialized = true;
    }
}
