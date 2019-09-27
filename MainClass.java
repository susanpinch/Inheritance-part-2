import java.util.Random;
import java.util.*;



/*In the main class, we will be creating a book, dvd, and video object. Then we will assign titles and authors, directors, etc.
 * After this, I will randomly pick a month, day, and year to be the date at which the person takes out the product, then return to them
 * when the product is due. 
 * 
 * In this project, I created three classes: books, dvds, products, and videos. Products is the parent class of books and dvds 
 * and grandparent class of videos. In the products, class, the subclasses share the property title. The other classes have 
 * properties individual to their class. In the product class, also ,there is a method called time which takes in a time and returns
 * the due date for that proeprty. It takes in a bunch of parameters, and the last three are the different obejcts. 
 * Since there is only supposed to be one method like this, i had to separate the due dates by putting null in for the other object
 * that isnt being called. Moreover, I had a currentTime method to retrieve the current time from the main class, to test that the 
 * book would be returned in the set amount of days. 
 * 
 * 
 * 
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		int nMonth;
		int nday;
		int nyear;
		int nhours;
		int nminutes;
		Date day;
		Books b1 = new Books();
		b1.setTitle("How to kill a mocking bird");
		b1.setAuthor("Harper Lee");
		
		 
		DVDs d1 = new DVDs();
		d1.setTitle("Neighbors");
		d1.setDirector("M. Night Shamalyn");
		
		Videos v = new Videos();
		v.setTitle("Awesome Parkour");
		v.setDirector("PewDie Pie");
		
		 
		 
		 Products[] pArray = {b1,d1,v};
		 
		 Random r = new Random();
		 
		 for(int c = 0; c<3; c++) {
			 nMonth = r.nextInt(12)+1;
			 nhours = r.nextInt(24)+1;
			 nminutes = r.nextInt(61);
			 
			 if(nMonth==11 || nMonth==9 || nMonth==4 || nMonth==6 ) {
				 nday=r.nextInt(30)+1;
			 }
			 else if(nMonth ==2) {
				 nday=r.nextInt(28)+1;
			 }
			 else {
				 nday=r.nextInt(31)+1;
			 }
			 nyear=r.nextInt(3)+2016;
			 
			 
			 if(pArray[c] ==v || pArray[c]==d1) {
				  day = pArray[c].setTime(nyear, nMonth, nday, nhours, nminutes,null,d1);
				  if(pArray[c]==v) {
				  System.out.printf("Name of material: "+pArray[c].getTitle()+ " Directed by" + v.getDirector() + " borrowed on: "+ pArray[c].currentTime(nyear, nMonth, nday, nhours, nminutes)+"is due on "+day);}
				  else {
					  System.out.println("Name of material: "+pArray[c].getTitle()+ " Directed by: " +d1.getDirector()+" borrowed on: "+ pArray[c].currentTime(nyear, nMonth, nday, nhours, nminutes)+"is due on "+day );}

				  }

			 
			 else {
				 day = pArray[c].setTime(nyear, nMonth, nday, nhours, nminutes, b1,null);
				  System.out.println("Name of material: "+pArray[c].getTitle()+ " Authored by: " +d1.getDirector()+" borrowed on: "+ pArray[c].currentTime(nyear, nMonth, nday, nhours, nminutes)+"is due on "+day );}

			 }
			 
			 
			 
			 
		 }
		 
		 
		
		
		
		
		
		
	}

