package CabInvoiceGenerator;

public class Ride 
{
	public int time;
	public double distance;

	/**
	 * parametrised constructor of the class
	 * @param distance
	 * @param time
	 */
	public Ride(double distance , int time)
	{
		this.distance = distance;
		this.time = time;
	}
}
