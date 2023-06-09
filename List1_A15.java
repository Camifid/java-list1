/* Escreva um programa que repita a leitura de uma senha até que
 * ela seja válida. Para cada leitura de senha incorreta informada,
 * escrever a mensagem "Senha Invalida". Quando a senha for informada
 * corretamente deve ser impressa a mensagem "Acesso Permitido" e o 
 * algoritmo encerrado. Considere que a senha correta é o valor 2002.
 * 
 * Exemplo:
 * Entrada: 2200 1020 2022 2002
 * Saída: Senha Invalida Senha Invalida Senha Invalida Acesso Permitido
 * */
import java.util.Scanner;

public class List1_A15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	int N;
	
	N = sc.nextInt();
	
	while (N != 2002) {
		System.out.println("Senha Invalida");
		N = sc.nextInt();
		} 

		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
