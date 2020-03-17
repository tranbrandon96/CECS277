import java.text.DecimalFormat;

/** Student Report Card Class
 * 
 * @author Brandon Tran
 *
 */
public class StudentReportCard 
{
	public static void main(String [] args)
	{
		Student student[] = new Student[1];
		System.out.println("\t\t\t\t\tStudent Report Card");
		
		student[0] = new Student("Brandon Tran", "Undergraduate Degree", "Computer Science Major");
		
		Courses classes[] = new Courses[4];
		classes[0] = new Courses("CECS225","Digital Logic and Assembly Programming");
		classes[1] = new Courses("CECS228","Discrete Structure Computing Application");
		classes[2] = new Courses("CECS274","Object Oriented Programming and Data Structure");
		classes[3] = new Courses("CLSC101","Greek Mythology");
		
		Credits units[] = new Credits[4];
		units[0] = new Credits(3.000,3.000,"A",12.000,Credits.gradevalue.A);
		units[1] = new Credits(3.000,3.000,"A",12.000,Credits.gradevalue.A);
		units[2] = new Credits(3.000,3.000,"A",12.000,Credits.gradevalue.A);
		units[3] = new Credits(3.000,3.000,"A",12.000,Credits.gradevalue.A);
		
		System.out.println(student[0] + "\n");
		System.out.println("Courses\tDescription\t\t\t\t\tAttempted\tEarned\tGrade\tPoints");
		
		System.out.println(classes[0].toString() + "\t\t" + units[0].toString());
		System.out.println(classes[1].toString() + "\t" + units[1].toString());
		System.out.println(classes[2].toString() + "\t" + units[2].toString());
		System.out.println(classes[3].toString() + "\t\t\t\t\t" + units[3].toString());
	
		DecimalFormat DF = new DecimalFormat("####00.00");
		double total = 0;
		System.out.println();
		for(int i = 0; i < 4; i++)
		{
			total += units[i].getAttempted();
			
		}
		System.out.println("Total Units Attempted: " + DF.format(total));
		
		total = 0;
		for(int i = 0; i < 4; i++)
		{
			total += units[i].getEarned();
			
		}
		System.out.println("Total Units Earned: " + DF.format(total));
		System.out.println("Total GPA Units: " + DF.format(total));
		
		double points = 0;
		for(int i = 0; i < 4; i++)
		{
			points += units[i].getPoints();
			
		}
		
		System.out.println("Total Points: " + DF.format(points));
		
		DecimalFormat DF2 = new DecimalFormat("####0.00");
		double GPA = points / total;
		System.out.println("GPA: " + DF2.format(GPA));
	}
	
}
