package Principal;

import Entidades.Entidade;
import Entidades.Goblin;
import Entidades.Jogador.Jogador;
import Utilidades.Dados;

import java.util.Scanner;

public class GerenciadorBatalha {

    // DECLARANDO OS OBJETOS E VARIÁVEIS
    private Jogador player;
    private Goblin goblin;
    private Dados dado;

    private Scanner sc;

    // VARIÁVEL QUE MANTÉM O LOOP
    private boolean combateContinua = true;

    // CONSTRUTOR
    public GerenciadorBatalha(String nomeJogador, Scanner sc) {

        // INSTANCIANDO OS OBJETOS
        this.player = new Jogador(nomeJogador, 50, 10, 4, 1);
        this.goblin = new Goblin();
        this.dado = new Dados();

        this.sc = sc;

        // COMEÇA A BATALHA
        batalha();
    }

    public void batalha() {

        int escolhaJogador = 0;

        //sc.next();

        GerenciadorDialogos.imprimirMensagemIncial();
        System.out.println("\n");

        // LOOP DO JOGO
        while(combateContinua) {

            // VEZ DO JOGADOR
            System.out.println("Turno do jogador!\n");
            GerenciadorDialogos.imprimirOpcoes();

            do {
                escolhaJogador = sc.nextInt();
            } while(escolhaJogador < 1 || escolhaJogador > 4);

            gerenciarEscolhaJogador(escolhaJogador);

            // VERIFICA SE AMBOS CONTINUAM VIVOS
            verificaJogadores();

            // VEZ DO INIMIGO
            this.gerenciarEscolhaInimigo();


            // VERIFICA SE AMBOS CONTINUAM VIVOS
            verificaJogadores();

        }
    }

    private void gerenciarEscolhaInimigo() {

        int resultadoDado = this.dado.jogarDadoVinteQuatro();
        int escolha = this.goblin.inteligenciaArtificial();

        switch(escolha) {
            case 0:

                if (resultadoDado > this.player.getEntidadeCA()) {
                    int dano = this.goblin.atacar(resultadoDado);
                    this.player.receberDano(dano);
                }
                else {
                    System.out.println("O Goblin errou o ataque!");
                }

                break;
            default:
                break;
        }

    }

    private void gerenciarEscolhaJogador(int escolha) {

        int resultadoDado = dado.jogarDadoVinteQuatro();

        switch(escolha) {
            case 1:

                int dano = this.player.atacar(resultadoDado);
                boolean verificaAcerto = resultadoDado > goblin.getEntidadeCA();

                if (verificaAcerto) {
                    this.goblin.receberDano(dano);
                    GerenciadorDialogos.imprimirAtaque(verificaAcerto, dano);
                }
                else {
                    GerenciadorDialogos.imprimirAtaque(verificaAcerto, dano);
                }

                break;
            case 2:

                boolean estaIntimidando = this.player.intimidar(resultadoDado, goblin.getEntidadeCA());
                GerenciadorDialogos.imprimirIntimidacao(estaIntimidando);

                break;
            case 3:

                boolean abriuInventario = this.player.abrirInventario();

                if (abriuInventario) {
                    GerenciadorDialogos.imprimirOpcoesInventario();
                    escolha = sc.nextInt();
                }
                this.player.mexerInventario(escolha);

                break;
            case 4:

                if (resultadoDado == 1) {
                    GerenciadorDialogos.fuga(-1);
                    this.finalizarCombate();
                    break;
                }

                short verificaFuga = this.player.fugir(resultadoDado, goblin.getEntidadeCA());
                GerenciadorDialogos.fuga(verificaFuga);

                if (verificaFuga == 1) {
                    this.finalizarCombate();
                }

                break;
            default:
                break;
        }

    }

    private void verificaJogadores() {

        if (!this.player.getEstaVivo() || !this.goblin.getEstaVivo()) {

            if (this.player.getEstaVivo()) {
                // VITÓRIA
                finalizarCombate();
            }
            else {
                // DERROTA
                finalizarCombate();
            }
            combateContinua = false;
        }

    }

    public void finalizarCombate() {
        this.sc.close();
    }
}
