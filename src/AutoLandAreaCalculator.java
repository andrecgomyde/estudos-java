import java.util.Locale;
import java.util.Scanner;

public class AutoLandAreaCalculator {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é a largura do seu terreno?");	
		double largura = sc.nextDouble();
		System.out.println("Qual é o comprimento do seu terreno?");	
		double comprimento = sc.nextDouble();
		System.out.println("Quantos metros quadrados tem o seu terreno?");	
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
	}
}
