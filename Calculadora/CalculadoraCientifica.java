package Calculadora;

public class CalculadoraCientifica extends Calculadora {
    
    public CalculadoraCientifica() {
        super();
    }
    
    // Método que calcula e retorna o resultado da raiz quadrada de cada um dos 2 números inseridos pelo usuário
    
    public void raizQuadrada() {
        this.setResultado(Math.sqrt(this.getNum1()));

        if (this.getNum1() < 0) {
            System.out.println(this.getNum1() + " é negativo e portanto não possui raiz quadrada.");
        } else {
            System.out.println("Resultado da Raiz Quadrada de: " + this.getNum1());
            System.out.printf("%.2f%n", this.getResultado());
        }
        System.out.println();
        
        this.setResultado(Math.sqrt(this.getNum2()));

        if (this.getNum2() < 0) {
            System.out.println(this.getNum2() + " é negativo e portanto não possui raiz quadrada.");
        } else {
            System.out.println("Resultado da Raiz Quadrada de: " + this.getNum2());
            System.out.printf("%.2f%n", this.getResultado());
        }
        System.out.println();
    }
    
    // Método que calcula a potência, neste caso o primeiro número elevado ao segundo número
    
    public void potencia() {
        this.setResultado(Math.pow(this.getNum1(), this.getNum2()));
        System.out.println("Resultado de " + this.getNum1() + " elevado a " + this.getNum2() + " é:");
        System.out.printf("%.2f%n", this.getResultado() );
        System.out.println();
    }
    
}
