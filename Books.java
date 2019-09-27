import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Books extends Products{
	
	private Calendar calendar = new GregorianCalendar();

		public final int days = 10;
		
		private String author;
		
		public Books() {
			super();
		}
		public Books(String title, String a) {
			super(title);
			this.author=a;
		}
		
		public void setAuthor(String s) {
			this.author=s;
		}
		public String getAuthor() {
			return this.author;
		}
		
		public int getPrice() {
			return this.days;
			
		}
		
		
}

//have a get toll method that the products static method can get. 