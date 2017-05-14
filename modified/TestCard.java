package projectoop;
import java.util.Scanner;

public class TestCard {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		int choice;
		int telco;
		
		Card card1 = new Card("A 1001", "Maxis", "22-01-2018", 100, 15);
		Card card2 = new Card("A 1002", "Digi", "03-03-2018", 100, 15);
		Card card3 = new Card("A 1003", "Celcom", "25-03-2018", 100, 15);
		Card card4 = new Card("A 1004", "U-mobile", "14-02-2018", 100, 15);
		Card card5 = new Card("A 1005", "Tunetalk", "05-08-2018", 100, 15);
		
		Agent agent1 = new Agent();
		
		Card_sold sold1 = new Card_sold();
		
		System.out.println("Enter your username: "); 
		agent1.getUserName(input.next());
		System.out.println("Enter your password: ");
		agent1.getPassword(input.next());
		
		System.out.println("1. Reload for customer");
		System.out.println("2. Report");
		System.out.println("Enter your choice: ");
		choice = input.nextInt();
		
		if(choice == 1){
			card1.getMobileOperation();
			System.out.println("Maxis");
			System.out.println("Digi");
			System.out.println("Celcom");
			System.out.println("U-mobile");
			System.out.println("Tunetalk");
			
			System.out.println("Enter customer's telco: ");
			card1.setMobileOperation(input.next()); 
			switch(card1.getMobileOperation()){
				case "Maxis" :
								System.out.println("Enter customer's phone no.: ");
								int phone_no = input.nextInt();
								card1.getAmount();
								System.out.println("RM5");
								System.out.println("RM10");
								System.out.println("RM30");
								System.out.println("RM50");
								System.out.println("Enter amount of top-up: ");
								int amount = input.nextInt();
								switch(amount){
								case 5: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
								case 10: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
								case 30: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
								case 50: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
								}
								break;
								
				case "Digi" : 
					System.out.println("Enter customer's phone no.: ");
				    phone_no = input.nextInt();
					card1.getAmount();
					System.out.println("RM5");
					System.out.println("RM10");
					System.out.println("RM30");
					System.out.println("RM50");
					System.out.println("Enter amount of top-up: ");
					amount = input.nextInt();
					switch(amount){
					case 5: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					case 10: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					case 30: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					case 50: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					}break;
					
				case "Celcom" : 
					System.out.println("Enter customer's phone no.: ");
					phone_no = input.nextInt();
					card1.getAmount();
					System.out.println("RM5");
					System.out.println("RM10");
					System.out.println("RM30");
					System.out.println("RM50");
					System.out.println("Enter amount of top-up: ");
					amount = input.nextInt();
					switch(amount){
					case 5: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					case 10: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					case 30: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					case 50: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					}break;
					
				case "Umobile" :
					System.out.println("Enter customer's phone no.: ");
					phone_no = input.nextInt();
					card1.getAmount();
					System.out.println("RM5");
					System.out.println("RM10");
					System.out.println("RM30");
					System.out.println("RM50");
					System.out.println("Enter amount of top-up: ");
					amount = input.nextInt();
					switch(amount){
					case 5: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					case 10: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					case 30: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					case 50: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					}break;
					
				case "Tunetalk" :
					System.out.println("Enter customer's phone no.: ");
					phone_no = input.nextInt();
					card1.getAmount();
					System.out.println("RM5");
					System.out.println("RM10");
					System.out.println("RM30");
					System.out.println("RM50");
					System.out.println("Enter amount of top-up: ");
					amount = input.nextInt();
					switch(amount){
					case 5: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					case 10: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					case 30: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					case 50: System.out.println("Thank you! You have reloaded "+amount+ " for "+phone_no);break;
					}break;
				default : System.out.println("Sorry! This mobile operation does not exist.");
			
			} 
			
		}
		
		//the code for choice 2
		//we prompt the agent to choose the telco category first
			else if(choice == 2){
				System.out.println("1. Maxis");
			    System.out.println("2. Digi");
			    System.out.println("3. Celcom");
			    System.out.println("4. Umobile");
			    System.out.println("5. Tunetalk");
			    System.out.println("Enter your telco report: ");
			    telco = input.nextInt();
			    sold1.setSales_report(null); //we set the sales report to null to avoid error
			    switch(sold1.getSales_Report()){
			     case " 1. Maxis" :
			    	   System.out.println(" Total Sales : " + sold1.getMaxis());
			     case " 2. Digi" :
			    	   System.out.println(" Total Sales : " + sold1.getDigi());  
			     case " 3. Celcom" :
			    	   System.out.println(" Total Sales : " + sold1.getCelcom());
			     case " 4. Umobile" :
			    	   System.out.println(" Total Sales : " + sold1.getUmobile());
			     case " 5. Tunetalk" :
				    	   System.out.println(" Total Sales : " + sold1.getTunetalk());
			         }
		 
	}

}
