package Calculadora;

public class Calculadora {
    
    double num1;
    double num2;
    double resultado;
    
    public Calculadora() {
        this.setNum1(num1); ;
        this.setNum2(num2);
    }
    
    public void somar() {
        this.resultado = this.num1 + this.num2;
        System.out.println("Resultado da Soma:");
        System.out.printf("%.2f  +  %.2f  =  %.2f%n", this.num1, this.num2, this.resultado ); 
        System.out.println();
    }
    
    public void subtrair() {
       this.resultado = this.num1 - this.num2;
       System.out.println("Resultado da Subtração:");
       System.out.printf("%.2f  -  %.2f  =  %.2f%n", this.num1, this.num2, this.resultado );
       System.out.println();
    }
    
    public void multiplicar() {
        this.resultado = this.num1 * this.num2;
        System.out.println("Resultado da Multiplicação:");
        System.out.printf("%.2f  x  %.2f  =  %.2f%n", this.num1, this.num2, this.resultado );
        System.out.println();
    }
    
    public void dividir() {
        this.resultado = this.num1 / this.num2;
        System.out.println("Resultado da Divisão:");
        System.out.printf("%.2f  \u00f7  %.2f  =  %.2f%n", this.num1, this.num2, this.resultado);
        System.out.println();
    }
    
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
}
