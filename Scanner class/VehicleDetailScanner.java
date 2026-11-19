import java.util.Scanner;
class VehicleDetailScanner
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Vehicle Number:");
		String vehicleNumber = s.next();
		System.out.println("Enter Owner Name:");
		String ownerName = s.next();
		System.out.println("Enter Brand:");
		String brand = s.next();
		System.out.println("Enter Model:");
		String model = s.next();
		System.out.println("Enter Manufacture Year:");
		int manufYear = s.nextInt();
		System.out.println("Enter Fuel Type:");
		String fuel = s.next();
		System.out.println("Enter Engine capacity:");
		String engineCapacity = s.next();
		System.out.println("Enter Mileage:");
		float mileage = s.nextFloat();
		System.out.println("Enter Insurance Number:");
		long insuranceNumber = s.nextLong();
		System.out.println("Enter Insurance status:");
		String insurancestatus = s.next();
		
		System.out.println("vehicleNumber = "+vehicleNumber);
		System.out.println("ownerName = "+ownerName);
		System.out.println("brand = "+brand);
		System.out.println("model = "+model);
		System.out.println("manufYear = "+manufYear);
		System.out.println("fuel = "+fuel);
		System.out.println("engineCapacity = "+engineCapacity);
		System.out.println("mileage = "+mileage);
		System.out.println("insuranceNumber = "+insuranceNumber);
		System.out.println("InsuranceStatus = "+insurancestatus);
	}
} 
