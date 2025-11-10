public class Usuario extends Pessoa {
    private String email;
    
    public Usuario(String nome, String email) {
        super(nome); // chama o construtor de Pessoa
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Usuário: " + getNome());
        System.out.println("Email: " + email);
    }
}
