package com.bar42.exness.extenders;

import com.codeborne.selenide.SelenideElement;

public class CalculationFormulasBlock extends BaseExtender
{
    public CalculationFormulasBlock(SelenideElement baseElement)
    {
        super(baseElement);
    }
    
    public SelenideElement marginCalculations()
    {
        return $_("#margin_formula2");
    }

    public SelenideElement commissionCalculations()
    {
        return $_("#commission_formula2");
    }

    public SelenideElement profitCalculations()
    {
        return $_("#profit_formula2");
    }

    public SelenideElement volumeCalculations()
    {
        return $_("#volume_formula2");
    }

    public SelenideElement swapLongCalculations()
    {
        return $_("#swap_formula2");
    }

    public SelenideElement swapShortCalculations()
    {
        return $_("#swap_formula3");
    }
}
