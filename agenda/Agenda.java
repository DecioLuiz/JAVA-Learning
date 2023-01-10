package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    Scanner sc = new Scanner(System.in);
    
    ArrayList<Pessoa> ag = new ArrayList<>();
    Pessoa p = new Pessoa();

    public Agenda() {
        super();
    }

    //Método para adicionar novo objeto "Pessoa" (nome, idade, altura) na agenda
    public void armazenarPessoa() {
        p = new Pessoa();
        System.out.println("Digite o nome: ");
        p.setNome(sc.next());
        System.out.println("Digite a idade: ");
        p.setIdade(sc.nextInt());
        System.out.println("Digite a altura: ");
        p.setAltura((float) sc.nextDouble());
        ag.add(p);
    }
    
    /*Método para remover um registro da agenda, utilizando como parâmetro uma String (nome) e comparando se o valor
        inserido pelo usuário é igual a algun dos registros, se True, o mesmo é removido.
    */
    private String nomeDel;
    public void removerPessoa() {
        System.out.println("Digite o nome da pessoa que deseja remover: ");
        nomeDel = sc.next();
        for (int i = 0; i < ag.size(); i++) {
            if (ag.get(i).getNome().equals(nomeDel) ) {
                ag.remove(i);
                System.out.println("Pessoa encontrada na posição " + i + " Nome removido: " + nomeDel);
            }
        }
    }
    
    /*Método para buscar determinado registro na agenda, utilizando como parâmetro uma String (nome) e retornando
        o resultado procurado.
    */
    String nomeBusca;
    public int buscarPessoa() {
        System.out.println("Digite a nome da pessoa que deseja procurar: ");
        nomeBusca = sc.next();
        for (int i = 0; i < ag.size(); i++) {
            if (ag.get(i).getNome().equals(nomeBusca)) {
                System.out.println(ag.get(i));
            } 
        }
        return 0;
    }

    //Método para imprimir toda a agenda
    public void imprimirAgenda() {
        for (int i = 0; i < ag.size(); i++) {
            System.out.println(ag.get(i));
        }
    }
    
    /*Método para imprimir apenas um registro/objeto, utilizando como parâmetro um número inteiro representando
        o índice do registro na lista
    */
    public void imprimirPessoa() {
        System.out.println("Digite o número do índice que deseja imprimir: ");
        int index = sc.nextInt();
        System.out.println(ag.get(index).toString());
    }

}
