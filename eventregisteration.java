import java.util.LinkedList;
import java.util.Queue;
 import java.util.Scanner;
public class eventregisteration {
public static void main(String[] args) {
Queue<Double> queue = new LinkedList<Double>();

System.out.println("EVENT REGISTERATION \n Full Name: " ); 
Scanner input= new Scanner (System.in);
String name= input.nextLine();

System.out.println("Phone Number:?"); 
String PN= input.nextLine();

System.out.println("What is your interest rate?"); 
double interestrate= input.nextDouble();

System.out.println("What is your monthly principle?"); 
double monthly= input.nextDouble();


}
}
