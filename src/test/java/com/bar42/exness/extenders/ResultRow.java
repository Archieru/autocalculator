package com.bar42.exness.extenders;

import static com.codeborne.selenide.Selenide.$;

public class ResultRow extends BaseExtender
{
    public ResultRow(ResultType type)
    {
        super(
            $(".container .calc-colResult>.calc-colResultRow #" + type)
        );
    }
    
    public String getResult()
    {
        return $_(".calc-colResultValue").text();
    }
    
    public enum ResultType
    {
        MARGIN("margin"),
        PROFIT("profit"),
        COMISSION("commission"),
        SWAPLONG("swap_long"),
        SWAPSHORT("swap_short"),
        VOLUME("volumemlnusd");
        
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
