package topupsys;

public class agent {
     protected String name;
     protected String unique_id;

     agent(String name, String unique_id){
    	 this.name = name;
    	 this.unique_id = unique_id; 
     }
     
     public String getName(){
    	 return name;
     }
     
     public void setName(String name){
    	 this.name = name;
     }
     
     public String getUnique_id(){
    	 return unique_id;
     }
     
     public void setUnique_id(String id){
    	 this.unique_id = id;
     }
     
     public String getReport(){
    	 return name + unique_id;
     }

}
