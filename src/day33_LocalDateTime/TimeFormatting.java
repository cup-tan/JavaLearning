package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {
/*
year: yy, yyyy
		Month: MM(number), MMM(three letters), MMMM(full name)
		days: dd
		days name: E(weekDay / three letters), EEEE(full name)
 */
    public static void main(String[] args) {                      //"MMM/dd/yyyy, E"
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(" MMM/dd/yyyy, EEEE"); // Jul/26/2020, Sunday

        LocalDate ld = LocalDate.of(2020,7,26);

        System.out.println(ld);
        System.out.println(ld.format(dateFormat));
        System.out.println( ld.format(dateFormat));



        /*
        2020-07-25
        07/25/2020

      hours: hh
      minutes: mm
      seconds: ss
      am/pm: a
        */

      DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat)); //format accept date time formatter
        // 08:05 PM
       // 08:06:57 PM





        // May/20/2019  DayName 4:30 pm

        DateTimeFormatter DtFormat = DateTimeFormatter.ofPattern("MMM/dd/yyyy EEEE hh:mm a");

        LocalDateTime time1 = LocalDateTime.of(2019,5,20,16,30);
        System.out.println(time1);
        System.out.println(time1.format(DtFormat)); //  May/20/2019 Monday 04:30 PM

        System.out.println(  LocalDateTime.now().format(DtFormat)); //    Jun/13/2021 Sunday 08:17 PM

       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime rightNow = LocalDateTime.now();

        System.out.println(rightNow);//2021-06-13T20:21:00.894
        System.out.println(rightNow.format(dtf)); //Sunday 08:21:00 PM



    }


}
