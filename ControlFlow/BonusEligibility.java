import java.util.Scanner;
class BonusEligibility 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Id ,Name ,Basic Salary ,Year of Experience ,Performance Rating :");
		int id= s.nextInt();
		String name = s.next();
		double salary = s.nextDouble();
		int yoe = s.nextInt(), pr=s.nextInt();
		double bonus = 0, per = 0;
		if(yoe>=5)
		{
			if(pr>=4){
				bonus=salary*0.15;
				per=15;
			}else{
				bonus=salary*0.10;
				per=10;
			}
		}else{
			if(pr>=4){
				bonus=salary*0.08;
				per=8;
			}else{
				bonus=salary*0.05;
				per=5;
			}
		}
		System.out.println("Bonus percentage is : "+per);
		System.out.println("Bonus amount is : "+bonus);
		System.out.println("Final salary with bonus is : "+(salary+bonus));
	}
}
