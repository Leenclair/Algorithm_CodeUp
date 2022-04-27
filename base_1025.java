import java.util.Scanner;

public class base_1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		
		String ans[] = str.split("");
		System.out.println("["+Integer.parseInt(ans[0])*10000+"]");
		System.out.println("["+Integer.parseInt(ans[1])*1000+"]");
		System.out.println("["+Integer.parseInt(ans[2])*100+"]");
		System.out.println("["+Integer.parseInt(ans[3])*10+"]");
		System.out.println("["+Integer.parseInt(ans[4])+"]");
		
		
	}
}