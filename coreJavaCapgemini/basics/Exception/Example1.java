package Exception;

public class Example1 {
      public static void main(String[] args) {
    	  try {
    		  int[] arr = {1,2,3,4,5};

    		  System.out.println(4/0);
    		  System.out.println(arr[9]);
    		  
    	  }
    	  catch(ArithmeticException e) {
    		  System.out.println("Caught "+e.getMessage());
    	  }
    	  catch(NumberFormatException e) {
    		  System.out.println("Caught: ");
    	  }
    	  catch(ArrayIndexOutOfBoundsException e) {
    		  System.out.println("Array out of bound exception");
    	  }
    	  catch(Exception e) {
    		  System.out.println("Caught: ");
    	  }
    	  finally {
    		  System.out.println("Final block");
    	  }
      }
}
