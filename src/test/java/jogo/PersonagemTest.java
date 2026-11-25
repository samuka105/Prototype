package jogo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonagemTest {

    @Test
    public void testCloneEhObjetoDiferente() throws CloneNotSupportedException {
        Personagem original = new Personagem("Goblin", 1, new Atributos(30, 8, 3));
        Personagem copia = original.clone();
        assertNotSame(original, copia);
    }

    @Test
    public void testCloneMantemOsValores() throws CloneNotSupportedException {
        Personagem original = new Personagem("Goblin", 1, new Atributos(30, 8, 3));
        Personagem copia = original.clone();
        assertEquals("Goblin", copia.getNome());
        assertEquals(1, copia.getNivel());
        assertEquals(30, copia.getAtributos().getVida());
    }

    @Test
    public void testAtributosSaoCopiaProfunda() throws CloneNotSupportedException {
        Personagem original = new Personagem("Goblin", 1, new Atributos(30, 8, 3));
        Personagem copia = original.clone();
        assertNotSame(original.getAtributos(), copia.getAtributos());
    }

    @Test
    public void testAlterarAtributosDoCloneNaoAfetaOriginal() throws CloneNotSupportedException {
        Personagem original = new Personagem("Goblin", 1, new Atributos(30, 8, 3));
        Personagem copia = original.clone();
        copia.getAtributos().setVida(100);
        assertEquals(30, original.getAtributos().getVida());
        assertEquals(100, copia.getAtributos().getVida());
    }

    @Test
    public void testAlterarNomeDoCloneNaoAfetaOriginal() throws CloneNotSupportedException {
        Personagem original = new Personagem("Goblin", 1, new Atributos(30, 8, 3));
        Personagem copia = original.clone();
        copia.setNome("Goblin Chefe");
        assertEquals("Goblin", original.getNome());
    }

    @Test
    public void testCloneContinuaSendoPersonagem() throws CloneNotSupportedException {
        Personagem original = new Personagem("Goblin", 1, new Atributos(30, 8, 3));
        assertTrue(original.clone() instanceof Personagem);
    }

    @Test
    public void testClonarVariosAPartirDoMesmoModelo() throws CloneNotSupportedException {
        Personagem modelo = new Personagem("Orc", 2, new Atributos(50, 12, 5));
        Personagem a = modelo.clone();
        Personagem b = modelo.clone();
        a.getAtributos().setAtaque(99);
        assertEquals(12, b.getAtributos().getAtaque());
        assertEquals(12, modelo.getAtributos().getAtaque());
    }
}
