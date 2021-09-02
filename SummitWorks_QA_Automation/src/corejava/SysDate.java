package corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SysDate {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		DateFormat df = new SimpleDateFormat("dd:MMM:yyyy:hh:mm:ss:w");
		System.out.println(df.format(d));

	}

}
