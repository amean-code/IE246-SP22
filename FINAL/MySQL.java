import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;



public class MySQL {
	ArrayList<Student> allStudents = new ArrayList<Student>();
	Student tempStudent;
	String[] temp;

	public static void main(String[] args) {

		MySQL getdata = new MySQL();
		for (Student x : getdata.allStudents) {
			x.printUnsatisfactory();
		}
		//Output is
		//Student Welinton is not satisfactory.

	}

	public MySQL() {
		readData();
	
	}

	public void readData() {
		Connection connection = null;
		String url = "jdbc:mysql://sql11.freemysqlhosting.net";
		String username = "sql11491183";
		String password = "Hv2apFdAci";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from sql11491183.agent");
			ResultSetMetaData rs = resultSet.getMetaData();
			int columncount= rs.getColumnCount();
			
			while (resultSet.next()) {
				temp = new String[4];
				for (int i = 0; i < 4; i++) {
					temp[i] = resultSet.getString(i + 1);
				}
				// print(temp);
				// System.out.println();

				tempStudent = new Student(temp[0], temp[1], temp[2], Double.parseDouble(temp[3]),
						Integer.parseInt(temp[4]));
				allStudents.add(tempStudent);
				//printStudent(tempStudent);
				//print(temp);
				//System.out.println();

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	private void printStudent(Student temp) {
		// TODO Auto-generated method stub
		System.out.println(temp.firstName);
		System.out.println(temp.GPA);
		System.out.println(temp.ID);
		System.out.println(temp.satisfactory);
		System.out.println();

	}

	private void print(String[] temp2) {
		for (String s : temp2) {
			System.out.print(s + " ");
		}

	}


}
class Student {
		
	String ID;
	String firstName;
	String lastName;
	double GPA;
	int semester;
	boolean satisfactory;
	boolean kayitli;
	
	public Student(String id,String fn,String ln, double gpa,int sms) {
		this.ID=id;
		this.firstName=fn;
		this.lastName=ln;
		this.GPA=gpa;
		this.semester=sms;
		this.kayitli=true;
		
		if(gpa>2) {
			satisfactory=true;
		}else {
			satisfactory=false;
		}
	
	}
	
	public void printUnsatisfactory() {
		if(!this.satisfactory) {
			System.out.println("Student "+this.firstName+" is not satisfactory.");
		}
	}
			
}
