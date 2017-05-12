package projectoop;

public class Agent extends Card{
	private String username;
	private String password;
	
	public Agent(){
		
	}
	
	public Agent(String username, String password){
		this.username = username;
		this.password = password;
	}

	public Agent(String username, String password, String card_id, String mobile_operation, String exp_date, double amount, int quantity){
		this.username = username;
		this.password = password;
		setCardId(card_id);
		setMobileOperation(mobile_operation);
		setExpDate(exp_date);
		setAmount(amount);
		setQuantity(quantity);
	}
	
	public void setUserName(String username){
		this.username = username;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getUserName(String username){
		return username;
	}
	
	public String getPassword(String password){
		return password;
	}
	
	
}