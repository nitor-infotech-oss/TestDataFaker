package com.qa;

public class commonUtils 
{
    //#region Dynamic Xpath
    public String dynamicXpath(String xpath, String textToBeRelaced, String replacerText)
    {
        String newXpath = xpath.replace(textToBeRelaced,replacerText);
        return newXpath;
    }
    //#endregion
}
