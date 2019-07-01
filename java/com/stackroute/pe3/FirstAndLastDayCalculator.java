package com.stackroute.pe3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FirstAndLastDayCalculator {
    public static void main(String[] args) {
      /*  Calendar cal=new GregorianCalendar(2019,5, 30);
        //Calendar cal=Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Satuday"};
        System.out.println(sdf.format(cal.getTime()));
        //System.out.println(cal.get(cal.DATE));
        int num3=cal.get(cal.DAY_OF_WEEK);
        System.out.println(num3);
          System.out.println(cal.get(cal.DAY_OF_WEEK)+" "+days[num3-1]);
        System.out.println(cal.get(cal.DAY_OF_WEEK));

         // int num=0;
        //System.out.println(num);
        //if(cal.DAY_OF_WEEK>=4)
        int num=0;
        int num1=cal.get(cal.DAY_OF_WEEK);
        System.out.println(num1);
        if(cal.get(cal.DAY_OF_WEEK)==1)
             num=6;
             num=(num1-2);

        System.out.println(num+" hello");
        cal.add(cal.get(cal.DAY_OF_WEEK),-num);
        System.out.println(cal.get(cal.DAY_OF_WEEK));
        int day=cal.get(cal.DAY_OF_WEEK);
        //System.out.println(day);
        System.out.println("First day is:- "+days[day-1]+" "+sdf.format(cal.getTime()));

        //System.out.println(cal.get(cal.DATE));
       // day=cal.get(cal.DAY_OF_WEEK);
        //cal.add(cal.get(cal.DAY_OF_WEEK),+5);
       // System.out.println(cal.get(cal.DATE));

        System.out.println("Last day is:- "+days[0]+" "+sdf.format(cal.getTime()));    */
        Date ob=new Date("6/3/2019");
        Calendar cal = Calendar.getInstance();
        cal.setTime(ob);
        //System.out.println(cal.get(cal.DAY_OF_WEEK));
        //System.out.println(cal.getMinimum(cal.DAY_OF_WEEK));
         System.out.println(cal.get(cal.DATE));
         System.out.println(cal.get(cal.DAY_OF_WEEK));
         if(cal.get(cal.DAY_OF_WEEK)==1)
         {
            cal.add(cal.DAY_OF_WEEK,-6);
         }
         else{
        cal.add(cal.DAY_OF_WEEK,-(cal.get(cal.DAY_OF_WEEK)-2));}
        System.out.println(cal.get(cal.DAY_OF_WEEK));
        System.out.println(cal.get(cal.DATE));
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        System.out.println("First day is:- "+sdf.format(cal.getTime()));
        //System.out.println(ob);
        cal.add(cal.DAY_OF_WEEK,+(8-cal.get(cal.DAY_OF_WEEK)));
        System.out.println("Last day is:- "+sdf.format(cal.getTime()));


    }
    public String firstAndLastDay(String date)

    {
        Date ob=new Date(date);
        String outp="";
        Calendar cal = Calendar.getInstance();
        cal.setTime(ob);
        //System.out.println(cal.get(cal.DAY_OF_WEEK));
        //System.out.println(cal.getMinimum(cal.DAY_OF_WEEK));
        //System.out.println(cal.get(cal.DATE));
        //System.out.println(cal.get(cal.DAY_OF_WEEK));
        if(cal.get(cal.DAY_OF_WEEK)==1)
        {
            cal.add(cal.DAY_OF_WEEK,-6);
        }
        else{
            cal.add(cal.DAY_OF_WEEK,-(cal.get(cal.DAY_OF_WEEK)-2));}
        //System.out.println(cal.get(cal.DAY_OF_WEEK));
        //System.out.println(cal.get(cal.DATE));
        System.out.println("------------------------------");
       // System.out.println("Sunday is:- "+cal.get(cal.SUNDAY));
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        outp=outp+"First day is:- "+sdf.format(cal.getTime())+"\n";
        System.out.println("First day is:- "+sdf.format(cal.getTime()));
        //System.out.println(ob);
        cal.add(cal.DAY_OF_WEEK,+(8-cal.get(cal.DAY_OF_WEEK)));
        outp=outp+"Last day is:- "+sdf.format(cal.getTime());
        System.out.println("Last day is:- "+sdf.format(cal.getTime()));
        System.out.println("------------------------------");
        return outp;
    }
}
