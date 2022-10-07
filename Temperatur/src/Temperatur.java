import java.util.Scanner;

class Main {
	
	public static void main(String[]args) {
	
	System.out.println("Gib Temperatur in Centigrade ein");
	Scanner sc = new Scanner(System.in);
	int c = Integer.parseInt(sc.nextLine());
	float f = ((9*c)/5)+32;
	
	System.out.println("Temperatur in Fahrenheit ist: "+f);

	}
}
