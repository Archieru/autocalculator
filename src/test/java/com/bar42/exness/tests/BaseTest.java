package com.bar42.exness.tests;

import com.bar42.exness.pages.CalculatorPage;
import com.bar42.exness.steps.CalculatorPageSteps;
import org.junit.BeforeClass;

public class BaseTest
{
    private static boolean initialized = false;
    protected static CalculatorPageSteps onCalculatorPage = new CalculatorPageSteps();
    
    @BeforeClass
    public static void beforeEverything()
    {
        if (initialized) { return; }
        new CalculatorPage().loadPage();
        initialized = true;
    }
}
