package day34_WrapperClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class warmUp {
/*
1. use the LocalDate & Time get the current date and time in the following format:

			Sunday, 09:51 AM, Jul/26/2020
 */
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime today = LocalDateTime.now();

        System.out.println(today);
        System.out.println(today.format(dtf)); //Monday, 11:06 AM, Jun/14/2021



    }
}
