package com.bar42.exness.pages;

import com.bar42.exness.extenders.CalcRow;
import com.bar42.exness.extenders.Selector;
import com.codeborne.selenide.SelenideElement;

import static com.bar42.exness.extenders.CalcRow.RowType.*;

public class CalculatorPage extends BasePage
{
    @Override
    protected String getPageUrl()
    {
        return "https://www.exness.com/intl/ru/tools/calculator/,";
    }
    
    public Selector accountTypeSelect()
    {
        SelenideElement baseElement = new CalcRow(ACCOUNT)
            .$_(".calc-colFormInput>.ui-select");
        return new Selector(baseElement);
    }

    public Selector instrumentSelect()
    {
        SelenideElement baseElement = new CalcRow(INSTRUMENTS)
            .$_(".calc-colFormInput>.ui-select");
        return new Selector(baseElement);
    }

    public Selector symbolSelect()
    {
        SelenideElement baseElement = new CalcRow(SYMBOL)
            .$_(".calc-colFormInput>.ui-select");
        return new Selector(baseElement);
    }

    public SelenideElement lotSizeInput()
    {
        SelenideElement baseElement = new CalcRow(LOT)
            .$_(".calc-colFormInput>.ui-select");
        return baseElement;
    }

    public Selector leverageSelect()
    {
        SelenideElement baseElement = new CalcRow(LEVERAGE)
            .$_(".calc-colFormInput>.ui-select");
        return new Selector(baseElement);
    }

    public Selector currencieSelect()
    {
        SelenideElement baseElement = new CalcRow(CURRENCY)
            .$_(".calc-colFormInput>.ui-select");
        return new Selector(baseElement);
    }

    public SelenideElement calculateButton()
    {
        SelenideElement baseElement = new CalcRow(CALCULATE)
            .$_(".calc-colFormInput>.ui-select");
        return baseElement;
    }
}
