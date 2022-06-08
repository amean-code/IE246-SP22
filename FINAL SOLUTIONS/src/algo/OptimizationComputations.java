package algo;

import java.util.ArrayList;
import java.util.HashMap;

import data.Course;
import data.Student;

public class OptimizationComputations {
	public Student[] students;
	public ArrayList<Course> courses;
	public ArrayList<Student> bestCoverage;
	
	public OptimizationComputations(Problem problem) {
		
		this.students = problem.students;
		this.courses = problem.courses;
			
		this.bestCoverage = findBestCoverage();
		// (35 points) Find the high GPA students who have taken all courses with a nice spread using a commercial solver. 
		// Formally what we want is:
		// 1. The sum of GPA for selected students should be maximized
		// 2. Each course in the list of courses has to be taken by at least one student
		// 3. Each course in the list of courses has to be taken by at most three students
		// We want this.bestCoverage to be the list of these students.
	}


	private ArrayList<Student> findBestCoverage() {
		
		return null;
	}

}
