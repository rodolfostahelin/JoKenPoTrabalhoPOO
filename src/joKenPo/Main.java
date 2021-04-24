package joKenPo;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random geradorN = new Random();

		System.out.println("Pedra = 0");
		System.out.println("Papel = 1");
		System.out.println("Tesoura = 2");
		System.out.print("Usuario: ");

		int geteUsuario = leitor.nextInt();
		int geteComputador = geradorN.nextInt(3);

		if (0 <= geteUsuario && geteUsuario <= 2) {
			System.out.println("Jogada do computador: " + geteComputador);
			if (geteUsuario == geteComputador) {
				System.out.println("Empate");
			} else {
				if ((geteUsuario == 0 && geteComputador == 2) || (geteUsuario == 1 && geteComputador == 0)
						|| (geteUsuario == 2 && geteComputador == 1)) {
					System.out.println("Jogador venceu!");
				} else {
					System.out.println("Computador venceu!");
				}
			}
		} else {
			System.out.println("Você jogou um número inválido!");
		}
	}
}