package CabInvoiceGenerator;

public class InvoiceSummary 
{

	public int length;
	public double totalFare;
	public double averageFare;
	
	/**
	 * parametrised constructor of the class.
	 * @param length
	 * @param totalFare
	 */
	public InvoiceSummary(int length, double totalFare) 
	{
		this.length = length;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare / this.length;
	}
	
	/**
	 * Equal method is used.
	 */
	@Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() !=o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return length == that.length &&
                Double.compare(that.totalFare,totalFare) == 0 &&
                Double.compare(that.averageFare,averageFare) == 0;
    }
}
