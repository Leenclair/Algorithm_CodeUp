import java.util.Scanner;

public class base_1068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String result="";
		if(a>=90) {
			result = "A";
		}else if(a>=70) {
			result = "B";
		}else if(a>=40) {
			result = "C";
		}else {
			result = "D";
		}
		
		System.out.println(result);
	}
}