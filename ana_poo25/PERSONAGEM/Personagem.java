public class Personagem {
    // Atributos 
    private String nome;
    private int pontosDeVida;
    private int forca;
    private int defesa;
    private String arma;
    private int idade;

    Personagem (String nome, int pontosDeVida, int forca, int defesa, String arma, int idade) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.forca = forca;
        this.defesa = defesa;
        this.arma = arma;
        this.idade = idade;
    }

    //Métodos
    public void apresentar() {
        System.out.println("Olá, eu sou " + this.nome + ". Tenho " + this.pontosDeVida + " de vida, " + this.forca + " de força e "
                + this.defesa + " de defesa." + " Minha arma é uma " + this.arma + ". E tenho " + this.idade + " anos.");
    }
    
    public void atacar(Personagem alvo) {
        int dano = this.forca - alvo.defesa;
        if (dano < 0)
            dano = 0; //Não permite dano negativo
        alvo.pontosDeVida -= dano;
        System.out.println(this.nome + " atacou " + alvo.nome + " causando " + dano + " de dano. ");

    }


    //Getters e Setters

    //Agora só consigo alterar o nome através deste método (SET)
    
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    
    //Quando eu precisar saber qual o nome do personagem, utilizo esse método (GET)
    public String getNome() {
        return this.nome;
    }

    public int getPontosdeVida() {
        return this.pontosDeVida;
    }

    public void setPontosdeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    // Crie os Getters e Setters dos outros atributos

    public int getForca() {
        return forca;   
    }

        public void setForca(int forca) {
            this.forca = forca; 
        } 

    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public String getArma() {
        return arma;
    }
    public void setArma(String arma) {
        this.arma = arma;
    }
    public void setNomeArma(String nomeArma) {
        this.arma = nomeArma;
    }
    public void fezaniversario () {
        this.idade = this.idade +1; 
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    

        
        

    }

