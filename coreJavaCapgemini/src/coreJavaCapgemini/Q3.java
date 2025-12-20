package coreJavaCapgemini;

public class Q3 {
    public static void main(String[] args) {
        double salary = 45000;
        int performanceRating = 5;
        int yearsWorked = 6;
        boolean underDisciplinaryAction = false;
        double incrementAmount = 5000;

        String eligibilityMessage = ((performanceRating > 4 || yearsWorked > 5) && !underDisciplinaryAction) ? "Increment approved" : "Increment denied";
        System.out.println(eligibilityMessage);

        if ((performanceRating > 4 || yearsWorked > 5) && !underDisciplinaryAction) {
            salary += incrementAmount;
        }

        System.out.println("Updated salary: " + salary);
    }
}

