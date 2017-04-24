package topupsys;

public class customer {
   private double mobile_data; //mobile topup
   private String exp_date;// expiration date of topup
   
   customer(){
	   
   }
   
   customer(double mobile_data, String exp_date){
	   this.mobile_data = mobile_data;
	   this.exp_date = exp_date;
   }

public double getMobile_data() {
	return mobile_data;
}

public void setMobile_data(double mobile_data) {
	this.mobile_data = mobile_data;
}

public String getExp_date() {
	return exp_date;
}

public void setExp_date(String exp_date) {
	this.exp_date = exp_date;
}
   
   
}
