package questions;

abstract class Payment{
	public void pay() {
		
	}
}

class CreditCardPayment extends Payment{
	public void pay() {
		System.out.println("Credit Card Payment");
	}
}

class DebitCardPayment extends Payment{
	public void pay() {
		System.out.println("Debit Card Payment");
	}
}

class UPIPayment extends Payment{
	public void pay() {
		System.out.println("UPI Payment");
	}
}

public class PaymentProcessingSystem {

	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment();
		p1.pay();
		Payment p2 = new DebitCardPayment();
		p2.pay();
		Payment p3 = new UPIPayment();
		p3.pay(); 

	}

}
