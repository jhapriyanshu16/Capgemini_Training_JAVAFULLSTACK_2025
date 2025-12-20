package coreJavaCapgemini;

//.A student gets extra time in an exam if they are physically challenged or their attendance is below 60% but approved 
// by the administration. Use a conditional operator to decide the extra 
// time and a compound assignment operator to add extra minutes to the exam duration.


public class Q5 {
	public static void main(String[] args) {
		int examDuration = 60;
		boolean isChallenged = true;
		boolean isApproved = true;
		int att = 60;
		boolean isEligible = ((isChallenged || att < 60) && isApproved == true) ? true : false;
		int extraTime = isEligible ? examDuration += 15 : examDuration;
		System.out.println(extraTime);	
		
	}

}
