import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TIMEZONECONV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int timezone = 0;
        boolean validInput = false;
        
        while (true) {
            while (!validInput) {
                System.out.println(" 0. To stop. \n 1.Alaska time \t 2.Central time \t 3.Eastern time \t 4.Hawaii-Aleutian time \t 5.Mountain time \t 6.Pacific time");
                if (input.hasNextInt()) {
                    timezone = input.nextInt();
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next(); 
                }
            }     
            
            switch (timezone) {
                case 0:
                    System.out.println("BAI BAI :3");
                    System.exit(0);
                    break;
                case 1:
                    printCurrentTime("America/Anchorage");
                    break;
                case 2:
                    printCurrentTime("America/Chicago");
                    break;
                
                default:
                    System.out.println("Invalid timezone inputed.");
                    break;
            }
            
            validInput = false;
        }
    }
    
    public static void printCurrentTime(String timezoneId) {
    LocalTime currentTime = LocalTime.now(ZoneId.of(timezoneId));
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String formattedTime = currentTime.format(timeFormatter);
    System.out.println(formattedTime);
    }
}
//https://docs.oracle.com/middleware/1221/wcs/tag-ref/MISC/TimeZones.html TIMEZONES FOR "printCurrentTime" method