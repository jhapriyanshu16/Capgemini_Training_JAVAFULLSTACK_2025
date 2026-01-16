package objectclass;

public class PhoneMain {

	public static void main(String[] args) {
		    Phone[] arr = new Phone[3];
		    
			arr[0] = new Phone(2,4);
			arr[1] = new Phone(1,5);
			arr[2] = new Phone(3,56);
			
			
			
			for (Phone p : arr) {
				System.out.println(p);
			}

	}

}
