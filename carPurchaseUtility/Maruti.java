package carPurchaseUtility;

public class Maruti extends Car{
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

public Double getResaleValue() {
	return resaleValue;
}
public void setResaleValue(Double resaleValue) {
	this.resaleValue = 0.6*price;
}
/*public int getId() {
	return id;
}
public void setId(int id) {
	id++;
}*/
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getType()
{
	return "Maruti";
}

}
