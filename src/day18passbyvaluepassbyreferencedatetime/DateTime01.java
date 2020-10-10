package day18passbyvaluepassbyreferencedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

	public static void main(String[] args) {
		
		//Date
		LocalDate currentDate01 = LocalDate.now();
		System.out.println(currentDate01);//2020-10-04
		
		System.out.println(currentDate01.plusDays(3));//2020-10-07
		System.out.println(currentDate01.plusMonths(4));//2021-02-04
		System.out.println(currentDate01.plusYears(2));//2022-10-04
		
		System.out.println(currentDate01.minusDays(5));//2020-09-29
		System.out.println(currentDate01.minusMonths(5));//2020-05-04
		System.out.println(currentDate01.minusYears(5));//2015-10-04
		
		System.out.println(currentDate01.minusMonths(3).minusDays(2).plusYears(3));//2023-07-02
		
		//Time
		LocalTime currentTime01 = LocalTime.now();
		System.out.println(currentTime01);//12:37:07.023
		System.out.println(currentTime01.plusHours(2).plusMinutes(5).plusSeconds(11));//14:42:18.023
		System.out.println(currentTime01.minusHours(2).minusSeconds(20));//10:36:47.023
		
		//Date and Time
		LocalDateTime curDateTime01 = LocalDateTime.now();
		System.out.println(curDateTime01);//2020-10-04T12:39:42.124
		
		//How to update date format
		LocalDate currentDate02 = LocalDate.now();
		System.out.println(currentDate02);//2020-10-04
		
		DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("dd/MMM/yy");
		System.out.println(dtf02.format(currentDate02.plusDays(11)));//15/Oct/20
		
		//How to update time format
		LocalTime currentTime02 = LocalTime.now();
		System.out.println(currentTime02);//12:53:45.933
		
		DateTimeFormatter dtf03 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf03.format(currentTime02.plusHours(3)));//03:55
		
		DateTimeFormatter dtf04 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf04.format(currentTime02.plusHours(3)));//15:55	
		
		//How to get local time of any city or country
		LocalTime localTime = LocalTime.now(ZoneId.of("Europe/Moscow"));
		System.out.println(localTime);

	}
}
