package com.bar42.exness.extenders;

import com.codeborne.selenide.Selenide;

public class CalcRow extends BaseExtender
{
    public CalcRow(CalcType type)
    {
        super(Selenide
            .$(".container .calc-colForm>.ui-formRow [name=" + type + "]")
            .parent()
        );
    }
    
    public enum CalcType
    {
        ACCOUNT("account"),
        INSTRUMENTS("Instruments"),
        SYMBOL("SymbolsForex"),
        NYSYMBOL("SymbolsNYMEX"),
        LOT("Lot"),
        LEVERAGE("Leverage"),
        CURRENCY("Currency");
        
        private final String text;
        
        private CalcType(final String text)
        {
            this.text = text;
        }
        
        @Override
        public String toString()
        {
            return text;
        }
        
    }
}
