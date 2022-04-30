import java.util.Scanner;

public class base_1069 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result="";
		switch(str.charAt(0)) {
		case 'A':
			result="best!!!";
			break;
		case 'B':
			result="good!!";
			break;
		case 'C':
			result="run!";
			break;
		case 'D':
			result="slowly~";
			break;
		default:
			result="what?";
		}
		System.out.println(result);
	}
}