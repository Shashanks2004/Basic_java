class  ElectricityBill
{
	public static void main(String[] args) 
	{
		int customerId = 501,cost=8,prevReading = 12450,currReading = 12750;
		String customerName = "Raj";
		int consumedUnits = currReading-prevReading;
		int bill = consumedUnits*cost;
		System.out.println("---------Electricity Bill----------");
        System.out.println("Customer ID = "+customerId);
		System.out.println("Customer Name = "+customerName);
		System.out.println("Previous Meter Reading = "+prevReading);
		System.out.println("Current Meter Reading = "+currReading);
		System.out.println("Cost per Unit = "+cost);
		System.out.println("Total units Consumed = "+consumedUnits);
		System.out.println("Final Payable Amount = "+bill);
	}
}
