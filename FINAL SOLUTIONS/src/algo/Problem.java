package algo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import data.Course;
import data.DEPARTMENT;
import data.GRADE;
import data.Student;

public class Problem {
	public Student[] students = new Student[9];
	public ArrayList<Course> courses;

	public Problem() {

		courses = new ArrayList<Course>();

		readStudents("studentData.csv");
		// (15 points) read student data from the given file and populate Student array
		// called students with this line
		// You don't need to check for duplicates etc. Each student id in this file is
		// unique.
		// Just create a student object for each row, and place these in the students
		// array.

		readGrades("courseData.csv");
		// (20 points) read course data from the given file and update students'
		// coursesTaken with this line
		// Warning: That's not the best design (intentionally), so you have to be
		// careful about the following:
		// 1. Use student id to match a student record, as names can be misleading.
		// 2. If a student id is missing in your list of students, ignore these lines.
		// 3. If the course appears for the first time, create a new Course object and
		// place that in list of courses.
		// 4. You should not be creating a new Course object each time a course name
		// appears.
		// 5. If the same student takes the same course more than once, keep the highest
		// grade only.

		if (this.students != null) {
			for (Student s : this.students) {
				if (s != null) {
					s.computeGPA();
					// (15 points) compute the GPA for each Student with this line
				}
			}
		}
	}

	private void readStudents(String fileName) {

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
			// read the first line
			String temp = br.readLine();
			// read the second line
			temp = br.readLine();
			temp = br.readLine(); // Read first student
			int index = 0;
			while (temp != null) {

				// splitting by comma
				String[] tempArray = temp.split(",");
				// creating the student
				Student tempStudent = new Student();
				// putting the values to our student
				tempStudent.studentId = Integer.parseInt(tempArray[0]);// parsing the string value to int
				tempStudent.name = tempArray[1];
				// adding the student to the array
				students[index] = tempStudent;
				index++;

				// Check
				System.out.println("Student ID: " + tempStudent.studentId + " - Student Name: " + tempStudent.name);
				// reading the next line * Student
				temp = br.readLine();
			}

			br.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private void readGrades(String fileName) {

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
			// read the first line
			String temp = br.readLine();
			// read the second line
			temp = br.readLine();
			// creating the first course
			// reading the next line
			temp = br.readLine(); // Grade
			// splitting by comma
			String[] tempArray = temp.split(","); // 0/student id - 1/Student Name - 2/Course Department - 3/Course Code
													// - 4/Credit Hour - 5/Course Name - 6/Grade
			while (temp != null) {

				// splitting by comma
				tempArray = temp.split(",");

				int currentStudentID = Integer.parseInt(tempArray[0]);
				Student currentStudent = null;

				// check if student exists
				for (int i = 0; i < students.length; i++) {
					if (currentStudentID == students[i].studentId) {
						currentStudent = students[i];
					}
				}

				// check if there is a student
				if (currentStudent == null) {
					continue;
				}

				// Course appears first time
				Course currentCourse = null;
				int currentCourseCode = Integer.parseInt(tempArray[3]);
				int currentCourseCreditHour = Integer.parseInt(tempArray[4]);
				String currentCourseDepartment = tempArray[2];
				int currentCourseDeparmentCode = 0;
				String currentCourseName = tempArray[5];
				// check if student exists
				for (int i = 0; i < courses.size(); i++) {
					if (currentCourseName.equals(courses.get(i).name)) {
						currentCourse = courses.get(i);
					}
				}

				// if first time
				if (currentCourse == null) {
					// create a new course
					currentCourse = new Course();
					currentCourse.courseCode = currentCourseCode;
					currentCourse.name = currentCourseName;
					currentCourse.departmentCode = DEPARTMENT.BUS; // Update
					currentCourse.creditHours = currentCourseCreditHour;

				}

				// Get Grade
				double currentGrade = returnGradeValue(currentStudent.convertStringtoGrade(tempArray[6]));

				// if student takes more than 1 keep higher grade
				if (currentStudent.coursesTaken.containsKey(currentCourse)) {

					// Check which grade is higher
					GRADE oldGrade = currentStudent.coursesTaken.get(currentCourse);
					double oldGradeDouble = returnGradeValue(oldGrade);

					// keep higher grade
					if (oldGradeDouble < currentGrade) {
						currentStudent.coursesTaken.replace(currentCourse,
								currentStudent.convertStringtoGrade(tempArray[6]));
					}

				} else {

					currentStudent.coursesTaken.put(currentCourse, currentStudent.convertStringtoGrade(tempArray[6]));

				}

				// reading the next line
				temp = br.readLine();

			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public double returnGradeValue(GRADE a) {
		if (a == GRADE.A) {
			return 4;
		} else if (a == GRADE.Aminus) {
			return 3.7;

		} else if (a == GRADE.Bplus) {
			return 3.3;

		} else if (a == GRADE.B) {
			return 3;

		} else if (a == GRADE.Bminus) {
			return 2.7;

		} else if (a == GRADE.Cplus) {
			return 2.3;

		} else if (a == GRADE.C) {
			return 2;

		} else if (a == GRADE.Cminus) {
			return 1.7;

		} else if (a == GRADE.Dplus) {
			return 1.3;

		} else if (a == GRADE.D) {
			return 1;

		} else if (a == GRADE.F) {
			return 0;
			// if the value is null
		} else if (a == null) {
			return 0;
		}
		return 10000;

	}

}
