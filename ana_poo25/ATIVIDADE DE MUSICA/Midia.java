public class Midia {
    private String titulo;
    private int duracao;

    //Construtor 
    public Midia (String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }
    //Getters e Setters 
    public String getTitulo () {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuração(int duração, int duracao) {
        this.duracao = duracao;
    }
    // Métodos proprios 
    public void play() {
        System.out.println("Reproduzindo mídia: " + titulo);
    }
    public void pause() {
        System.out.println("Mídia pausanda: " + titulo);
    }


}
