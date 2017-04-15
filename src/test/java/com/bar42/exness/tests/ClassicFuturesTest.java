package com.bar42.exness.tests;

import org.junit.BeforeClass;
import org.junit.Test;

public class ClassicFuturesTest extends BaseTest
{
    @BeforeClass
    public static void beforeAll()
    {
        onCalculatorPage
            .withAccountType("Mini, Classic, ECN")
            .withInstrument("Future Specifications")
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
    public void testMarginCalculator()
    {
        onCalculatorPage.validateCalculationsMargin(BASE_LOT_SIZE);
    }
    
    @Test
    public void testComissionCalculator()
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
    public void testSingleTransfer()
    {
        
        onCalculatorPage
            .withBaseCurrency("AUD")
            .calculate()
            .validateConversionPairs("AUD")
            .validateConversionPairs("USD");
    }
}
