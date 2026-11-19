class EBillDetails 
{
	public static void main(String[] args) 
	{
		String customerName = "Raj";
		int consumedUnits=275, cost=6;
		int bill = consumedUnits<=100 ? consumedUnits*4 : consumedUnits>100&& consumedUnits<=200 ? consumedUnits*5 : consumedUnits*6;
		int rate = consumedUnits<=100 ? 4 : consumedUnits>100&& consumedUnits<=200 ? 5 : 6;
		System.out.println("Customer Name : "+customerName);
		System.out.println("Applicable : "+rate);
		System.out.println("Electricity Bill: "+bill);
	}
}
