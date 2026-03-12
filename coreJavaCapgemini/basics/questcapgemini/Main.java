package questcapgemini;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	     List<Student> list = new ArrayList<>();
	     
	     System.out.println("Enter students number: ");
	     int n = sc.nextInt();
	     
	     for (int i = 0 ; i < n ; i++) {
	    	 System.out.println("Studentid: ");
	    	 int id = sc.nextInt();
	    	 sc.nextLine();
	    	 System.out.println("Student Name");
	    	 String name = sc.nextLine();
	    	 System.out.println("marks");
	    	 int marks = sc.nextInt();
	    	 
	    	 list.add(new Student (id, name , marks));
	    	 
	     }
	     
	     StudentUtility util = new StudentUtility();
    	 util.setStudentList(list);
    	 
    	 double average = util.averageMarks(util.convertToStream());
    	 System.out.println("Average: "+ average);
    	 
	}

}
