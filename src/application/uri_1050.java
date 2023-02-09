package application;

import java.util.Scanner;

public class uri_1050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String ddd;

		switch (x) {
		case 61:
			ddd = "Brasilia";
			break;
		case 71:
			ddd = "Salvador";
			break;
		case 11:
			ddd = "Sao Paulo";
			break;
		case 21:
			ddd = "Rio de Janeiro";
			break;
		case 32:
			ddd = "Juiz de Fora";
			break;
		case 19:
			ddd = "Campinas";
			break;
		case 27:
			ddd = "Vitoria";
			break;
		case 31:
			ddd = "Belo Horizonte";
			break;
		default:
			ddd = "DDD nao cadastrado";
		}
		System.out.println(ddd);

		sc.close();
	}
}
