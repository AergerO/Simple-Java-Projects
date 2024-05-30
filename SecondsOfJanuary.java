import java.time.Month;
import java.time.YearMonth;

public class Main {
	
	public static void main(String[] args) {
		YearMonth yearMonthObject = YearMonth.of(2024, 1);
		Month month = yearMonthObject.getMonth();
		int year = yearMonthObject.getYear();
		int daysInMonth = yearMonthObject.lengthOfMonth();
		int hours = daysInMonth * 24;
		int minutes = hours * 60;
		int seconds = minutes * 60;
		
		System.out.println("Year: " + year + " Month: " + month);
		System.out.println("----------------------------------");
		System.out.println("Days of " + month + " : " + daysInMonth);
		System.out.println("Hours of " + month + " : " + hours);
		System.out.println("Minutes of " + month + " : " + minutes);
		System.out.println("Seconds of " + month + " : " + seconds);
	}

}
