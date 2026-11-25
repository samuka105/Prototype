package jogo;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Personagem modelo = new Personagem("Goblin", 1, new Atributos(30, 8, 3));

        Personagem goblinChefe = modelo.clone();
        goblinChefe.setNome("Goblin Chefe");
        goblinChefe.setNivel(5);
        goblinChefe.getAtributos().setVida(80);
        goblinChefe.getAtributos().setAtaque(20);

        System.out.println("Modelo:  " + modelo);
        System.out.println("Clone:   " + goblinChefe);
    }
}
