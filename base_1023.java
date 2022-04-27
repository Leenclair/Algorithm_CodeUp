import java.util.Scanner;

public class base_1023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		String result[] = str.split("[.]");
		
		String a = result[0];
		String b = result[1];
		
		System.out.println(a);
		System.out.println(b);
		
	}
}