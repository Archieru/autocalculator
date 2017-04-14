package com.bar42.exness.tests;

import org.junit.BeforeClass;

public class BaseTest
{
    private static boolean initialized = false;
    
    @BeforeClass
    public static void beforeEverything()
    {
        if (initialized) { return; }
        
    }
}
