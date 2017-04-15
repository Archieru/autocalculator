package com.bar42.exness.extenders;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;

public class Selector extends BaseExtender
{
    public Selector(SelenideElement baseElement)
    {
        super(baseElement);
    }
    
    public void select(String option)
    {
        if (getCurrentlySelected().contains(option)) { return; }
        
        getCall().click();
        ElementsCollection options = getSelectItems().filter(text(option));
        if (options.size() != 1)
        {
            throw new RuntimeException(
                "There should be one '" + option + "' in " + getSelectItems().toString()
            );
        }
        options.first().click();
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
