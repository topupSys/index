package topupsys;

public class users {
	    private String name; // name of user
	    private String password; // the password of user account
		protected int option; // choose topup carrier
		protected int choice; // the choice
		protected double balance; // balance remaining in the phone
		protected String telco; // carrier choose
		protected double amount; // amount to be topup
		protected int data; // mobile data obtain
		
	public users(){
		
	}
	
	public users(String name, String password, int opt, int choice, double balance, String telco, double amount){
		this.name = "";
		this.password = "";
		this.option = 0;
		this.choice = 0;
		this.balance = 0.0;
		this.telco = "";
		this.amount = 0.0;
	}
	
	public int getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public int getOption(){
		return option;
	}
	
	public void setOption(int option){
		this.option = option;
	}
	
	public int getChoice(){
		return choice;
	}
	
	public void setChoice(int choice){
		this.choice = choice;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public String getTelco(){
		return telco;
	}
	
	public void setTelco(String telco){
		this.telco = telco;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public void setAmount(double amount){
		this.amount = amount;
	}
	
	public String getAccount(){
		return name + password;
	}
	
	public boolean getLogin(){
		if(name == 1 && password == 1){
			return true;
		}else{
			return false;
		}
	}
	
	public double getPayment(){
		return amount + balance;
	}
	
	public double getData(){
		return data;
	}
	
	
}
