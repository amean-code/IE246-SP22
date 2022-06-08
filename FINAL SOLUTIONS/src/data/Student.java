package data;

import java.util.HashMap;

public class Student {
	public int studentId;
	public String name;
	public HashMap<Course, GRADE> coursesTaken;
	private double GPA;
	public void computeGPA() {

	}
	public GRADE convertStringtoGrade (String gradeAsString) {
		if(gradeAsString == "A")
		{
			return GRADE.A;
		}
		else if(gradeAsString == "A-")
		{
			return GRADE.Aminus;
		}
		else if(gradeAsString == "B+")
		{
			return GRADE.Bplus;
		}
		else if(gradeAsString == "B")
		{
			return GRADE.B;
		}
		else if(gradeAsString == "B-")
		{
			return GRADE.Bminus;
		}
		else if(gradeAsString == "C+")
		{
			return GRADE.Cplus;
		}
		else if(gradeAsString == "C")
		{
			return GRADE.C;
		}
		else if(gradeAsString == "C-")
		{
			return GRADE.Cminus;
		}
		else if(gradeAsString == "D+")
		{
			return GRADE.Dplus;
		}
		else if(gradeAsString == "D")
		{
			return GRADE.D;
		}
		else 
		{
			return GRADE.F;
		}
	}
}
