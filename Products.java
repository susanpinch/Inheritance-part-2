import java.util.*;

public class Products {
	protected String title;
	static Calendar c;

	
	
	public Products() {
		
	}

	public Products(String t) {
		this.title=t;
	}
	
	public void setTitle(String t) {
		this.title=t;
	}
	public String getTitle() {
		return this.title;
	}
	
	public Date setTime(int year, int month, int dayOfMonth, int hours, int minutes, Books b, DVDs d) {
		this.c= new GregorianCalendar(year,month,dayOfMonth,hours,minutes);
		if(b!=null) {
			c.add(Calendar.DAY_OF_MONTH, +b.getPrice());
		}
		else if(d!=null) {
			c.add(Calendar.DAY_OF_MONTH, +d.getPrice());
		}
		
		return c.getTime();
	}
	
	
	
	
	public static Date currentTime(int year, int month, int dayOfMonth, int hours, int minutes) {
		c = new GregorianCalendar(year,month,dayOfMonth,hours,minutes);
		return c.getTime();
	}


}
