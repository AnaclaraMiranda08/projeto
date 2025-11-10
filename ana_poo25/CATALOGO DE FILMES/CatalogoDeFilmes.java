import java.util.Scanner;

public class CatalogoDeFilmes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // CADASTRAR USUÁRIO 
        System.out.println("Cadastro do Usuário");
        System.out.print("Nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Usuario usuario = new Usuario(nomeUsuario, email);
        System.out.println("\nUsuário cadastrado com sucesso!");
        usuario.exibirInformacoes();

        // CADASTRAR FILME
        System.out.println("\nCadastro de Filme");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Ano de lançamento: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        System.out.print("Resumo do filme: ");
        String resumo = scanner.nextLine();

        Filme filme = new Filme(titulo, diretor, ano, genero, resumo);
         
        System.out.print("Quantos atores principais deseja adicionar? ");
        int qtdAtores = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        for (int i = 1; i <= qtdAtores; i++) {
            System.out.print("Nome do ator " + i + ": ");
            String nomeAtor = scanner.nextLine();
            filme.adicionarAtor(nomeAtor);
        }

        System.out.print("Nota do filme (0 a 10): ");
        double nota = scanner.nextDouble();
        filme.setNota(nota);

        // EXIBIR DADOS
        System.out.println("\nCatálogo do Filme Avaliado por: " + usuario.getNome());
        filme.exibirDetalhes();

        scanner.close();
    } 
}
