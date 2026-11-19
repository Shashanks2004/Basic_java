class EmployeeDetails 
{
	public static void main(String[] args) 
	{
		String empName = "Kiran";
		double salary=35000;
		int service=6;
		double bonus = service>5 ? salary*0.10 : salary*0.05;
		salary += bonus;
		System.out.println("Employee Name : "+empName);
		System.out.println("Year of Exprence : "+service);
		System.out.println("Bonus : "+ bonus);
		System.out.println("Hike Salary : "+salary);
	}
}
