package TELEVISOR;

public class Canal {
    String nome;
    int numero;
    

    public Canal(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
    
    @Override
    public String toString() {
        return "Canal{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }


}
