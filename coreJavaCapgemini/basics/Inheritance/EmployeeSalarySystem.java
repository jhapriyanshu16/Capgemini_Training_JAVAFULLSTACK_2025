package Inheritance;


class Employee{
	public void calculateSalary() {
		System.out.println("Guessing Employee Salary");
	}
}

class Developer extends Employee{
	public void calculateSalary() {
		System.out.println("The salary is Rs 40000");
	}
}

class Manager extends Employee{
	public void calculateSalary() {
		System.out.println("The salary is Rs 80000");
	}
}

class Intern extends Employee{
	public void calculateSalary() {
		System.out.println("The salary is Rs 10000");
	}
}

public class EmployeeSalarySystem {

	public static void main(String[] args) {
		Employee e1 = new Developer();
		e1.calculateSalary();
		Employee e2 = new Manager();
		e2.calculateSalary();
		Employee e3 = new Intern();
		e3.calculateSalary();

	}

}
