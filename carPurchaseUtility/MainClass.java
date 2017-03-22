package carPurchaseUtility;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
	     ArrayList<Car> listOfCar = new ArrayList<Car>();
	     ArrayList<Car> listOfCarToAdd = new ArrayList<Car>();
	    final int AddNewCustomer=0;
	    final int AddNewCarToExistingCustomer=1;
		final int SortAllCustomer=2;
		final int ViewAllList=3;
		final int Award=4;
		int getInput,getCar;
		                  Scanner ob = new Scanner(System.in);
		                    
		                      Admin obj =new Admin();
		do{
		System.out.println("PRESS 0 TO ADD NEW CUSTOMER :");
		System.out.println("PRESS 1 TO ADD NEW CAR TO EXISTING CUSTOMER :");
		System.out.println("PRESS 2 TO SORT ALL CUSTOMER :");
		System.out.println("PRESS 3 VIEW LIST OF ALL CUSTOMERS:");
		System.out.println("PRESS 4 TO GIVE PRIZE:");
		System.out.println("PRESS 5 TO EXIT:");
		getInput=ob.nextInt();
switch(getInput)
		{
case AddNewCustomer:
		                     { 
		                    	 
		                    	 for(int i=0;i<=5;i=i++)
		                    	 {
		                    		 
		                    	 System.out.println("PRESS 0 TO ADD TAYOTA  :");
		                    	 System.out.println("PRESS 1 TO ADD MARUTI  :");
		                    	 System.out.println("PRESS 2 TO ADD HYUNDAI  :");
		                    	 System.out.println("PRESS 3 TO EXIT :");
		                    	 getCar=ob.nextInt();
		                    	 if(getCar==0)
		                    	 {
		                    		 Car carObj=new Toyota();
		                    		 listOfCar.add(carObj);
		                    	 }
		                    	 else if(getCar==1)
		                    	 {
		                    		 Car carObj=new Maruti();
		                    		 listOfCar.add(carObj);
		                    	 }
		                    	 else if(getCar==2)
		                    	 {
		                    		 Car carObj=new Hyundai();
		                    		 listOfCar.add(carObj);
		                    	 }
		                    	 else
		                    		 break;
		                         }
		                    	System.out.println("enter the name of customer");
		                    	 obj.addNewCustomer(listOfCar,ob.next());                                  	 
		                    	 
		                     }
			                       break;
		
		
case AddNewCarToExistingCustomer:    
                                   {
			                           for(int i=0;i<=5;i=i++)
       	                                  {
                                             System.out.println("PRESS 0 TO ADD TAYOTA  :");
                                          	 System.out.println("PRESS 1 TO ADD MARUTI  :");
       	                                     System.out.println("PRESS 2 TO ADD HYUNDAI  :");
                                           	 System.out.println("PRESS 3 TO EXIT :");
       	                                     getCar=ob.nextInt();
       	                                       if(getCar==0)
                                             	 {
                                                  	 Car carObj=new Toyota();
       		                                            listOfCarToAdd.add(carObj);
       	                                         }
       	                                     else if(getCar==1)
                                                {
       		                                         Car carObj=new Maruti();
                                                       listOfCarToAdd.add(carObj);
       	                                         }
                                               	 else if(getCar==2)
                                                   	 {
       		                                           Car carObj=new Hyundai();
       		                                              listOfCarToAdd.add(carObj);
       	                                             }
       	                                               else
       		                                              break;
                                                 }
			
				System.out.println("ENTER YOUR CUSTOMER ID :");
				obj.addNewCarToExistingCustomer(listOfCarToAdd,ob.nextInt());
		}
		           break;
	
case SortAllCustomer:          {
			
	                               obj.listOfAllCustomers();
			
		                         }
			         break;

 
case ViewAllList:             {
			                        obj.viewList();	
			
		                       }
			break;


case Award:                    {
	                               int a[]=new int[3];
	                               
	                               
	                               for(int i=0;i<=2;i++)
	                               {
	                            	  System.out.println("ENTER THREE NUMBERS :");
	                            	  a[i]=ob.nextInt(); 
	                               }
	                                 obj.generatePrize(a);  
                                }
            break;			


default:
				System.out.println("Invalid input:");
		
		    }
		}while(getInput!=5);
	}
}
