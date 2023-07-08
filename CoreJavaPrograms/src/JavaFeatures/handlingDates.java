package JavaFeatures;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class handlingDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate curentDate=LocalDate.now();
		System.out.println("curent time : "+curentDate);
		
		LocalTime curenttime=LocalTime.now();
		System.out.println("curent time : "+curenttime);
		
		LocalDateTime curentDatetime=LocalDateTime.now();
		System.out.println("curent date and time : "+curentDatetime);
		
		//setting date in string format
		LocalDate date=LocalDate.parse("2002-06-17");
		System.out.println("setting date using parse() : "+date);
		
		LocalDate date2=LocalDate.of(2004, 8, 17);
		System.out.println("setting date using of() : "+date2);
		
		//retreving yesterday's and tomorrow's days 
		LocalDate yesterdayDate=curentDate.minusDays(1);
		LocalDate tmrDate=curentDate.plusDays(1);
		System.out.println("yesterdayDate's date : "+yesterdayDate);
		System.out.println("tomorrow's date is : "+tmrDate);
		
		//cheking leap year
		System.out.println("is a leap year? "+curentDate.isLeapYear());
		
		//setting new date time pattern/format
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate=curentDatetime.format(formatter);
		System.out.println("\nFormatted Date : "+formattedDate);
		
		//handiling Zones
		ZonedDateTime curentZoneTime=ZonedDateTime.now();
		System.out.println("\ncurent date and time : "+curentZoneTime);
		
		System.out.println("curent Zone : "+curentZoneTime.getZone());
		
		//changing zone
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		
		ZonedDateTime tokyoZone=curentZoneTime.withZoneSameInstant(tokyo);
		System.out.println("Tokyo zone : "+tokyoZone);
		
		//ZoneId LosAngeles=ZoneId.of("Asia/LosAngeles");
		
		//ZonedDateTime LosAngelesZone =curentZoneTime.withZoneSameInstant(LosAngeles);
				
		
		
		

	}

}
