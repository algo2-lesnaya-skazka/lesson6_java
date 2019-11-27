package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введи № месяца:");
		int mes = in.nextInt();
		String mesString;
		switch (mes) {
		case 1:
			mesString = "Январь";
			break;
		case 2:
			mesString = "Февраль";
			break;
		case 3:
			mesString = "Март";
			break;
		case 4:
			mesString = "Апрель";
			break;
		case 5:
			mesString = "Май";
			break;
		case 6:
			mesString = "Июнь";
			break;
		case 7:
			mesString = "Июль";
			break;
		case 8:
			mesString = "Август";
			break;
		case 9:
			mesString = "Сентябрь";
			break;
		case 10:
			mesString = "Октябрь";
			break;
		case 11:
			mesString = "Ноябрь";
			break;
		case 12:
			mesString = "Декабрь";
			break;
		default:
			mesString = "Error";
			break;
		}
		System.out.print("Это месяц: " + mesString);

		in.close();
	}

}
