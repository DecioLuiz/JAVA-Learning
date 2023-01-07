package exercicio02Poo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	ContaCorrente novaConta = new ContaCorrente(0, "");

	System.out.println("Digite o número da Conta Corrente:");
	novaConta.setNumeroConta(sc.nextInt());
	System.out.println("Digite o nome do Correntista:");
	novaConta.alterarNome();
	
	System.out.println("Dados da conta: ");
	System.out.println("Número da conta: " + novaConta.getNumeroConta());
	System.out.println("Nome do Correntista: " + novaConta.getNomeCorrentista());
	System.out.println();
	
	System.out.println("Menu:");
	System.out.println("1 - Alterar o nome do Correntista");
	System.out.println("2 - Depositar");
	System.out.println("3 - Saque");
	System.out.println("4 - Dados da conta");
	System.out.println("5 - Sair");
	
	int opcao = sc.nextInt();
	
	while (opcao != 5) {
	    if (opcao == 1) {
		System.out.println("Digite o novo nome do Correntista:");
		novaConta.alterarNome();
		System.out.println("Digite nova opção:");
		opcao = sc.nextInt();		
	    } else if (opcao == 2) {
		novaConta.deposito();
		System.out.println("Digite nova opção:");
		opcao = sc.nextInt();
	    } else if (opcao == 3) {
		novaConta.saque();
		System.out.println("Digite nova opção:");
		opcao = sc.nextInt();
	    } else if (opcao == 4) {
		novaConta.dadosConta();
		System.out.println("Digite nova opção:");
		opcao = sc.nextInt();
	    } else {
		System.out.println("Opção inválida, digite novamente:");
		opcao = sc.nextInt();
	    }
	}
	
	System.out.println("Obrigado! Volte Sempre!!!");	
	
    }
}
