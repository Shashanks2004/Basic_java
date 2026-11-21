import java.util.Scanner;
class EmpDetails 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Id ,Name ,Basic Salary ,Year of Experience , performance rating ,Attendance percentage and total completed projects  :");
		int id= s.nextInt();
		String name = s.next();
		double salary = s.nextDouble();
		int yoe = s.nextInt(),pr=s.nextInt(),per=s.nextInt(),project = s.nextInt();
		double bonus = 0, rate=0;
		if(yoe>=5)
		{
			if(pr>=4){
				if(per>=90){
					if(project>=8){
						bonus=salary*0.25;
						rate=25;
					}else{
						bonus=salary*0.20;
				        rate=20;
					}
				}
				else{
					bonus=salary*0.15;
				    rate=15;
				}
			}else{
					bonus=salary*0.10;
				    rate=10;
				}
		}
		else {
			if(pr>=4){
				if(per>=90){
					bonus=salary*0.12;
				    rate=12;
				}else{
					bonus=salary*0.08;
				    rate=8;
				}
			}else{
				bonus=salary*0.05;
				rate=5;
			}
		}

		System.out.println("Increment percentage is : "+rate);
		System.out.println("Increment amount is : "+bonus);
		System.out.println("Monthly salary after increment : "+(salary+bonus));
		System.out.println("Annual salary after increment : "+((salary+bonus)*12));
	}
}
