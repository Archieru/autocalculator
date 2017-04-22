package com.bar42.exness.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassicFuturesTest extends BaseTest
{
    @BeforeClass
    public static void beforeAll()
    {
        onCalculatorPage
            .withAccountType("common")
            .withInstrument("NYMEX")
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
    public void testComission()
    {
        onCalculatorPage.validateComission();
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
    public void testComissionCalculations()
    {
        onCalculatorPage.validateCalculationsComission(BASE_LOT_SIZE);
    }
    
    @Test
    public void testProfitCalculator()
    {
        onCalculatorPage.validateCalculationsProfit(BASE_LOT_SIZE);
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
    public void testComissionCalculationsResult()
    {
        onCalculatorPage.validateCalculationsResultComission();
    }
    
    @Test
    public void testProfitCalculatorResult()
    {
        onCalculatorPage.validateCalculationsResultProfit();
    }
    
    @Test
    public void testVolumeCalculationsResult()
    {
        onCalculatorPage.validateCalculationsResultVolume();
    }
    
    @Test
    public void testSingleTransfer()
    {
        onCalculatorPage
            .withBaseCurrency("AUD")
            .calculate()
            .validateConversionPairs("AUD")
            .validateConversionPairs("USD");
    }
}
