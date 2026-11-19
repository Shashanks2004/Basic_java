class EmployeDetail
{
	public static void main(String[] args) 
	{
		int empId = 101,baseSalary=30000,hra=5000,da=3000;
		String name = "Raj";
		int salary = baseSalary+hra+da;
		System.out.println("----------Employee Details----------");
		System.out.println("Name = "+name);
		System.out.println("ID = "+empId);
		System.out.println("Salary = "+salary);
	}
}
