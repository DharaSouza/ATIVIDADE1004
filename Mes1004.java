package estruturaCondicional;

import java.util.Scanner;

public class Mes1004 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int mes;
		System.out.println("informe o mês");
		mes = ler.nextInt();
		switch (mes) {

		case 1:
			System.out.println("Janeiro");
			break;

		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:

			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
			case 12:
				System.out.println("Dezembro");
				break;
		default:
			System.out.println("mês invalido");
		}
		ler.close();
	}
}
