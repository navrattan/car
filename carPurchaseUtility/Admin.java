package carPurchaseUtility;
import java.util.*;
import java.util.Random;
import java.util.ArrayList;

public class Admin {
	private int i=0;
	ArrayList<Customer> listOfCustomer=new ArrayList<Customer>();
	public void addNewCustomer(ArrayList<Car> listOfCar,String customerName)
	{ 
		
		
		Customer custObj=new Customer();
		custObj.setListOfPurchasedCar(listOfCar);
	    custObj.setCustomerId();
	    custObj.setName(customerName);
		listOfCustomer.add(i,custObj);	
		
		System.out.println("NEW CUSTOMER ADDED DETAILS:");
		System.out.println("CUSTOMER NAME :"+custObj.getName());
		System.out.println("NEW CUSTOMER Id:"+custObj.getCustomerId());
		System.out.println("Car Purchased :"+listOfCar);
		
		
		i++;
		
	}
	public void addNewCarToExistingCustomer(ArrayList<Car> listOfCar, int customerId)
	{ 
		int j=0,i=0;
		j=listOfCustomer.size();
		Customer obj=null;
		for(i=0;i<j;i++)
		{
			obj=listOfCustomer.get(i);
			if(obj.getCustomerId()==customerId)
			{
				obj.setListOfPurchasedCar(listOfCar);
				
			}
				
		}
		System.out.println("NEW CAR TO EXISTING CUSTOMER:");
		System.out.println("CUSTOMER Id :"+customerId);
		System.out.println("CUSTOMER NAME:"+obj.getName());
		System.out.println("Car Purchased :"+listOfCar);
		
		
	}
	public void listOfAllCustomers()
	{
		
		Collections.sort(listOfCustomer,new Comparator<Customer>(){public int compare(Customer c1,Customer c2)
			{return c1.getName().compareTo(c2.getName());}});
		System.out.println("LIST OF ALL CUSTOMERS :");
		int i=0,j=0;
		j=listOfCustomer.size();
		for(i=0;i<j;i++)
		{
			Customer obj=null;
			obj=listOfCustomer.get(i);
			System.out.println("CUSTOMER NAME:"+obj.getName());
		System.out.println("CUSTOMER ID :"+obj.getCustomerId());
		System.out.println("LIST OF PURCHASED CAR :"+obj.getListOfPurchasedCar());
		}
	}
	public void viewList()
	{
		System.out.println("LIST OF ALL CUSTOMERS :");
		int i=0,j=0;
		j=listOfCustomer.size();
		for(i=0;i<j;i++)
		{
			Customer obj=null;
			obj=listOfCustomer.get(i);
			System.out.println("CUSTOMER NAME:"+obj.getName());
		System.out.println("CUSTOMER ID :"+obj.getCustomerId());
		System.out.println("LIST OF PURCHASED CAR :"+obj.getListOfPurchasedCar());
		}
	}
	public void generatePrize(int a[])
	{
		Customer obj=null;
		int i=0,j=0,flag=0;
		j=listOfCustomer.size();
		int b[]=new int[6];
		for(i=0;i<=5;i++)
		{
			Random rand=new Random();
			b[i]=rand.nextInt(j-1);
		}
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=5;j++){
				if(a[i]==b[j]){
					obj=listOfCustomer.get(i);
					System.out.println("CONGRATULATIONS YOU WON :");
					System.out.println("CUSTOMER ID :"+a[i]);
					System.out.println("CUSTOMER NAME:"+obj.getName());
					flag=0;
				}
				else
					if(flag==0)
					{
						System.out.println("NO PRIZE AWARDED :");
					}
				
			}
		}
	}

}
