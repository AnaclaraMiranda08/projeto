package classes;
/*
* Craiar classes para calcular a área e perímetro de formas geométricas 2D;
* Cada forma terá sua própria classe: Quadrado, Circulo, Triangulo e Retângulo.
* Insira os atributos e métodos necessários para realizar os cálculos.
*/

public class Principal {
    // A classe principal 9main) é utilizada para a execução dos métodos

    public static void main(String[] args) {
    //Instância de um quadrado
    Quadrado q1 = new Quadrado(4);
    Quadrado q2 = new Quadrado(6.5);
    
    //q1.calcularArea();
    //q1.calcularPerimetro();
    q1.imprimir();
    q2.imprimir();
    }

}
