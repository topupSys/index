package projectoop;

public class Card {

		private String card_id;
		private String mobile_operation;
		private String exp_date;
		private int amount;
		private int quantity;
		
		public Card(){
			
		}
		
		public Card(String card_id, String mobile_operation, String exp_date, int amount, int quantity){
			this.card_id = card_id;
			this.mobile_operation = mobile_operation;
			this.exp_date = exp_date;
			this.amount = amount;
			this.quantity = quantity;
		}
		
		public void setCardId(String card_id){
			this.card_id = card_id;
		}
		
		public void setMobileOperation(String mobile_operation){
			this.mobile_operation = mobile_operation;
		}
		
		public void setExpDate(String exp_date){
			this.exp_date = exp_date;
		}
		
		public void setAmount(int amount){
			this.amount = amount;
		}
		
		public void setQuantity(int quantity){
			this.quantity = quantity;
		}
		
		public String getCardId(){
			return card_id;
		}
		
		public String getMobileOperation(){
			return mobile_operation;
		}
		
		public String getExpDate(){
			return exp_date;
		}
		
		public int getAmount(){
			return amount;
		}
		
		public int getQuantity(){
			return quantity;
		}
	}


