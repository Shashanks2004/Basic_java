class ShoppingDetails 
{
	public static void main(String[] args) 
	{
		String pdName = "HeadPhones";
		int price=2000, quantity=3,totalAmt=price*quantity;
		double finalBill = totalAmt>5000 ? totalAmt*0.10 : totalAmt*0.05;
		double discount = totalAmt-finalBill;
		System.out.println("Product Name : "+pdName);
		System.out.println("Product quantity : "+quantity);
		System.out.println("Discount : "+finalBill);
		System.out.println("Final Amount : "+discount);
	}
}
