package jw.annocom;
import java.util.Date;

public class SuppressWarningDemo {

	//@SuppressWarnings("all")
	//@SuppressWarnings("unchecked")
	//@SuppressWarnings({"unused"})
	//@SuppressWarnings({"unused","deprecation"})
	@SuppressWarnings(value={"unused","deprecation"})
	public static void main(String[] args) {
		int a = 5;
		
		Date d = new Date();
		System.out.println(d.getYear());	
	}

}
