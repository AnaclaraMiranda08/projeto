public class CriarContato{
    public static void main(String[] args) {
        Contato contato1 = new Contato(
            "Juju",
            "juju@gmail.com",
            "(69) 99237-6589");

        Contato contato2 = new Contato(
            "Maisinha",
            "maisinhadograu@gmail.com",
            "(99) 99999-9999");

        Contato contato3 = new Contato(
            "Viny",
            "vinyagiota@gmail.com",
            "(88) 88888-8888");

        //contato1.imprimeInformacoes();

        Agenda agenda1 = new Agenda();
        agenda1.armazenarContato(contato1);
        agenda1.armazenarContato(contato2);
        agenda1.armazenarContato(contato3);

        agenda1.imprimirContatos();

        agenda1.removerContato(contato1);
        agenda1.encontrarContato("juju");

       
    }
}
