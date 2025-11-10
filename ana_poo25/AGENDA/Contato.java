public class Contato {
    private String _nome;
    private String _telefone;
    private String _email;

    public Contato(String nome, String telefone, String email) {
        this._nome = nome;
        this._telefone = telefone;
        this._email = email;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public String getTelefone() {
        return _telefone;
    }

    public void setTelefone(String telefone) {
        this._telefone = telefone;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        this._email = email;
    }

    public void imprimeInformacoes(){
        System.out.println("_Nome: " + this._nome);
        System.out.println("_Telefone: " + this._telefone);
        System.out.println("_Email: " + this._email);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + _nome + '\'' +
                ", telefone='" + _telefone + '\'' +
                ", email='" + _email + '\'' +
                '}';
    }
}                   
