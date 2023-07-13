import java.util.Scanner;

public class ContaTerminal {
	public static void main(String [] args) {
		//Inicializa o Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Inicializa e Pede um Valor a Variável.
		System.out.print("Por Favor, Digite seu Nome: ");
		String nomeClinte = sc.next();
		
		System.out.print("Por favor, Digite sua Agencia: ");
		String Agencia = sc.next();
		
		System.out.print("Por Favor, Digite seu Numero da Conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Por Favor, Digite seu Saldo: ");
		double saldo = sc.nextDouble();
		
		//Imprime as Informações para o Usuário.
		System.out.println("Olá " + nomeClinte + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
		
		//Fecha o Scanner.
		sc.close();
	}
}