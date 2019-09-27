import java.util.*;

public class DVDs extends Products{
	private String director;
	protected Calendar calendar = new GregorianCalendar();

	
	public final int days = 20;
	
	
	
	public DVDs() {
		super();
	}
	
	public DVDs(String t, String s) {
		super(t);
		this.director = s;
	}
	public void setDirector(String d) {
		this.director = d;
	}
	public String getDirector() {
		return this.director;
	}
	public int getPrice() {
		return this.days;
		
	}
	
		
	}
