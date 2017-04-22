package com.bar42.exness.extenders;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class Selector extends BaseExtender
{
    public Selector(SelenideElement baseElement)
    {
        super(baseElement);
    }
    
    public void select(String option)
    {
        getCall().click();
        $_("[data-value='"+ option + "']").click();
    }
    
    private SelenideElement getCall()
    {
        return $_(".icon-arrow-down");
    }
    
    private String getCurrentlySelected()
    {
        return $_(".ui-selectItemLabel").text();
    }
    
    private ElementsCollection getSelectItems()
    {
        return $_(".ui-selectListContainer").$$(".ui-selectItem");
    }
}
