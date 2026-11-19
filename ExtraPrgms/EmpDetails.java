class EmpDetails 
{
	public static void main(String[] args) 
	{
		int empId=201,totalhrs=48,reghrs=40,regWage=200,overTimeWage=300;
		String name = "Raj";
		int overtimehrs=totalhrs-reghrs;
		int regSalary=reghrs*regWage;
		int overTimeSal=overtimehrs*overTimeWage;
		int totalSalary=regSalary+overTimeSal;
		System.out.println("----------Employee Details-----------");
		System.out.println("Employee ID = "+empId);
		System.out.println("Employee Name"+name);
		System.out.println("Regular working hours = "+reghrs);
		System.out.println("Overtime Working Hours = "+overtimehrs);
		System.out.println("Total working hours = "+totalhrs);
		System.out.println("Total working hrs salary =  "+regSalary);
		System.out.println("Over time working hrs salary = "+overTimeSal);
		System.out.println("Final salary = "+totalSalary);
	}
}
