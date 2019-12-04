
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введи номер месяца: ");
		int mes=in.nextInt();
		String mesString;
		switch (mes) {
		case 1: mesString = "Зима";
		break;
		case 2: mesString = "Зима";
		break;
		case 3: mesString = "Весна";
		break;
		case 4: mesString = "Весна";
		break;
		case 5: mesString = "Весна";
		break;
		case 6: mesString = "Лето";
		break;
		case 7: mesString = "Лето";
		break;
		case 8: mesString = "Лето";
		break;
		case 9: mesString = "Осень";
		break;
		case 10: mesString = "Осень";
		break;
		case 11: mesString = "Осень";
		break;
		case 12: mesString = "Зима";
		break;
		default: mesString = "Введите номер месяца 1-12!!!";
		break;
		}
		System.out.print("Это время года: " + mesString);
		in.close();
		}
	
}
