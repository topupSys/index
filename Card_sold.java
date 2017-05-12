package projectoop;

public class Card_sold extends Card{
	public int[] card_sold = new int[5];
	protected int maxis= 0;
	protected int digi = 0;
	protected int celcom = 0;
	protected int umobile = 0;
	protected int tunetalk = 0;
	int total_maxis = 0;
	int total_digi = 0;
	int total_celcom = 0;
	int total_umobile = 0;
	int total_tunetalk = 0;
	
	public int getMaxis_RM5(){
		for(int i = 0; i<5; i++){
			maxis += 5;
		}
		
		return maxis;
	}
	
	public int getDigi_RM5(){
		for(int i = 0; i<5; i++){
			digi += 5;
		}
		
		return digi;
	}
	
	public int getCelcom_RM5(){
		for(int i = 0; i<5; i++){
			celcom += 5;
		}
		
		return celcom;
	}
	
	public int getUmobile_RM5(){
		for(int i = 0; i<5; i++){
			umobile += 5;
		}
		
		return umobile;
	}
	
	public int getTunetalk_RM5(){
		for(int i = 0; i<5; i++){
			tunetalk += 5;
		}
		
		return tunetalk;
	}
	
	public int getMaxis_RM10(){
		for(int i = 0; i< 5; i++){
			maxis +=10;
		}
		return maxis;
	}
	
	public int getDigi_RM10(){
		for(int i = 0; i< 5; i++){
			digi +=10;
		}
		return digi;
	}
	
	public int getCelcom_RM10(){
		for(int i = 0; i< 5; i++){
			celcom +=10;
		}
		return celcom;
	}
	
	public int getUmobile_RM10(){
		for(int i = 0; i< 5; i++){
			umobile +=10;
		}
		return umobile;
	}
	
	public int getTunetalk_RM10(){
		for(int i = 0; i< 5; i++){
			tunetalk +=10;
		}
		return tunetalk;
	}
	
	public int getMaxis_RM30(){
		for(int i = 0; i < 5; i++){
			maxis += 30;
		}
		return maxis;
	}
	
	public int getDigi_RM30(){
		for(int i = 0; i < 5; i++){
			digi += 30;
		}
		return digi;
	}
	
	public int getCelcom_RM30(){
		for(int i = 0; i < 5; i++){
			celcom += 30;
		}
		return celcom;
	}
	
	public int getUmobile_RM30(){
		for(int i = 0; i < 5; i++){
			umobile += 30;
		}
		return umobile;
	}
	
	public int getTunetalk_RM30(){
		for(int i = 0; i < 5; i++){
			tunetalk += 30;
		}
		return tunetalk;
	}
	
	public int getMaxis_RM50(){
		for (int i = 0; i < 5; i++){
			maxis += 50;
		}
		return maxis;
	}
	
	public int getDigi_RM50(){
		for (int i = 0; i < 5; i++){
			digi += 50;
		}
		return digi;
	}

	
	public int getCelcom_RM50(){
		for (int i = 0; i < 5; i++){
			celcom += 50;
		}
		return celcom;
	}

	
	public int getUmobile_RM50(){
		for (int i = 0; i < 5; i++){
			umobile += 50;
		}
		return umobile;
	}

	
	public int getTunetalk_RM50(){
		for (int i = 0; i < 5; i++){
			tunetalk += 50;
		}
		return tunetalk;
	}


	public int getMaxis(){
		total_maxis = +(getMaxis_RM5() + getMaxis_RM10() + getMaxis_RM30() + getMaxis_RM50());
		return total_maxis;
	}
	
	public int getDigi(){
		total_digi = +(getDigi_RM5() + getDigi_RM10() + getDigi_RM30() + getDigi_RM50());
		return total_digi;
	}
	
	public int getCelcom(){
		total_celcom = +(getCelcom_RM5() + getCelcom_RM10() + getCelcom_RM30() + getCelcom_RM50());
		return total_celcom;
	}
	
	public int getUmobile(){
		total_umobile = +(getUmobile_RM5() + getUmobile_RM10() + getUmobile_RM30() + getUmobile_RM50());
		return total_umobile;
	}
	
	public int getTunetalk(){
		total_tunetalk = +(getTunetalk_RM5() + getTunetalk_RM10() + getTunetalk_RM30() + getTunetalk_RM50());
		return total_tunetalk;
	}
	
	public int getTotal(){
		int total = 0;
		total = total_maxis + total_digi + total_celcom + total_umobile + total_tunetalk;
		return total;
	}
	
}	
