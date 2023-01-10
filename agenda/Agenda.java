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

    public void imprimirAgenda() {
        for (int i = 0; i < ag.size(); i++) {
            System.out.println(ag.get(i));
        }
    }

    public void imprimirPessoa() {
        System.out.println("Digite o número do índice que deseja imprimir: ");
        int index = sc.nextInt();
        System.out.println(ag.get(index).toString());
    }

}
