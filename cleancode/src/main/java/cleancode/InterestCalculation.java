package cleancode;
public class InterestCalculation 
{
	public  double Simpleinterest(double principle,int time,double rate_of_interest)
	{
		return (principle*time*rate_of_interest)/100;
	}
	public double Compoundinterest(double principle,double rate_of_interest,int time)
	{
		return principle*Math.pow((1+(rate_of_interest/100)),time);
	}
}