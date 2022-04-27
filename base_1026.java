import java.util.Scanner;

public class base_1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		
		String time[]=str.split(":");
		int min = Integer.parseInt(time[1]);
		System.out.println(min);
	}
}