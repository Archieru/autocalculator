package com.bar42.exness.tests;

import org.junit.BeforeClass;
import org.junit.Test;

public class CentTest extends BaseTest
{
    @BeforeClass
    public static void beforeAll()
    {
        onCalculatorPage
            .withAccountType("Cent")
            .withLotSize(BASE_LOT_SIZE)
            .calculate();
    }
    
    @Test
    public void testMargin()
    {
        onCalculatorPage.validateMargin();
    }

    @Test
    public void testProfit()
    {
        onCalculatorPage.validateProfit();
    }

    @Test
    public void testSwapLong()
    {
        onCalculatorPage.validateSwapLong();
    }

    @Test
    public void testSwapShort()
    {
        onCalculatorPage.validateSwapShort();
    }

    @Test
    public void testVolume()
    {
        onCalculatorPage.validateVolume();
    }

    @Test
    public void testMarginCalculator()
    {
        onCalculatorPage.validateCalculationsMargin(BASE_LOT_SIZE);
    }

    @Test
    public void testProfitCalculator()
    {
        onCalculatorPage.validateCalculationsProfit(BASE_LOT_SIZE);
    }

    @Test
    public void testSwapLongCalculations()
    {
        onCalculatorPage.validateCalculationsSwapLong(BASE_LOT_SIZE);
    }

    @Test
    public void testSwapShortCalculations()
    {
        onCalculatorPage.validateCalculationsSwapShort(BASE_LOT_SIZE);
    }

    @Test
    public void testVolumeCalculations()
    {
        onCalculatorPage.validateCalculationsVolume(BASE_LOT_SIZE);
    }

    @Test
    public void testDoubleTransfer()
    {
        
        onCalculatorPage
            .withSymbol("AUDCADc")
            .withBaseCurrency("USD")
            .validateConversionPairs("USD")
            .validateConversionPairs("USC")
            .validateConversionPairs("AUD")
            .validateConversionPairs("CAD");
    }

    @Test
    public void testSingleTransfer()
    {
        
        onCalculatorPage
            .withSymbol("AUDCAD")
            .withBaseCurrency("AUC")
            .validateConversionPairs("AUD")
            .validateConversionPairs("AUC")
            .validateConversionPairs("CAD");
    }
}
