import java.util.Scanner;

public class AutoAreaCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de a:");
		double a = sc.nextDouble();

		System.out.println("Digite o valor de b:");
		double b = sc.nextDouble();

		System.out.println("Digite o valor de c:");
		double c = sc.nextDouble();

		double area = (a + b) / 2 * c;
		System.out.println("A área é: " + area);

		sc.close();
	}

}
