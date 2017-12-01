package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Joshua
 *
 */
public class SimpleDateFormatDemo1 {
	public static void main(String[] args) throws ParseException {
		String str = "2008-01-01 20:02:02";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(str);
		System.out.println(date);
	}

}
