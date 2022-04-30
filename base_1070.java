import java.util.Scanner;

public class base_1070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		String weather="";
		switch(i) {
		case 12: case 1: case 2:
			weather="winter";
		break;
		case 3: case 4: case 5:
			weather="spring";
			break;
		case 6: case 7: case 8:
			weather="summer";
			break;
		case 9: case 10: case 11:
			weather="fall";
			break;
		}
		System.out.println(weather);
	}
}