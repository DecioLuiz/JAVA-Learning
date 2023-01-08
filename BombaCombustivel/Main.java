
package BombaCombustivel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        BombaCombustivel novaBomba = new BombaCombustivel(0, 0.00f);
        System.out.println("Informe o tipo de combustível:");
        System.out.println("1 - Álcool");
        System.out.println("2 - Diesel");
        System.out.println("3 - Gasolina");

        novaBomba.setTipoCombustivel(sc.nextInt());
        
        while (novaBomba.getTipoCombustivel() <= 0 || novaBomba.getTipoCombustivel() > 3) {
            if (novaBomba.getTipoCombustivel() == 1) {
                    System.out.println("Combustível escolhido: Álcool");
            } else if (novaBomba.getTipoCombustivel() == 2) {
                    System.out.println("Combustível escolhido: Diesel");
            } else if (novaBomba.getTipoCombustivel() == 3) {
                    System.out.println("Combustível escolhido: Gasolina");
            } else {
                    System.out.println("Opção errada, escolha novamente");
            }
            novaBomba.setTipoCombustivel(sc.nextInt());
        }

        System.out.println();
        System.out.println("Informe o valor do litro:");
        novaBomba.setValorLitro((float) sc.nextDouble()) ;
                
        System.out.println();

        System.out.println("Opções:");
        System.out.println("1 - Abastecer por Valor");
        System.out.println("2 - Abastecer por Litro");
        System.out.println("3 - Alterar valor");
        System.out.println("4 - Alterar Combustível");
        System.out.println("5 - Alterar a quantidade de combustível");
        System.out.println( "6 - Mostra dados da bomba");
        System.out.println( "7 - Encerrar");
        
        int o = sc.nextInt();
        
        while (o != 7) {
            switch (o) {
                case 1:
                    novaBomba.abastecerPorValor();
                    System.out.println();
                    System.out.println("Escolha nova opção:");
                    o = sc.nextInt();
                    break;
                case 2:
                    novaBomba.abastecerPorLitro();
                    System.out.println();
                    System.out.println("Escolha nova opção:");
                    o = sc.nextInt();
                    break;
                case 3:
                    novaBomba.alterarValor();
                    System.out.println();
                    System.out.println("Escolha nova opção:");
                    o = sc.nextInt();
                    break;
                case 4:
                    novaBomba.alterarCombustivel();
                    novaBomba.alterarValor();
                    System.out.println();
                    System.out.println("Escolha nova opção:");
                    o = sc.nextInt();
                    break;
                case 5:
                    novaBomba.alterarQuantidade();
                    System.out.println();
                    System.out.println("Escolha nova opção:");
                    o = sc.nextInt();
                    break;
                case 6:
                    novaBomba.mostrarDados();
                    System.out.println();
                    System.out.println("Escolha nova opção:");
                    o = sc.nextInt();
                    break;
                default:
                    System.out.println("Opção inválida, informe novamente:");
                    o = sc.nextInt();
                    break;
            }

        }

    }
}
