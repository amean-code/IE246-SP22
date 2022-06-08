package data;

import java.util.HashMap;

public class Student {
	public int studentId;
	public String name;
	public HashMap<Course, GRADE> coursesTaken;
	private double GPA;
	//iterate over hashmaps values and sum them together
	public void computeGPA() {
		double sum = 0;
		for(GRADE x: coursesTaken.values()) {
			sum+=returnGradeValue(x);
		}
		this.GPA=sum;
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
	
	public double returnGradeValue(GRADE a) {
		if(a==GRADE.A) {
			return 4;
		}else if(a==GRADE.Aminus){
			return 3.7;

		}else if(a==GRADE.Bplus){
			return 3.3;

		}else if(a==GRADE.B){
			return 3;

		}
		else if(a==GRADE.Bminus){
			return 2.7;

		}
		else if(a==GRADE.Cplus){
			return 2.3;

		}
		else if(a==GRADE.C){
			return 2;

		}else if(a==GRADE.Cminus){
			return 1.7;

		}else if(a==GRADE.Dplus){
			return 1.3;

		}else if(a==GRADE.D){
			return 1;

		}else if(a==GRADE.F){
			return 0;
		//if the value is null
		}else if(a==null) {
			return 0;
		}
		return 10000;

		
		
	}
	
}
