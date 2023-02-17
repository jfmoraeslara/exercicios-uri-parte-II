package application;

import java.util.Locale;
import java.util.Scanner;

public class uri_1061_form_2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Essa forma de código dá algumas exceções caso digite algo errado como espaço, 
		melhor trabalhar com tudo em String e posteriomente transformar em integer. */
		
		int d, d1;
		int h = 0, h1 = 0, m = 0, m1 = 0, s = 0, s1 = 0;
		int tempo, t1, t2;		
		
		String text = sc.next();
		d = sc.nextInt();
		h = sc.nextInt();
		text = sc.next();
		m = sc.nextInt();
		text = sc.next();
		s = sc.nextInt();
		text = sc.next();
		d1 = sc.nextInt();		
		h1 = sc.nextInt();
		text = sc.next();
		m1 = sc.nextInt();
		text = sc.next();
		s1 = sc.nextInt();
		
		t1 = s + m*60 + h*60*60 + d*60*60*24;
		t2 = s1 + m1*60 + h1*60*60 + d1*60*60*24;
		tempo = t2 - t1;
		
		System.out.println(tempo / (60*60*24) + " dia(s)"); tempo = tempo%(60*60*24);
		System.out.println(tempo / (60*60)  + " hora(s)"); tempo = tempo%(60*60);
		System.out.println(tempo / 60 + " minuto(s)"); tempo = tempo%(60);
		System.out.println(tempo + " segundo(s)");
		
		sc.close();	
	}

}
