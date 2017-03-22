package carPurchaseUtility;

public abstract class Car {

private static int idSetter=1100;
 String model;
  public Double price;
  public Double resaleValue;
  final int id;
  
 abstract public String getType();
 public  Car() {
		id=idSetter++;
		
	}
 public int getId() {
		return id;
	}
	
}
