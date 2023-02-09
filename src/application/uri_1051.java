package application;

import java.util.Locale;
import java.util.Scanner;

public class uri_1051 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
					
		double x = sc.nextDouble();
		
		double imp;
		if (x <= 2000.00) {
			System.out.println("Isento");
		}
		
		else if (x <= 3000.00) {
			imp = (x - 2000.0) * 0.08;
			System.out.printf("R$ %.2f%n", imp);
		}
		
		else if (x <= 4500.00) {
			imp = (x - 3000.0) * 0.18 + (1000.0 * 0.08);
			System.out.printf("R$ %.2f%n", imp);
		}
		
		else {
			imp = (x - 4500.0) * 0.28 + (1500.0 * 0.18) + (1000.0 * 0.08);
			System.out.printf("R$ %.2f%n", imp);
		}
		
		sc.close();	
	}

}
