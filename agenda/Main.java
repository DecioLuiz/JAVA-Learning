package agenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agenda novaAgenda = new Agenda();

        int opc;

        do {
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Remover pessoa");
            System.out.println("3 - Buscar pessoa");
            System.out.println("4 - Imprimir agenda");
            System.out.println("5 - Imprimir pessoa");
            System.out.println("6 - Sair");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    novaAgenda.armazenarPessoa();
                    System.out.println();
                    break;
                case 2:
                    novaAgenda.removerPessoa();
                    System.out.println();
                    break;
                case 3:
                    novaAgenda.buscarPessoa();
                    System.out.println();
                    break;
                case 4:
                    novaAgenda.imprimirAgenda();
                    System.out.println();
                    break;
                case 5:
                    novaAgenda.imprimirPessoa();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Obrigado por usar a agenda. Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida, selecione novamente");
                    System.out.println();
                    break;
            }
            
        } while (opc != 6);
    }
}
