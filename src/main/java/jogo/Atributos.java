package jogo;

public class Atributos implements Cloneable {

    private int vida;
    private int ataque;
    private int defesa;

    public Atributos(int vida, int ataque, int defesa) {
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public Atributos clone() throws CloneNotSupportedException {
        return (Atributos) super.clone();
    }

    @Override
    public String toString() {
        return "Atributos{vida=" + vida + ", ataque=" + ataque + ", defesa=" + defesa + "}";
    }
}
