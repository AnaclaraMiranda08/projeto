package classes;
/*
 * Toda classe terá atributos e métodos
 * Métodos são as ações (funções)
 * Classificamos esses métodos de acordo com as suas características:
 * - Métodos Construtores: São utilizados para inicializar os atributos da classe
 * - Métodos de Acesso (Getters e Setters): São utilizados para acessar e modificar os atributos da classe;
 * GETTERS: retornam o valor do atributo
 * SETTERS: atribuem um valor ao atributo
 * -Métodos próprios: São utilizados para realizar ações específicas da classe.
 */
public class Quadrado {
//Atributos da classe quadrado:
double lado;
double area;
double perimetro;

//---MÉTODOS---

//Método Construtor:
Quadrado(double lado){
    this.lado = lado;
    this.area = lado * lado;
    this.perimetro = 4 * lado;

    //Estamos pegando a variável 'temporária' para o atributo 'this.lado' que não é temporária.    
}
//Métodos próprios:

void calcularArea(){
    this.area = lado*lado;
}

void calcularPerimetro(){
    this.perimetro = 4 * lado;
}

void imprimir(){
    System.out.println("Lado: " + lado);
    System.out.println("Área: " + area);
    System.out.println("Perímetro: " + perimetro);
    System.out.println("-------------------");
} 
}


