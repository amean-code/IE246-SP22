package algo;

import java.util.ArrayList;
import java.util.HashMap;

import data.Course;
import data.Student;

public class Problem {
	public Student[] students;
	public ArrayList<Course> courses;
	public Problem() {
		
		readStudents("studentData.csv");
		// (15 points) read student data from the given file and populate Student array called students with this line
		// You don't need to check for duplicates etc. Each student id in this file is unique.  
		// Just create a student object for each row, and place these in the students array.
		
		readGrades("courseData.csv");
		// (20 points) read course data from the given file and update students' coursesTaken with this line
		// Warning: That's not the best design (intentionally), so you have to be careful about the following:
		// 1. Use student id to match a student record, as names can be misleading.
		// 2. If a student id is missing in your list of students, ignore these lines.
		// 3. If the course appears for the first time, create a new Course object and place that in list of courses. 
		// 4. You should not be creating a new Course object each time a course name appears.
		// 5. If the same student takes the same course more than once, keep the highest grade only. 
		
		if(this.students != null)
		{
			for(Student s : this.students)
			{
				s.computeGPA();
				// (15 points) compute the GPA for each Student with this line
			}
		}
	}
	
	private void readStudents(String fileName) {
		
	}
	
	private void readGrades(String fileName) {
		
	}

}
