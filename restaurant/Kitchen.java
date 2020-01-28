

public class Kitchen{
	
	private String menu;
	private double foodCost;
	private boolean isClean;
	private String  kitchenName;
	
	public void setMenu(String menu){
		this.menu = menu;
	}
		
	public String getMenu(){
		return menu;
	}
	
	public void setfoodCost(double foodCost){
		this.foodCost = foodCost;
	} 
	
	public double getfoodcost(){
		return foodCost;
	}
	
	public void isItClean(boolean isClean){
		this.isClean = isClean;
	}
	
	public boolean getClean(){
		return isClean;
	}
	
	//public void setKitchenName(String kitchenName){
		//this.kitchenName = kitchenName;
	//}
	
	//public String getKitchenName(){
		//return kitchenName;
	//}
	
}