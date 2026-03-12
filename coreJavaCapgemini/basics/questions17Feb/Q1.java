package questions17Feb;

import java.util.ArrayList;

public class Q1 {

	public static void main(String[] args) {
		

	}

}

class Asset{
	String assetId;
	String assetName;
	String assetExpiry;
	
	Asset(String assetId,String assetName,String assetExpiry){
		this.assetId = assetId;
		this.assetName = assetName;
		this.assetExpiry = assetExpiry;
	}
	
	public String getAssetId() {
		return assetId;
	}
	
	public String getAssetName() {
		return assetName;
	}
	
	public String getAssetExpriy() {
		return assetExpiry;
	}
	
	public void setAssetId(String assetId) {
		String first3chars = assetId.substring(0,3);
		char hyphen = assetId.charAt(3);
		String digits = assetId.substring(4,10);
		char endChar = assetId.charAt(10);
		
	    if((first3chars.equals("DSK")|| first3chars.equals("LTP")|| first3chars.equals("IPH"))&& hyphen == '-' && (endChar == 'H' || endChar == 'L')) {
	    	this.assetId = assetId;
	    }
	}
	
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	
	public void setAssetExpiry(String assetExpiry) {
		this.assetExpiry = assetExpiry;
	}
	
	public String toString() {
		return "assetId : " + assetId + " assetName : "+ assetName + " assetExpiry : "+ assetExpiry;
	}
}

class Resources{
	
	static int getMonth(String month) {
		if(month.equals("Jan")) return 1;
		if(month.equals("Feb")) return 2;
		if(month.equals("Mar")) return 3;
		if(month.equals("Apr")) return 4;
		if(month.equals("May")) return 5;
		if(month.equals("Jun")) return 6;
		if(month.equals("Jul")) return 7;
		if(month.equals("Aug")) return 8;
		if(month.equals("Sep")) return 9;
		if(month.equals("Oct")) return 10;
		if(month.equals("Nov")) return 11;
		if(month.equals("Dec")) return 12;
		return 0;	
	}
}

class InvalidAssetsException extends Throwable{
	String message;
	
	InvalidAssetsException(String message){
		this.message = message;
	}
}


class InvalidExperienceException extends Throwable{
	String message;
	
	InvalidExperienceException(String message){
		this.message = message;
	}
}

abstract class Employee{
	static int contractIdCounter;
	static int permanentIdCounter;
	String employeeId;
	String employeeName;
	double salary;
	
	static {
		contractIdCounter = 10000;
		permanentIdCounter = 10000;
	}
	
	Employee(String employeeName){
		this.employeeName = employeeName;
		
	}
	
	public String getEmployeeName() {
		return employeeName;
		
	}
	
	public void setEmployeeName(String employeeName) {
		
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if(salary > 0) {
			this.salary = salary;
		}
		this.salary = 0;
	}
	
	public void setEmployeeId(String employeeId) {
		
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public static int getContractIdCounter() {
		return contractIdCounter;
	}
	
	public static void setContractIdCounter(int contractIdCounter) {
		Employee.contractIdCounter = contractIdCounter;
	}
	
	public static int getPermanentIdCounter() {
		return permanentIdCounter;
	}
	
	public static void setPermanentIdCounter(int permanentIdCounter) {
		Employee.permanentIdCounter = permanentIdCounter;
	}
	
	abstract void calculateSalary(float salaryfactor);
	
}

class ContractEmployee extends Employee{
	double wagePerHour;
	
	ContractEmployee(String employeeName, double wagePerHour){
		super(employeeName);
		this.wagePerHour = wagePerHour;
	}
	
	void calculateSalary(float hoursWorked) {
		if (hoursWorked >= 190) {
			salary = wagePerHour*hoursWorked;
		}
		else {
			double salToBeDeducted = (wagePerHour/2) * (190 - hoursWorked);
			salary = (wagePerHour*hoursWorked) - salToBeDeducted;
		}
	}
	
	public double getWagePerHour() {
		return wagePerHour;
	}
	
	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}
	
	public String toString() {
		return "";
	}
}

class PermanentEmployee extends Employee {
	double basicPay;
	ArrayList<String> salaryComponents;
	float experience;
	ArrayList<Asset> assets;
	
	PermanentEmployee(String employeeName, double basicPay, ArrayList<String> salaryComponents, ArrayList<Asset> assets){
		super(employeeName);
		this.basicPay = basicPay;
		this.salaryComponents = salaryComponents;
		this.assets = assets;
	}
	
	public double calculateBonus(float experience) throws InvalidExperienceException {
		
		if (experience < 2.5) {
			throw new InvalidExperienceException("A minimum of 2.5 years is required for bonus!");
		}
		else if (experience >= 2.5 && experience < 4) {
			return 2550;
		}
		else if (experience >= 4 && experience < 8) {
			return 5000;
		}
		else if (experience >= 8 && experience < 12) {
			return 8750;
		}
		else {
			return 13000;
		}
	}
	
	void calculateSalary(float experience) {
		this.experience = experience;
		double DA = Double.parseDouble(salaryComponents.get(1).substring(3,5));
		double HRA = Double.parseDouble(salaryComponents.get(2).substring(5,7));
		try {
			salary = basicPay + DA + HRA + calculateBonus(experience);
		}
		catch(InvalidExperienceException e) {
			salary = basicPay + DA + HRA + 0;
		}
		
		
	}
	
	ArrayList<Asset> getAssetByDate(String lastDate) throws InvalidAssetsException{
		ArrayList<Asset> filteredAssets = new ArrayList<>();
		for (Asset a : assets) {
			if(Integer.parseInt(lastDate.split("-")[0]) <= Integer.parseInt(a.getAssetExpriy().split("-")[0])) {
				if(Resources.getMonth(lastDate.split("-")[0]) <= Resources.getMonth(lastDate.split("-")[0])) {
					if(Integer.parseInt(lastDate.split("-")[2])<= Integer.parseInt(a.getAssetExpriy().split("-")[2])) {
						filteredAssets.add(a);
					}
				}
			}	
			
		}
		if(filteredAssets.size() == 0) {
			throw new InvalidAssetsException("No assets found for the given criteria!");
		}
		return filteredAssets;
	}
	
	public double getBasicPay() {
		return basicPay;
	}
	
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	public ArrayList<String> getSalaryComponents() {
		return salaryComponents;
	}
	
	public void setSalaryComponents(ArrayList<String> salaryComponents) {
		this.salaryComponents = salaryComponents;
	}
	
	public float getExperience() {
		return experience;
	}
	
	public void setExperience(float experience) {
		this.experience = experience;
	}
	
	public ArrayList<Asset> getAssets() {
		return assets;
	}
	
	public void setAssets(ArrayList<Asset> assets) {
		this.assets = assets;
	}
	
	@Override
	public String toString() {
		return "PermanentEmployee [basicPay=" + basicPay + ", salaryComponents=" + salaryComponents + ", experience="
				+ experience + ", assets=" + assets + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	
}

class Admin{
	
	public void generateSalarySlip(ArrayList<Employee> employees,ArrayList<Float> salaryFactor) {
		for (int i = 0 ; i < employees.size(); i++) {
			employees.get(i).calculateSalary(salaryFactor.get(i));
		}
	}
	
	public int generateAssetReport(ArrayList<Employee> employees, String lastDate) {
		try {
			int total = 0;
			for (Employee e : employees) {
				if (e instanceof PermanentEmployee) {
					PermanentEmployee pe = (PermanentEmployee) e;
					total += pe.getAssetByDate(lastDate).size();
				}
				
			}
			return total;
		}
		catch(InvalidAssetsException e) {
			return -1;
		}
	}
	
	public ArrayList<String> generateAssetReport(ArrayList<Employee> employees, char assetCategory) {
		ArrayList<String> result = new ArrayList<>();
		for (Employee e : employees) {
			if (e instanceof PermanentEmployee) {
				PermanentEmployee pe = (PermanentEmployee) e;
				for (Asset a : pe.getAssets()) {
					if (Character.toUpperCase(a.getAssetId().charAt(0)) ==
	                        Character.toUpperCase(assetCategory)) {

	                    result.add(a.getAssetId());
	                }
				}
			}
			
		}
		return result;
	}
	
}