package Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculadora novaCalc1 = new Calculadora();
        CalculadoraCientifica novaCalc2 = new CalculadoraCientifica();

        int calc = 0;
        
        // Menu para escolher o tipo de calculadora básica ou científica, ou a opção encerrar programa. 
        do {
            System.out.println("Escolha o tipo de Calculadora desejada:");
            System.out.println("1 - Calculadora Básica");
            System.out.println("2 - Calculadora Científica");
            System.out.println("3 - Encerrar");
            System.out.println();

            calc = sc.nextInt();
            int op = 0;

            switch (calc) {
                case 1: {
                    System.out.println("Calculadora Básica");
                    System.out.println();
                    System.out.println("Digite o primeiro número: ");
                    novaCalc1.setNum1(sc.nextDouble());
                    System.out.println("Digite o segundo número: ");
                    novaCalc1.setNum2(sc.nextDouble());
                    System.out.println();
                    
                    // Menu com todas as opções da Calculadora Básica, operações realizadas com os 2 números inseridos pelo usuário. 
                    do {
                        System.out.println("Selecione a operação desejada:");
                        System.out.println();
                        System.out.println("1 - Soma");
                        System.out.println("2 - Subtração");
                        System.out.println("3 - Multiplicação");
                        System.out.println("4 - Divisão");
                        System.out.println("5 - Realizar todas as operações");
                        System.out.println("6 - Voltar ao menu principal");
                        System.out.println();

                        op = sc.nextInt();

                        switch (op) {
                            case 1:
                                novaCalc1.somar();
                                break;
                            case 2:
                                novaCalc1.subtrair();
                                break;
                            case 3:
                                novaCalc1.multiplicar();
                                break;
                            case 4:
                                novaCalc1.dividir();
                                break;
                            case 5:
                                System.out.println("Todas das operações:");
                                novaCalc1.somar();
                                novaCalc1.subtrair();
                                novaCalc1.multiplicar();
                                novaCalc1.dividir();
                                break;
                            default:
                                System.out.println("Opção inválida, escolha novamente;");
                                System.out.println();
                                break;
                        }
                        
                    } while (op != 6);
                    
                    break;
                }
                case 2:
                    System.out.println("Calculadora Científica");
                    System.out.println();
                    System.out.println("Digite o primeiro número: ");
                    novaCalc2.setNum1(sc.nextDouble());
                    System.out.println("Digite o segundo número: ");
                    novaCalc2.setNum2(sc.nextDouble());
                    System.out.println();
                    
                    // Menu com todas as opções da Calculadora Científica, operações realizadas com os 2 números inseridos pelo usuário. 
                    do {
                        System.out.println("Selecione a operação desejada:");
                        System.out.println();
                        System.out.println("1 - Soma");
                        System.out.println("2 - Subtração");
                        System.out.println("3 - Multiplicação");
                        System.out.println("4 - Divisão");
                        System.out.println("5 - Raiz Quadrada");
                        System.out.println("6 - Potencia");
                        System.out.println("7 - Todas as Operações");
                        System.out.println("8 - Voltar ao menu principal");
                        System.out.println();

                        op = sc.nextInt();

                        switch (op) {
                            case 1:
                                novaCalc2.somar();
                                break;
                            case 2:
                                novaCalc2.subtrair();
                                break;
                            case 3:
                                novaCalc2.multiplicar();
                                break;
                            case 4:
                                novaCalc2.dividir();
                                break;
                            case 5:
                                novaCalc2.raizQuadrada();
                                break;
                            case 6:
                                novaCalc2.potencia();
                                break;
                            case 7:
                                System.out.println("Resultado de todas as operações:");
                                System.out.println();
                                novaCalc2.somar();
                                novaCalc2.subtrair();
                                novaCalc2.multiplicar();
                                novaCalc2.dividir();
                                novaCalc2.raizQuadrada();
                                novaCalc2.potencia();
                                break;
                            default:
                                System.out.println("Opção inválida, escolha novamente");
                                System.out.println();
                                break;
                        }
                    } while (op != 8);
                    break;

                default:
                    System.out.println("Opção inexistente, escolha novamente");
                    break;
            }
        } while (calc != 3);

    }
}
