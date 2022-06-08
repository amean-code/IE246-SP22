package algo;

import java.util.ArrayList;
import java.util.HashMap;

import data.Course;
import data.Student;

public class AdvancedComputations {
	
	public Student[] students;
	public ArrayList<Course> courses;
	public Student heavyLifter;
	public ArrayList<Student> randomCoverage;

	public AdvancedComputations(Problem problem) {
		
		this.students = problem.students;
		this.courses = problem.courses;
		
		this.heavyLifter = findHeavyLifter();
		// (15 points) Find the student, who has taken the most number of credit hours among all students.
		// We want this.heavyLifter to be the the student described in the above line.
		
		this.randomCoverage = findRandomCoverage();
		// (20 points) Find a set of students randomly, who have collectively taken all courses.
		// That means each course has to be taken by at least one student.
		// Randomly include a student at each step (that student should not be included already)
		// The moment each course is taken by someone, stop and terminate your algorithm. 
		// We want this.randomCoverage to be the list of these students.
	}
	
	private Student findHeavyLifter() {
		return null;
	}

	private ArrayList<Student> findRandomCoverage() {
		HashMap<Course, Boolean> collectivelyTaken = new HashMap<Course, Boolean>();
		if(this.courses != null)
		{
			for (Course c : this.courses)
			{
				collectivelyTaken.put(c, false);
			}
		}
		// initially no course is taken. Please use this collectivelyTaken HashMap to keep track of courses taken
		
		// while adding students randomly, update collectivelyTaken HashMap accordingly
				
		// you can check if all courses are taken with the areAllCoursesTaken method as needed
		// boolean allCoursesTaken = areAllCoursesTaken(collectivelyTaken);

		return null;
	}
	
	private boolean areAllCoursesTaken(HashMap<Course, Boolean> collectivelyTaken) {
		// this method is fully functional, feel free to use it as is
		for(Course c : collectivelyTaken.keySet())
		{
			if (!collectivelyTaken.get(c))
			{
				return false;
			}
		}
		return true;
	}
}
