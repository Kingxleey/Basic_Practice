package testingProcess;
import java.util.Date;
public class testingNew {
	public static void main(String[] args) {
		//This is a short self introduction
String message = new String("My name is Okoli kingsley,i am a Seamfixer."
		+ "\nIt is fun working on java project "
		+ "and below is todays date and my first java program.");
		System.out.println(message);
		
		//This is just the length and the index of the string below
		System.out.println(message.length());
		System.out.println(message.indexOf("c"));
		
		//This is just the date and time
		System.out.println("Here is today's date and current time");
		Date todaysDate = new Date();
		System.out.println(todaysDate);
		System.out.println("\n");
		
	   //This is the multiplication table from one to twelve
		for(int i=1;i<=12;i++) {
			for (int table=1; table<=12;table++) {
			System.out.println(i+ "*" +table+ "=" +(table*i));
			}
			System.out.println("\n");		
  }
 }
}