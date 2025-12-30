package oops;

class Employee{
	static String companyName = "Capgemini";
	String empName ;
	int age;
	int empId;
	Employee(){
		
	}
	Employee(String empName){
		this.empName = empName;
	}
	Employee(String empName, int age){
		this(empName);
		this.age = age;
	}
	Employee(String empName,int age, int empId){
		this(empName,age);
		this.empId = empId;
	}
	
	public void work() {
		System.out.println(empName+" is working...");
	}
	
}

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee("Devanshu");
		e1.work();
		
		Employee e2 = new Employee("Priyanshu",22,555030);
		e2.work();
		System.out.println("Emp Id of e2 is "+ e2.empId);
		
		System.out.println(e2.empName+" is working in "+e2.companyName);
		Employee.companyName = "Infosys";
		System.out.println(e2.empName+" is working in "+e2.companyName);
		

	}

}
