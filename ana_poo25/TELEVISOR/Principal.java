package TELEVISOR;

public class Principal {
    public static void main(String[] args) {
        //Criar instância da televisão

        //Adicionar canais
        Canal canal1 = new Canal("Globo", 1);
        Canal canal2 = new Canal("SBT", 4);
        Canal canal3 = new Canal("Record", 7);
        Canal canal4 = new Canal("Band", 11);
        Canal canal5 = new Canal("RedeTV!", 9);

        Televisao tv = new Televisao();
        
        tv.adicionarCanal(canal1);
        tv.adicionarCanal(canal2);
        tv.adicionarCanal(canal3);
        tv.adicionarCanal(canal4);
        tv.adicionarCanal(canal5);

        tv.ligar();

        tv.trocarCanal(4); // Mudar para o canal 7 (Record)

        
        System.out.println("Canais disponíveis:");
        System.out.println(canal1.getNome() + " - " + canal1.getNumero());
        System.out.println(canal2.getNome() + " - " + canal2.getNumero());
        System.out.println(canal3.getNome() + " - " + canal3.getNumero());
        System.out.println(canal4.getNome() + " - " + canal4.getNumero());
        System.out.println(canal5.getNome() + " - " + canal5.getNumero());
    }
}
