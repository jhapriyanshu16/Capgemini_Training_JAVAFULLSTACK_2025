package oops;

public class OOPSconc {
	//Encapuslation - Process of wrapping members of class in a class in called encapsulaion. (Data hiding (security and validation) - access modifiers(public,private,protected,default)
	// public - can be acessed anywhere outside the package too.
	// protected - can be accessed only inside the same package. 
    //            - we can access protected in different package when it has a subclass in other package (spl. case)
	// private - can be accessed in that perticular class only.
	// default - can be accessed only inside the same package. (diff btw protected and default - no spl. case here)
	
	// GETTTERS AND SETTERS
	
	//Encapusulation can also be acheived using Java Bean class and Inner class
	
	private int price;
	
	//setters
    public void setPrice(int price){
    	//validation
    	if(price > 0) {
    	this.price = price;
    	}
    }
    
    //getters
    public void getPrice(){
    	System.out.println("Price : "+ price);
    }
    
	
	public static void main(String[] args) {
		OOPSconc obj1 = new OOPSconc();
		obj1.setPrice(3999);
		obj1.getPrice();

	}

}
