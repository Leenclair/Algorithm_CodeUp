import java.util.Scanner;

public class base_1012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float f=sc.nextFloat();
		String result = String.format("%.6f", f);
		System.out.println(result);
	}
}