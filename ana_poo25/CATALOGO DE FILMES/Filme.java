import java.util.ArrayList;

public class Filme {
    private String titulo;
    private String diretor;
    private int ano;
    private String genero;
    private String resumo;
    private ArrayList<String> atoresPrincipais;
    private double nota;

    // Construtor 
    public Filme(String titulo, String diretor, int ano, String genero, String resumo) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
        this.genero = genero;
        this.resumo = resumo;
        this.atoresPrincipais = new ArrayList<>();
        this.nota = 0.0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void adicionarAtor(String nomeAtor) {
        atoresPrincipais.add(nomeAtor);
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano: " + ano);
        System.out.println("Gênero: " + genero);
        System.out.println("Nota: " + nota);
        System.out.println("Resumo: " + resumo);
        System.out.println("Atores Principais: ");
        for (String ator : atoresPrincipais) {
            System.out.println(" - " + ator);
        }
    }
}
