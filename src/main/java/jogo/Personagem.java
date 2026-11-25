package jogo;

public class Personagem implements Cloneable {

    private String nome;
    private int nivel;
    private Atributos atributos;

    public Personagem(String nome, int nivel, Atributos atributos) {
        this.nome = nome;
        this.nivel = nivel;
        this.atributos = atributos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    @Override
    public Personagem clone() throws CloneNotSupportedException {
        Personagem copia = (Personagem) super.clone();
        copia.atributos = this.atributos.clone();
        return copia;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", atributos=" + atributos +
                '}';
    }
}
