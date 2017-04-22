package com.bar42.exness.steps;

import com.bar42.exness.pages.CalculatorPage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.matchText;
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
        return validateCalculation(calculatorPage.marginRow().getElement());
    }

    public CalculatorPageSteps validateMargin(long expected)
    {
        return validateCalculation(calculatorPage.marginRow().getElement());
    }

    public CalculatorPageSteps validateProfit()
    {
        return validateCalculation(calculatorPage.marginRow().getElement());
    }

    public CalculatorPageSteps validateProfit(long expected)
    {
        return validateCalculation(calculatorPage.marginRow().getElement());
    }

    public CalculatorPageSteps validateComission()
    {
        return validateCalculation(calculatorPage.marginRow().getElement());
    }

    public CalculatorPageSteps validateComission(long expected)
    {
        return validateCalculation(calculatorPage.marginRow().getElement());
    }

    public CalculatorPageSteps validateSwapLong()
    {
        return validateCalculation(calculatorPage.marginRow().getElement());
    }

    public CalculatorPageSteps validateSwapLong(long expected)
    {
        return validateCalculation(calculatorPage.marginRow().getElement());
    }

    public CalculatorPageSteps validateSwapShort()
    {
        return validateCalculation(calculatorPage.marginRow().getElement());
    }

    public CalculatorPageSteps validateSwapShort(long expected)
    {
        return validateCalculation(calculatorPage.marginRow().getElement());
    }

    public CalculatorPageSteps validateVolume()
    {
        return validateCalculation(calculatorPage.marginRow().getElement());
    }
    
    public CalculatorPageSteps validateVolume(long expected)
    {
        return validateCalculation(calculatorPage.marginRow().getElement());
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
        validateCalculation(calculatorPage.formulas().marginCalculations());
        return this;
    }
    
    public CalculatorPageSteps validateCalculationsResultComission()
    {
        validateCalculation(calculatorPage.formulas().commissionCalculations());
        return this;
    }
    
    public CalculatorPageSteps validateCalculationsResultProfit()
    {
        validateCalculation(calculatorPage.formulas().profitCalculations());
        return this;
    }
    
    public CalculatorPageSteps validateCalculationsResultSwapLong()
    {
        validateCalculation(calculatorPage.formulas().swapLongCalculations());
        return this;
    }
    
    public CalculatorPageSteps validateCalculationsResultSwapShort()
    {
        validateCalculation(calculatorPage.formulas().swapShortCalculations());
        return this;
    }
    
    public CalculatorPageSteps validateCalculationsResultVolume()
    {
        validateCalculation(calculatorPage.formulas().volumeCalculations());
        return this;
    }
    
    private CalculatorPageSteps validateCalculation(SelenideElement element)
    {
        element.shouldNot(matchText("[^0-9\\.,]0[\\.,]?[0]*[^0-9\\.,]"));
        return this;
    }
}
