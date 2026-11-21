import java.util.Scanner;
class StudentDetails 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Id, Name, Java marks, SQL marks, testing marks :");
		int id= s.nextInt();
		String name = s.next();
		int java = s.nextInt(),sql=s.nextInt(),testing=s.nextInt();
		double totalMarks = java+sql+testing;
		double per = (totalMarks/300)*100;
		String grade = " ";
		if(per>=75)
		{
			if(java>=50 && sql>=50 && testing>=50){
				grade+="Distinction";
			}else{
				grade+="Fail";
			}
		}else if(per>=60)
		{
			if(java>=40 && sql>=40 && testing>=40){
				grade+="First class";
			}else{
				grade+="Fail";
			}
		}else if(per>=35){
			if(java>=35 && sql>=35 && testing>=35){
				grade+="Pass";
			}else{
				grade+="Fail";
			}
		}else{
			grade+="Fail";
		}
		
		System.out.println("Total marks : "+totalMarks);
		System.out.println("Percentage : "+per);
		System.out.println("Java : "+(java>=35 ? "Pass" : "Fail"));
		System.out.println("SQl : "+(sql>=35 ? "Pass" : "Fail"));
		System.out.println("Testing : "+(testing>=35 ? "Pass" : "Fail"));
		System.out.println("OverAll result : "+grade);
	}
}
