import java.util.*;

class pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter range: "); 
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
				if (j<i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for (int i=n; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
				if (j < i) {
					System.out.print ("*");
				}
			}
			System.out.println();
		}
	}
}

