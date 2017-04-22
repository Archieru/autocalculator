package com.bar42.exness.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CentTest extends BaseTest
{
    @BeforeClass
    public static void beforeAll()
    {
        onCalculatorPage
            .withAccountType("cent")
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
    public void testMarginCalculations()
    {
        onCalculatorPage.validateCalculationsMargin(BASE_LOT_SIZE);
    }

    @Test
    public void testProfitCalculations()
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
    public void testMarginCalculationsResult()
    {
        onCalculatorPage.validateCalculationsResultMargin();
    }

    @Test
    public void testProfitCalculationsResult()
    {
        onCalculatorPage.validateCalculationsResultProfit();
    }

    @Test
    public void testSwapLongCalculationsResult()
    {
        onCalculatorPage.validateCalculationsResultSwapLong();
    }

    @Test
    public void testSwapShortCalculationsResult()
    {
        onCalculatorPage.validateCalculationsResultSwapShort();
    }

    @Test
    public void testVolumeCalculationsResult()
    {
        onCalculatorPage.validateCalculationsResultVolume();
    }

    @Test
    public void testDoubleTransfer()
    {
        
        onCalculatorPage
            .withSymbol("AUDCADc")
            .withBaseCurrency("USC")
            .calculate()
            .validateConversionPairs("USD")
            .validateConversionPairs("USC")
            .validateConversionPairs("AUD")
            .validateConversionPairs("CAD");
    }

    @Test
    public void testSingleTransfer()
    {
        
        onCalculatorPage
            .withSymbol("AUDCADc")
            .withBaseCurrency("AUC")
            .calculate()
            .validateConversionPairs("AUD")
            .validateConversionPairs("AUC")
            .validateConversionPairs("CAD");
    }
    
    @Test
    public void testLeverage()
    {
        onCalculatorPage
            .withLeverage("1888")
            .calculate()
            .validateCalculationsMargin("1888");
    }
}
