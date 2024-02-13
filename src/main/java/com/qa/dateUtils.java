package com.qa;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {

    //#region Get Current Date
    private Date getDate() {
        Date curDate = new Date();
        System.out.println("Current date is " + curDate);
        return curDate;
    }
    public String getTodaysDateAndTime_ddMMMYYHM()
    {
        SimpleDateFormat simpleDate =  new SimpleDateFormat("dd_MMM_yy_HM");
        return simpleDate.format(getDate()).toUpperCase();
    }
    public String getTodaysDate_ddMMMYYYY()
    {
        SimpleDateFormat simpleDate =  new SimpleDateFormat("dd MMM yyyy");
        return simpleDate.format(getDate()).toUpperCase();
    }
    public String getTodaysDate_MMddYYYY()
    {
        SimpleDateFormat simpleDate =  new SimpleDateFormat("MM dd yyyy");
        return simpleDate.format(getDate()).toUpperCase();
    }
    //#endregion

    //#region Get Next Date
    private  Date nextDate(int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getDate());
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }
    public String getNextDate(int days)
    {
        SimpleDateFormat simpleDate =  new SimpleDateFormat("dd MMM yyyy");
        return simpleDate.format(nextDate(days)).toUpperCase();
    }
    //#endregion

    //#region Get Previous Date
    private  Date pastDate(int days) {
        days = days * -1;
        Calendar cal = Calendar.getInstance();
        cal.setTime(getDate());
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }
    public String getPastDate(int days)
    {
        SimpleDateFormat simpleDate =  new SimpleDateFormat("dd MMM yyyy");
        return simpleDate.format(pastDate(days)).toUpperCase();
    }
    //#endregion

    //#region Add Months
    private  Date addMonths(int months) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getDate());
        cal.add(Calendar.MONTH, months);
        return cal.getTime();
    }
    public String getNextMonths(int months)
    {
        SimpleDateFormat simpleDate =  new SimpleDateFormat("dd MMM yyyy");
        return simpleDate.format(addMonths(months)).toUpperCase();
    }
    //#endregion

    //#region  Add Years
    private  Date addYears(int years) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getDate());
        cal.add(Calendar.YEAR, years);
        return cal.getTime();
    }
    public String getNextYear(int years)
    {
        SimpleDateFormat simpleDate =  new SimpleDateFormat("dd MMM yyyy");
        return simpleDate.format(addYears(years)).toUpperCase();
    }
    //#endregion
}
