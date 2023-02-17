package application;

import java.util.Scanner;

public class uri_1061_form_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// split - comando utilizado para separar as informações
		// replace - comando para junta tudo que está separado
		String di[] = sc.nextLine().split(" ");
		String hi[] = sc.nextLine().replaceAll(" ", "").split(":");
		String df[] = sc.nextLine().split(" ");
		String hf[] = sc.nextLine().replaceAll(" ", "").split(":");
		
		// converter as posições das Strings para inteiro
		int d1 = Integer.parseInt(di[1]);
		int h1 = Integer.parseInt(hi[0]);
		int m1 = Integer.parseInt(hi[1]);
		int s1 = Integer.parseInt(hi[2]);
		
		int d2 = Integer.parseInt(df[1]);
		int h2 = Integer.parseInt(hf[0]);
		int m2 = Integer.parseInt(hf[1]);
		int s2 = Integer.parseInt(hf[2]);
		
		// conversão do tempo em segundos
		int t1, t2, tempo;
		t1 = s1 + m1*60 + h1*60*60 + d1*60*60*24;
		t2 = s2 + m2*60 + h2*60*60 + d2*60*60*24;
		tempo = t2 - t1;
		
		System.out.println(tempo / (60*60*24) + " dia(s)");
		tempo = tempo%(60*60*24);
		System.out.println(tempo / (60*60)  + " hora(s)");
		tempo = tempo%(60*60);
		System.out.println(tempo / 60 + " minuto(s)");
		tempo = tempo%(60);
		System.out.println(tempo + " segundo(s)");

	}
}
