class ShoppingDetails 
{
	public static void main(String[] args) 
	{
		String productName= "Laptop";
		int productPrice=50000,quantity=2;
		float discount=0.1f;
		int totalAmt = productPrice*quantity;
		float discountAmt = totalAmt*discount;
		float finalAmt = totalAmt-discountAmt;
		System.out.println("---------Shopping Details----------");
		System.out.println("Product Name = "+productName);
		System.out.println("Product Price = "+productPrice);
		System.out.println("Product quantity = "+quantity);
		System.out.println("Discount = "+discount+"%");
		System.out.println("Total amount = "+totalAmt);
		System.out.println("Discount amount = "+discountAmt);
		System.out.println("Final amount = "+finalAmt);
	}
}
