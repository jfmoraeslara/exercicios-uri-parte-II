package application;

import java.util.Locale;
import java.util.Scanner;

public class uri_1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		int N = sc.nextInt();
		
		int count = 0;
		for (int i=0; i<N; i++) {
			double x = sc.nextDouble();
			if (x > 0.0) {			
				count++;
			}		
		}
		System.out.println(count + " valores positivos");
						
		sc.close();	
	}
}
