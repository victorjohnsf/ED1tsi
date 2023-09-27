package exercicios;
import java.util.Scanner;

public class Algoritmo360 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int ultdia[] = new int [12], data, dia, i, mes;
		String signo [] = new String [12];
		
		for (i=0; i<12; i++) {
			System.out.println("Digite signo: ");
			signo[i] = scan.nextLine();
			System.out.println("Digite ultimo dia: ");
			ultdia[i] = scan.nextInt();
			scan.nextLine();
			}
		System.out.println("\ndigite data no formato ddmm ou 9999 para terminar: ");
		data = scan.nextInt();
		while(data != 9999) {
			dia = data/100;
			mes = data % 100;
			mes--;
			if (dia > ultdia [ mes ] ) {
				mes = (mes + 1) % 12; }
			System.out.println("Signo " + signo[ mes ]);
			System.out.println("Digite data no formato ddmm ou 9999 para terminar: ");
			data = scan.nextInt();
			}
		}
	}

