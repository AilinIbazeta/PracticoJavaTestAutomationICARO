package Ejercicio3;
public class Espadachin extends Personaje {
    private int ataque;

    public Espadachin(int salud, int ataque) {
        super(salud);
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }


    public void entrenar() {
        this.ataque += 10;
    }
}