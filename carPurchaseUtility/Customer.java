package carPurchaseUtility;

import java.util.ArrayList;

public class Customer {
	private String name;
	//private int customerId;
	static int i=0;
	
	private ArrayList<Car> listOfPurchasedCar = new ArrayList<Car>();
	
	public ArrayList<Car> getListOfPurchasedCar() {
		return listOfPurchasedCar;
	}
	public void setListOfPurchasedCar(ArrayList<Car> listOfPurchasedCarLocal) {
		listOfPurchasedCar.addAll(listOfPurchasedCarLocal);
		
	}
	
	
	public int getCustomerId() {
		return i;
	}
	public void setCustomerId() {
		i++;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
