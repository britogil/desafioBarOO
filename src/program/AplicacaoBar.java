package program;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class AplicacaoBar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("SEXO:");
		Bill.gender = sc.next().charAt(0);
		
		System.out.print("Quantidade de Cerveja: ");
		int qtdb = sc.nextInt();
		
		System.out.print("Qauntidade de Refrigerante: ");
		int qtdsd = sc.nextInt();
		
		System.out.print("Quantidade de Espetinhos: ");
		int qtdbc = sc.nextInt();
		System.out.println();
		
		System.out.println("RELAT�RIO:");
		
		double consumo = Bill.feeding(qtdb, qtdbc, qtdsd);
		
		if(consumo > 30) {
		
		System.out.printf("Consumo = R$ %.2f %n", consumo);
		double covert = Bill.cover();
		System.out.println("Isento de Couver");
		double ingress = Bill.ticket();
		System.out.printf("Ingresso = R$ %.2f", ingress);
		System.out.println();
		double vp = Bill.total(qtdb, qtdbc, qtdsd);
		System.out.printf("Valor a Pagar = R$ %.2f", vp);
		}
		
		else {
			System.out.printf("Consumo = R$ %.2f %n", consumo);
			double covert = Bill.cover();
			System.out.printf("Couvert = R$ %.2f %n", covert);
			double ingress = Bill.ticket();
			System.out.printf("Ingresso = R$ %.2f", ingress);
			System.out.println();
			double vp = Bill.total(qtdb, qtdbc, qtdsd) + covert;
			System.out.printf("Valor a Pagar = R$ %.2f", vp);
			
		}
		
		
		sc.close();
	}

}