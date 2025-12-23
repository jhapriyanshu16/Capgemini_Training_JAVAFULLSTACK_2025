package loops;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2*n-1; j++) {
                if (j <= i || j >= (2 *n-1) - i+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        	for (int j = 1; j <= 2*n-1; j++) {

				if (j <= i || j >= (2*n-1) - i + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
            System.out.println();
        }
    }

}
