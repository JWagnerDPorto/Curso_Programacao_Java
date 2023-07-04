import java.util.Scanner;

public class ExemplosAula {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine(); // Ler texto até a quebra de linha.
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// Ctrl+ A (seleciona tudo)
		// Delete (para deletar)
		// Ctrl + Shift + F (auto identação)

		sc.close();
	}

}
