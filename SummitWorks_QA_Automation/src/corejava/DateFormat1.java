package corejava;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.text.DateFormat;

public class DateFormat1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		DateFormat df = new SimpleDateFormat("dd:MMM:yyyy:hh:mm:ss:w");
		System.out.println(df.format(d));
		int dw = df.DAY_OF_WEEK_IN_MONTH_FIELD;
        System.out.println(dw);
	

	}

	
	}


