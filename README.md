# Padrão Prototype

Projeto de um pequeno jogo onde os inimigos são criados a partir de modelos
já configurados. Em vez de montar cada inimigo do zero, parte-se de um
personagem base (por exemplo um "Goblin") e faz-se uma cópia dele para gerar
variações, como um "Goblin Chefe" com mais vida e ataque. O clone é profundo:
os atributos de cada personagem são copiados também, então alterar a cópia não
afeta o modelo original.

## Conteúdo do repositório

- Código-fonte das classes `Personagem`, `Atributos` e a `Main` de demonstração
- Casos de teste JUnit verificando a cópia profunda e a independência entre modelo e clone
- Diagrama UML do padrão
