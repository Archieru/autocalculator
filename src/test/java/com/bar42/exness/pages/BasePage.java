package com.bar42.exness.pages;

import com.codeborne.selenide.Selenide;

public abstract class BasePage
{
    protected abstract String getPageUrl();
    
    public void loadPage()
    {
        Selenide.open(getPageUrl());
    }
}
