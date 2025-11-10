

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos =
    new ArrayList<>();

    public void armazenarContato(Contato contato){
        this.contatos.add(contato);
        
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public int encontrarContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1; 
    }

    public void imprimirContatos() {
        System.out.println("=======INÍCIO=======");
        for (Contato contato : contatos) {
            contato.imprimeInformacoes();
            System.out.println("");
        }
        System.out.println("=======FIM=======");
    }


    public void imprimirContyato(int posicao){
        this.contatos.get(posicao).imprimeInformacoes();
    }
}
