public class Principal {

    public static void main(String[] args) {
        System.out.println("Olá pobres!" );
        Personagem p1 = new Personagem("Juliana", 100,80, 90,"Catana Estrelada",16);
        Personagem p2 = new Personagem("Vinícius", 100, 90, 80, "Foice Noturna", 19);
        //Mesmo coisa que o anterior//
        p1.setNome ("Juliana: matadora de homens");
        System.out.println(p1.getNome());

        p1.setPontosdeVida (100);
        System.out.println(p1.getPontosdeVida());

        p1.setForca(80);
        System.out.println(p1.getForca());

        p1.setDefesa(90);
        System.out.println(p1.getDefesa());

        p1.setArma( "Catana Estrelada");
        System.out.println(p1.getArma());

        p1.setIdade(16);

        p1.apresentar(); 

        p1.fezaniversario();

        p1.apresentar(); 
    
        p2.setNome( "Vinícius: o Ninja");
        System.out.println(p2.getNome());
        p2.setPontosdeVida(100);
        System.out.println(p2.getPontosdeVida());

        p2.setForca(90);
        System.out.println(p2.getForca());

        p2.setDefesa(80);
        System.out.println(p2.getDefesa());

        p2.setArma( "Foice Noturna");
        System.out.println(p2.getArma());

        p2.setIdade(19);

        p2.apresentar();

        p2.fezaniversario();
        p2.apresentar();
    }
    }
    

