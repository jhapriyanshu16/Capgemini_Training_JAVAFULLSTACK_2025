package coreJavaCapgemini;

public class Q2BankSystem {
    public static void main(String[] args) {
        double balance = 500.0; 
        boolean isActive = true; 
        double withdrawalAmount = 200.0; 

        String message = (balance > 0 && isActive) ? "Withdrawal allowed" : "Withdrawal denied";
        System.out.println(message);

        if (balance > 0 && isActive) {
            balance -= withdrawalAmount;
        }

        System.out.println("Remaining balance: " + balance);
    }
}
