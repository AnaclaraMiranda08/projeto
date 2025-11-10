package TELEVISOR;
import java.util.ArrayList;
import java.util.List;

public class Televisao {
    private List<Canal> Canais;
    private boolean ligada;
    private int canal;
    private int volume;

    public Televisao() {
        this.Canais = new ArrayList<>();
        this.ligada = false;
        this.canal = 1; // Canal padrão
        this.volume = 10; // Volume padrão
    }

    public void ligar() {
        ligada = true;
        System.out.println("Televisão ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Televisão desligada.");
    }

    public void adicionarCanal(Canal novoCanal) {
        Canais.add(novoCanal);
    }

    public void trocarCanal(int numero){
        for (Canal canal : Canais){
            if (canal.getNumero() == numero){
                mudarCanal(numero);
                break;
            }
        }
    }


    public void mudarCanal(int novoCanal) {
        if (ligada) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("A televisão está desligada. Ligue-a primeiro.");
        }
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else if (!ligada) {
            System.out.println("A televisão está desligada. Ligue-a primeiro.");
        } else {
            System.out.println("Volume já está no máximo.");
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else if (!ligada) {
            System.out.println("A televisão está desligada. Ligue-a primeiro.");
        } else {
            System.out.println("Volume já está no mínimo.");
        }
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
}
