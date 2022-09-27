package comp1000_pa1;
import java.util.scanner
public class PA1a {
    public static viod main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter number of yards: ")
    int yards = input.nextInt();
    System.out.println("Enter number of feet: ");
    int feet = input.nextInt();
    System.out.println("Enter number of inches: ")
    int inches = input.nextInt();
    
    int totalinches = (yards *36) + (feet + 12) + inches;
    System.out.println("Total number of inches" + totalinches);

}
    }
