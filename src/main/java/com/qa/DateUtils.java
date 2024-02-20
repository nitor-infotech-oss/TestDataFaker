package com.qa;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {
    public Calendar cal;

    public DateUtils()
    {
        cal = Calendar.getInstance();
        cal.setTime(getDate());
    }

    //#region Get Current Date
    private Date getDate() {
        Date curDate = new Date();
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
    public  Date nextDate(int days) {
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
        cal.add(Calendar.DATE, (days * -1));
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
