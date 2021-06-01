import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		sc.close();
		if (90 <= A && 100 >= A) {
			System.out.println("A");
		} else if (80 <= A && 90 > A) {
			System.out.println("B");
		} else if (70 <= A && 80 > A) {
			System.out.println("C");
		} else if (60 <= A && 70 > A) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}
}
