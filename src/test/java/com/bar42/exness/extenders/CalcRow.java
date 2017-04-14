package com.bar42.exness.extenders;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.text;


public class CalcRow extends BaseExtender
{
    public CalcRow(RowType type)
    {
        super(Selenide
            .$$(".container .calc-colForm>.ui-formRow")
            .findBy(text( type.toString() ))
        );
    }
    
    public enum RowType
    {
        ACCOUNT("Тип счета"),
        INSTRUMENTS("Биржа"),
        SYMBOL("Форекс"),
        LOT("Объем сделки"),
        LEVERAGE("Кредитное плечо"),
        CURRENCY("Валюта счета"),
        CALCULATE("Расчет");
        
        private final String text;
        
        private RowType(final String text)
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
