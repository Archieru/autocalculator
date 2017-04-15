package com.bar42.exness.steps;

import com.bar42.exness.pages.CalculatorPage;
import org.junit.Assert;

public class CalculatorPageSteps extends BaseStep
{
    private CalculatorPage calculatorPage = new CalculatorPage();
    
    public CalculatorPageSteps withAccountType(String type)
    {
        calculatorPage.accountTypeSelect().select(type);
        return this;
    }

    public CalculatorPageSteps withinstrument(String instrument)
    {
        calculatorPage.instrumentSelect().select(instrument);
        return this;
    }

    public CalculatorPageSteps withSymbol(String symbol)
    {
        calculatorPage.symbolSelect().select(symbol);
        return this;
    }

    public CalculatorPageSteps withNySymbol(String symbol)
    {
        calculatorPage.symbolNySelect().select(symbol);
        return this;
    }

    public CalculatorPageSteps withLotSize(int lotSize)
    {
        calculatorPage.lotSizeInput().sendKeys("" + lotSize);
        return this;
    }

    public CalculatorPageSteps withLeverage(String leverage)
    {
        calculatorPage.leverageSelect().select(leverage);
        return this;
    }

    public CalculatorPageSteps withBaseCurrency(String currency)
    {
        calculatorPage.currencieSelect().select(currency);
        return this;
    }

    public CalculatorPageSteps calculate()
    {
        calculatorPage.calculateButton().click();
        return this;
    }
    
    public CalculatorPageSteps validateMargin()
    {
        Assert.assertNotEquals(0, calculatorPage.marginRow().getValue());
        return this;
    }

    public CalculatorPageSteps validateMargin(long expected)
    {
        Assert.assertEquals(expected, calculatorPage.marginRow().getValue(), 0);
        return this;
    }

    public CalculatorPageSteps validateProfit()
    {
        Assert.assertNotEquals(0, calculatorPage.profitRow().getValue());
        return this;
    }

    public CalculatorPageSteps validateProfit(long expected)
    {
        Assert.assertEquals(expected, calculatorPage.profitRow().getValue(), 0);
        return this;
    }

    public CalculatorPageSteps validateComission()
    {
        Assert.assertNotEquals(0, calculatorPage.comissionRow().getValue());
        return this;
    }

    public CalculatorPageSteps validateComission(long expected)
    {
        Assert.assertEquals(expected, calculatorPage.comissionRow().getValue(), 0);
        return this;
    }

    public CalculatorPageSteps validateSwapLong()
    {
        Assert.assertNotEquals(0, calculatorPage.swapLongRow().getValue());
        return this;
    }

    public CalculatorPageSteps validateSwapLong(long expected)
    {
        Assert.assertEquals(expected, calculatorPage.swapLongRow().getValue(), 0);
        return this;
    }

    public CalculatorPageSteps validateSwapShort()
    {
        Assert.assertNotEquals(0, calculatorPage.swapShortRow().getValue());
        return this;
    }

    public CalculatorPageSteps validateSwapShort(long expected)
    {
        Assert.assertEquals(expected, calculatorPage.swapShortRow().getValue(), 0);
        return this;
    }

    public CalculatorPageSteps validateVolume()
    {
        Assert.assertNotEquals(0, calculatorPage.volumeRow().getValue());
        return this;
    }

    public CalculatorPageSteps validateVolume(long expected)
    {
        Assert.assertEquals(expected, calculatorPage.volumeRow().getValue(), 0);
        return this;
    }
}
