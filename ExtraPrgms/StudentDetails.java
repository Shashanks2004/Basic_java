class StudentDetails 
{
	public static void main(String[] args) 
	{
		int studentId=101,english=85,maths=90,science=78,social=88,computer=95,maxMarks=100;
		String name="Raj";
		int totalobtMarks=english+maths+social+science+computer;
		int totalMaxMarks=maxMarks*5;
		float avg=totalobtMarks/5;
		float percentage=totalobtMarks/totalMaxMarks*100;
		System.out.println("----------Student Details----------");
		System.out.println("Student ID = "+studentId);
		System.out.println("Student Name = "+name);
		System.out.println("Total Obtained Marks = "+totalobtMarks);
		System.out.println("Average marks = "+avg);
		System.out.println("Percentage = "+percentage);
	}
}
