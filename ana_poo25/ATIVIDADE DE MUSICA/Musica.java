public class Musica extends Midia {
    private String artista;
     
    //Construtor 
    public Musica (String titulo, int duracao, String artista) {
        super (titulo, duracao);
        this.artista = artista; 
    }
 
     public String getArtista(){
        return artista;
     }
     public void setArtista (String artista) {
        this.artista = artista;
     }

     //polimorfismo 
     public void Reproduzindo () {
        System.out.println("Tocando música " + getTitulo() + " - " + artista);
     }

     //Método próprio extra
     public void exibirInfo() {
         System.out.println("Música: " + getTitulo() + " | Artista: " + artista + " | Duração: " + getDuracao() + " min");
     }

    //Getters  e Setters
}
