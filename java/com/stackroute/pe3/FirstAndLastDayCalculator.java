/*
* */
package com.stackroute.pe3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FirstAndLastDayCalculator {
    public String firstAndLastDay(String date)

    {
        Date ob=new Date(date);//date is passed and used here
        String outp="";
        Calendar cal = Calendar.getInstance();
        cal.setTime(ob);
        //TO set the 1st day of the week
        if(cal.get(cal.DAY_OF_WEEK)==1)
        {
            cal.add(cal.DAY_OF_WEEK,-6);
        }
        else{
            cal.add(cal.DAY_OF_WEEK,-(cal.get(cal.DAY_OF_WEEK)-2));}

        System.out.println("------------------------------");

        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        outp=outp+"First day is:- "+sdf.format(cal.getTime())+"\n";
        System.out.println("First day is:- "+sdf.format(cal.getTime()));
       //To set the last day of the week
        cal.add(cal.DAY_OF_WEEK,+(8-cal.get(cal.DAY_OF_WEEK)));
        outp=outp+"Last day is:- "+sdf.format(cal.getTime());
        System.out.println("Last day is:- "+sdf.format(cal.getTime()));
        System.out.println("------------------------------");
        return outp;
    }
}
