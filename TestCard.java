package projectoop;
import java.util.Scanner;

public class TestCard {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		int choice;
		
		Card card1 = new Card("A 1001", "Maxis", "22-01-2018", 200.00, 75);
		Card card2 = new Card("A 1002", "Digi", "03-03-2018", 100.00, 50);
		Card card3 = new Card("A 1003", "Celcom", "25-03-2018", 150.00, 60);
		Card card4 = new Card("A 1004", "U-mobile", "14-02-2018", 150.00, 60);
		Card card5 = new Card("A 1005", "Tunetalk", "05-08-2018", 70.00, 58);
		
		Agent agent1 = new Agent("jhgf", "kjh");
		
		System.out.println("Enter your username: " );
		agent1.setUserName(input.next());
		System.out.println("Enter your password: " +agent1.getPassword(input.next()));
		
		System.out.println("1. Reload for customer");
		System.out.println("2. Report");
		System.out.println("Enter your choice: ");
		choice = input.nextInt();
		
		if(choice == 1){
			System.out.println("Maxis");
			System.out.println("Digi");
			System.out.println("Celcom");
			System.out.println("U-mobile");
			System.out.println("Tunetalk");
			
			System.out.println("Enter customer's telco: ");
			card1.setMobileOperation(input.next());
			
			System.out.println("Enter customer's phone no.: ");
			int phone_no = input.nextInt();
			
			System.out.println("Enter amount of top-up: ");
		}
		
	}

	
	

}
