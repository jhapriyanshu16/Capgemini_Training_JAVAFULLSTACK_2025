package loops;

public class PrintingPattern9 {
	public static void main(String[] args) {
		int num = 4;
		for (int i = 1; i <= num ; i++) {
			for (int j =1; j <= num ; j++) {
				if (j == 1 || i == 4 || i ==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
