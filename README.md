# Turn-Based Combat System (RPG Engine)

Este projeto é um simulador de combate em turnos desenvolvido em Java. O objetivo principal foi consolidar conhecimentos em Lógica de Programação Avançada e aplicar os princípios SOLID, focando em extensibilidade e organização de código através da Programação Orientada a Objetos (POO).
# 🚀 Tecnologias e Ferramentas

    Linguagem: Java 17+

    IDE: IntelliJ IDEA

    Paradigma: Orientação a Objetos (Herança, Polimorfismo e Abstração)

# 🛠️ Arquitetura e Design

O projeto foi estruturado para separar as responsabilidades de cada componente, facilitando a manutenção e a adição de novos conteúdos (itens, inimigos e armas).
1. Sistema de Entidades

Utilizei Classes Abstratas (Entidade) e Métodos Abstratos para garantir que qualquer personagem (Jogador ou Goblin) possua comportamentos base, como atacar e receberDano, mas com implementações específicas para cada tipo.

    Polimorfismo: O método atacar(int resultadoDado) é sobrescrito nas subclasses para calcular o dano de formas distintas.

2. Gestão de Itens e Inventário

Implementei um sistema de itens genéricos usando a classe abstrata Item, permitindo a criação de consumíveis como a Pocao. O inventário utiliza coleções (ArrayList) para gerenciar dinamicamente os recursos do jogador durante o combate.
3. Mecânicas de Jogo (Game Design)

    Sistema de Dados: Uma classe utilitária Dados centraliza a geração de números aleatórios (D6, D12, D24), simulando a aleatoriedade de sistemas de RPG de mesa.

    Cálculos de Atributos: O sucesso de ações como "Fugir" ou "Intimidar" depende de cálculos que envolvem os atributos do jogador (Força, Destreza) contra a CA (Classe de Armadura) do inimigo.

# 🧠 Princípios SOLID Aplicados

    Single Responsibility Principle (SRP): Classes como GerenciadorDialogos e GerenciadorBatalha possuem responsabilidades únicas (I/O de texto e lógica de fluxo, respectivamente).

    Open/Closed Principle: O sistema de itens e armas está aberto para expansão (podemos criar EspadaLonga ou Machado) sem modificar o código base da classe Jogador.

# 🎮 Como Jogar

    Clone o repositório.

    Abra o projeto no IntelliJ IDEA.

    Execute a classe Main.

    Siga as instruções no console para escolher suas ações:

        (1) Atacar: Tenta causar dano baseado no dado + arma.

        (2) Intimidar: Tenta vencer o inimigo pelo medo usando sua Força.

        (3) Abrir Inventário: Usa itens de cura ou utilitários.

        (4) Fugir: Tenta escapar do combate (com riscos!).
