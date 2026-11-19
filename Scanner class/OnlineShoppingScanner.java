import java.util.Scanner;
class OnlineShoppingScanner
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ID");
		int orderID = s.nextInt();
		System.out.println("Enter Customer ID:");
		String customerID = s.next();
		System.out.println("ENter Customer Name:");
		String customerName = s.next();
		System.out.println("Enter ProductID:");
		String productID = s.next();
		System.out.println("Enter Product Name:");
		String productName = s.next();
		System.out.println("Enter Product Price:");
		double productPrice = s.nextDouble();
		System.out.println("Enter Quantity:");
		int quantity = s.nextInt();
		System.out.println("Enter Discount:");
		String discount = s.next();
		System.out.println("Enter total Amount:");
		double totalAmount = s.nextDouble();
		System.out.println("Enter Final Amount:");
		double finalAmount = s.nextDouble();
		System.out.println("Enter Payment Method:");
		String paymentMethod = s.next();
		System.out.println("Enter Payment Status:");
		String paymentStatus = s.next();
		
		System.out.println("OrderID = "+orderID);
		System.out.println("CustomerID = "+customerID);
		System.out.println("Customer Name = "+customerName);
		System.out.println("ProductID = "+productID);
		System.out.println("Product Name = "+productPrice);
		System.out.println("Product Price = "+productPrice);
		System.out.println("Quantity = "+quantity);
		System.out.println("Discount = "+discount);
		System.out.println("TotalAmount = "+totalAmount);
		System.out.println("FinalAmount = "+finalAmount);
		System.out.println("PaymentMethod = "+paymentMethod);
		System.out.println("PaymentStatus = "+paymentStatus);
	}
}
