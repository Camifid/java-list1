/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar 
 * o valor da área deste círculo com quatro casas decimais conforme exemplos.
 * 
 * Fórmula da área: area = π . raio2
 * Considere o valor de π = 3.14159
 * 
 * Exemplos: 
 * Entrada: 2.00
 * Saída: A=12.5664
 * 
 * Entrada: 100.64
 * Saída: A=31819.3103
 * 
 * Entrada: 150.00
 * Saída: A=70685.7750 */

import java.util.Locale;
import java.util.Scanner;

public class List1_A2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area;
		double pi = 3.14159;
		double raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();

	}

}
