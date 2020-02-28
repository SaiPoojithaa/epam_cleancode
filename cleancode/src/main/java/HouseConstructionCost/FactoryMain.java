package HouseConstructionCost;

public class FactoryMain 
{
	  public double calculate(String s,int cost1)
	  {  
	      GetMaterial planFactory = new GetMaterial();    
	      TotalHouseCost object = planFactory.Type(s);  
	      object.getCost();
	        return object.Calculate(cost1); 
	          
	            }  

}
