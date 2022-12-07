// Java program to Find the Day
// for a Date
import java.util.*;

public class dara
{
	// Print Day for a Date
    static String Day(int day)
    {
        HashMap<Integer, String> daysOfWeek = new HashMap<Integer, String>(){{
            put(1, "Sunday");
            put(2, "Monday");
            put(3, "Tuesday");
            put(4, "Wednesday");
            put(5, "Thursday");
            put(6, "Friday");
            put(7, "Saturday");
         }};
        

        return daysOfWeek.get(day);

    }
    static int Month(String month)
    {
        HashMap<String, Integer> mapMonth = new HashMap<String, Integer>(){{
            put("january", 1);
            put("february", 2);
            put( "march", 3);
            put("april", 4);
            put( "may", 5);
            put("june", 6);
            put( "july", 7);
            put( "august", 8);
            put( "september", 9);
            put( "octomber", 10);
            put( "november", 11);
            put( "december", 12);
         }};
        

        return mapMonth.get(month);

    }
	static int Zeller(int day, int month, int year)
	{
        int day_of_week =  ((day + (13 * (( month + 9 ) % 12 + 1)-1)/5 + year % 100/4 + year/400 - 2*(year/100)%7 + 7)%7 + 1-2*(year/100)%7 +7)%7 + 1;
        
        return day_of_week;
	}
	
	// Driver code
	public static void main(String[] args)
	{
        Scanner userDate = new Scanner(System.in);
        try {
             String[] date;
        
        // Enter username and press Enter
        System.out.println("Enter Date: "); 
        date = userDate.nextLine().split(" "); 

        int month = Month(date[0].toLowerCase());
        int day =  Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);
		String answer = Day(Zeller(day, month, year)); 
        System.out.println(answer);
        }
        catch (Exception e) {
            System.out.println("Error !!! \nUsage: Month Day Year");

        }
        finally {
            userDate.close();

        }
       
	}
}
