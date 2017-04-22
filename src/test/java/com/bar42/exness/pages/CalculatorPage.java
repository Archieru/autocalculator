package com.bar42.exness.pages;

import com.bar42.exness.extenders.CalcRow;
import com.bar42.exness.extenders.CalculationFormulasBlock;
import com.bar42.exness.extenders.ResultRow;
import com.bar42.exness.extenders.Selector;
import com.codeborne.selenide.SelenideElement;

import static com.bar42.exness.extenders.CalcRow.CalcType.*;
import static com.bar42.exness.extenders.ResultRow.ResultType.*;
import static com.codeborne.selenide.Selenide.$;

public class CalculatorPage extends BasePage
{
    @Override
    protected String getPageUrl()
    {
        return "https://www.exness.eu/intl/ru/tools/calculator/";
    }
    
    public CalculationFormulasBlock formulas()
    {
        return new CalculationFormulasBlock($(".calc-rowFormulas"));
    }
    
    public SelenideElement conversionPairs()
    {
        return $("#conversion_pairs");
    }
    
    public Selector accountTypeSelect()
    {
        SelenideElement baseElement = new CalcRow(ACCOUNT).getElement();
        return new Selector(baseElement);
    }

    public Selector instrumentSelect()
    {
        SelenideElement baseElement = new CalcRow(INSTRUMENTS).getElement();
        return new Selector(baseElement);
    }

    public Selector symbolSelect()
    {
        SelenideElement baseElement = new CalcRow(SYMBOL).getElement();
        return new Selector(baseElement);
    }

    public Selector symbolNySelect()
    {
        SelenideElement baseElement = new CalcRow(NYSYMBOL).getElement();
        return new Selector(baseElement);
    }

    public SelenideElement lotSizeInput()
    {
        SelenideElement baseElement = new CalcRow(LOT).$_("input");
        return baseElement;
    }

    public Selector leverageSelect()
    {
        SelenideElement baseElement = new CalcRow(LEVERAGE).getElement();
        return new Selector(baseElement);
    }

    public Selector currencieSelect()
    {
        SelenideElement baseElement = new CalcRow(CURRENCY).getElement();
        return new Selector(baseElement);
    }

    public SelenideElement calculateButton()
    {
        return $(".container .calc-colForm>.ui-formRow .calc-colFormBtn>button");
    }
    
    public ResultRow marginRow()
    {
        return new ResultRow(MARGIN);
    }
    
    public ResultRow profitRow()
    {
        return new ResultRow(PROFIT);
    }
    
    public ResultRow comissionRow()
    {
        return new ResultRow(COMISSION);
    }
    
    public ResultRow swapLongRow()
    {
        return new ResultRow(SWAPLONG);
    }
    
    public ResultRow swapShortRow()
    {
        return new ResultRow(SWAPSHORT);
    }
    
    public ResultRow volumeRow()
    {
        return new ResultRow(VOLUME);
    }
}
