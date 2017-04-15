package com.bar42.exness.steps;

import com.bar42.exness.pages.CalculatorPage;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;

import static com.codeborne.selenide.Condition.text;

public class CalculatorPageSteps extends BaseStep
{
    private CalculatorPage calculatorPage = new CalculatorPage();
    
    public CalculatorPageSteps withAccountType(String type)
    {
        calculatorPage.accountTypeSelect().select(type);
        return this;
    }

    public CalculatorPageSteps withInstrument(String instrument)
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

    public CalculatorPageSteps withLotSize(float lotSize)
    {
        calculatorPage.lotSizeInput().clear();
        calculatorPage.lotSizeInput().sendKeys(
            String.valueOf(lotSize).replace('.', ',')
        );
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
    
    public CalculatorPageSteps validateCalculationsMargin(String expected)
    {
        calculatorPage.formulas().marginCalculations().shouldHave(text(expected));
        return this;
    }
    
    public CalculatorPageSteps validateCalculationsComission(String expected)
    {
        calculatorPage.formulas().commissionCalculations().shouldHave(text(expected));
        return this;
    }

    public CalculatorPageSteps validateCalculationsProfit(String expected)
    {
        calculatorPage.formulas().profitCalculations().shouldHave(text(expected));
        return this;
    }

    public CalculatorPageSteps validateCalculationsSwapLong(String expected)
    {
        calculatorPage.formulas().swapLongCalculations().shouldHave(text(expected));
        return this;
    }

    public CalculatorPageSteps validateCalculationsSwapShort(String expected)
    {
        calculatorPage.formulas().swapShortCalculations().shouldHave(text(expected));
        return this;
    }

    public CalculatorPageSteps validateCalculationsVolume(String expected)
    {
        calculatorPage.formulas().volumeCalculations().shouldHave(text(expected));
        return this;
    }

    public CalculatorPageSteps validateConversionPairs(String currency)
    {
        calculatorPage.conversionPairs().shouldHave(text(currency));
        return this;
    }

    public CalculatorPageSteps validateCalculationsMargin(float expected)
    {
        return validateCalculationsMargin(String.valueOf(expected));
    }
    
    public CalculatorPageSteps validateCalculationsComission(float expected)
    {
        return validateCalculationsComission(String.valueOf(expected));
    }

    public CalculatorPageSteps validateCalculationsProfit(float expected)
    {
        return validateCalculationsProfit(String.valueOf(expected));
    }

    public CalculatorPageSteps validateCalculationsSwapLong(float expected)
    {
        return validateCalculationsSwapLong(String.valueOf(expected));
    }

    public CalculatorPageSteps validateCalculationsSwapShort(float expected)
    {
        return validateCalculationsSwapShort(String.valueOf(expected));
    }

    public CalculatorPageSteps validateCalculationsVolume(float expected)
    {
        return validateCalculationsVolume(String.valueOf(expected));
    }
    
    public CalculatorPageSteps validateCalculationsResultMargin()
    {
        Assert.assertNotEquals(
            0,
            getResult(calculatorPage.formulas().marginCalculations()),
            0);
        return this;
    }
    
    public CalculatorPageSteps validateCalculationsResultComission()
    {
        Assert.assertNotEquals(
            0,
            getResult(calculatorPage.formulas().commissionCalculations()),
            0);
        return this;
    }
    
    public CalculatorPageSteps validateCalculationsResultProfit()
    {
        Assert.assertNotEquals(
            0,
            getResult(calculatorPage.formulas().profitCalculations()),
            0);
        return this;
    }
    
    public CalculatorPageSteps validateCalculationsResultSwapLong()
    {
        Assert.assertNotEquals(
            0,
            getResult(calculatorPage.formulas().swapLongCalculations()),
            0);
        return this;
    }
    
    public CalculatorPageSteps validateCalculationsResultSwapShort()
    {
        Assert.assertNotEquals(
            0,
            getResult(calculatorPage.formulas().swapShortCalculations()),
            0);
        return this;
    }
    
    public CalculatorPageSteps validateCalculationsResultVolume()
    {
        Assert.assertNotEquals(
            0,
            getResult(calculatorPage.formulas().volumeCalculations()),
            0);
        return this;
    }
    
    private float getResult(SelenideElement element)
    {
        String[] parseArray = element.text().split(" ");
        return Float.parseFloat(parseArray[parseArray.length - 2]);
    }
}
