import java.util.Scanner;

public class base_1019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String date[] = str.split("[.]");
		
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		
		System.out.printf(String.format("%04d.%02d.%02d", year, month, day));
	}
}