package BombaCombustivel;

import java.util.Scanner;

public class BombaCombustivel {
    Scanner sc = new Scanner(System.in);
    
    private int tipoCombustivel;
    private float valorLitro = 0.00f;
    private float quantCombustivel = 300.00f;
    private float valorTotal;
    private float quantCombAbastecido;
    
    public BombaCombustivel(int tipoCombustivel, float valorLitro) {
        this.setTipoCombustivel(tipoCombustivel);
        this.setValorLitro(valorLitro);
        
    }
    
    public void abastecerPorValor(){
        System.out.println("Informe o valor total a abastecer:");
        this.valorTotal = (float) sc.nextDouble();       
        this.quantCombAbastecido = (float) (valorTotal / valorLitro);
        this.quantCombustivel -= quantCombAbastecido;
        System.out.println("Quantidade de litros abastecido: " + quantCombAbastecido);
    }
    
    public void abastecerPorLitro(){
        System.out.println("Informe a quantidade de litros a abastecer:");
        this.setQuantCombAbastecido((float) sc.nextDouble());
        this.quantCombustivel -= quantCombAbastecido;
        this.valorTotal =  quantCombAbastecido * valorLitro;
        System.out.println( "Valor total a pagar: " + valorTotal);
    }
    
    public String alterarCombustivel() {
        System.out.println("Informe o tipo de combustível:");
        this.setTipoCombustivel(sc.nextInt());
        switch (this.tipoCombustivel) {
            case 1:
                System.out.println("Álcool");
                break;
            case 2:
                System.out.println( "Diesel");
                break;
            case 3:
                System.out.println("Gasolina");
                break;
            default:
                System.out.println("Opção inválida, informe novamente:");
                this.setTipoCombustivel(sc.nextInt());
                break;
        }
        return null;
    }
    
    public float alterarValor() {
        System.out.println("Informe o valor do litro:");
        this.setValorLitro((float) sc.nextDouble());
        return valorLitro;
    }
    
    public void mostrarDados(){
        System.out.println("Combustível atual: " + tipoCombustivel);
        System.out.println("Valor por litro: " + valorLitro);
        System.out.println("Quantidade de combustível na bomba: " + quantCombustivel);
    }
    
    public void alterarQuantidade() {
        System.out.println("Informe a quantidade de combustível da bomba:");
        this.setQuantCombustivel((float) sc.nextDouble());
        System.out.println("Quantidade atual de combustível na bomba: " + quantCombustivel);
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getQuantCombAbastecido() {
        return quantCombAbastecido;
    }

    public void setQuantCombAbastecido(float quantCombAbastecido) {
        this.quantCombAbastecido = quantCombAbastecido;
    }

    public int getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(int tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public float getQuantCombustivel() {
        return quantCombustivel;
    }

    public void setQuantCombustivel(float quantCombustivel) {
        this.quantCombustivel = quantCombustivel;
    }
}
