package HouseConstructionCost;

public abstract class TotalHouseCost 
{
	protected double cost;
	abstract void getCost();
	public double Calculate(int squarefoot)
	{
		return(squarefoot*cost);
	}
}
