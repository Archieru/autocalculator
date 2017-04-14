package com.bar42.exness.extenders;

import com.codeborne.selenide.SelenideElement;

public class BaseExtender
{
    protected SelenideElement baseElement;
    
    public BaseExtender(SelenideElement baseElement)
    {
        this.baseElement = baseElement;
    }
    
    public SelenideElement getElement()
    {
        return baseElement;
    }
    
    public SelenideElement $_(String selector)
    {
        return baseElement.$(selector);
    }
}
