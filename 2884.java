import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		if (45 < M) {
			System.out.println(H + " " + (M - 45));
		} else if (45 > M) {
			H -= 1;
				if (0 > H) {
					H = 23;
				}
			System.out.println(H + " " + (60 - (45 - M)));
		}
	}
}
