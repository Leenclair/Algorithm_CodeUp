import java.util.Scanner;

public class base_1064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = (a<b?a:b)<c?(a<b?a:b):c;
		
		System.out.println(result);
	}
}