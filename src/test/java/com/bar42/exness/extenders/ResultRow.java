package com.bar42.exness.extenders;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.text;


public class ResultRow extends BaseExtender
{
    public ResultRow(ResultType type)
    {
        super(Selenide
            .$$(".container .calc-colResult>.calc-colResultRow")
            .findBy(text( type.toString() ))
        );
    }
    
    public String getResult()
    {
        return $_(".calc-colResultValue").text();
    }
    
    public float getValue()
    {
        return Float.parseFloat(getResult().split(" ")[0]);
    }
    
    public enum ResultType
    {
        MARGIN("Маржа"),
        PROFIT("Стоимость пункта"),
        COMISSION("Комиссия"),
        SWAPLONG("Своп лонг"),
        SWAPSHORT("Своп шорт"),
        VOLUME("Объем");
        
        private final String text;
        
        private ResultType(final String text)
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
