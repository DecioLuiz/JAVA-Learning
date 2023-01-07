package exercicio02Poo;

import java.util.Scanner;

public class ContaCorrente {
    Scanner sc = new Scanner(System.in);
    
    private int numeroConta;
    private String nomeCorrentista;
    private float saldo = 0.00f;
    private float deposito = 0.00f;
    private float saque = 0.00f;
  
   

    public ContaCorrente(int numeroConta, String nomeCorrentista) {
	this.setNumeroConta(numeroConta);
	this.setNomeCorrentista(nomeCorrentista);
    }
    
    public void alterarNome() {
	
	this.setNomeCorrentista(sc.nextLine());
    }
    
    public double deposito() {
	System.out.println("Informe o valor do depósito:");
	deposito = sc.nextFloat();
	saldo += deposito;
	return saldo;
    }
    
    public double saque() {
	System.out.println("Informe o valor do saque:");
	saque = sc.nextFloat();
	saldo -= saque;
	return saldo;
	
    }
    
    public void dadosConta(){
	System.out.println("Número da conta: " + numeroConta);
	System.out.println("Nome do Correntista: " + nomeCorrentista);
	System.out.println("Saldo da Conta Corrente: " + saldo);
    }
    
    public int getNumeroConta() {
	return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
	this.numeroConta = numeroConta;
    }


    public String getNomeCorrentista() {
	return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
	this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldo() {
	return saldo;
    }

    public void setSaldo(float saldo) {
	this.saldo = saldo;
    }
    
    

}
