import java.util.LinkedList;
import java.util.Scanner;
public class venues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i; // Number of times to loop
        System.out.print("How many venues are there?");
        i= scanner.nextInt(); 

        String[] venues = new String[i]; // Array to store venues
        for (int j = 0; j < i; j++) {
            System.out.print("Enter the name for venue " + (j + 1) + ": ");

            venues[j] = scanner.next();
        }

            for (int k = 0; k < i; k++) {
                System.out.print("How many events are there in venue " + venues[k] + "? ");
                int numEvents = scanner.nextInt();
            
                LinkedList<String> events = new LinkedList<String>();
                LinkedList<String> eventTimes = new LinkedList<String>(); // New LinkedList to store event times

                for (int m = 0; m < numEvents; m++) {
                    System.out.print("Enter the name for event " + (m + 1) + " in venue " + venues[k] + ": ");
                    events.add(scanner.next());

                    System.out.print("Enter the time for event " + (m + 1) + " in venue " + venues[k] + ": ");
                    eventTimes.add(scanner.next());
                }

        
                for (int n = 0; n < events.size(); n++) {
                    System.out.println(events.get(n) + " - " + eventTimes.get(n));
                } 
        
        }

       
        }

    } 









