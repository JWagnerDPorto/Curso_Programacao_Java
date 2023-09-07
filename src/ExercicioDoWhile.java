import java.util.Locale;
import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextFloat();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenhei: %.1f%n", F);
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
		

	}

}
