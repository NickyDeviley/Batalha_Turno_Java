package Entidades.Jogador;

import Entidades.Entidade;
import Itens.Armas.Arma;
import Itens.Armas.Espada;

public final class Jogador extends Entidade {

    // OBJETOS DO JOGADOR
    private Inventario inventJogador;
    private Arma espada;

    // ATRIBUTOS DO JOGADOR
    private int str;    // Força
    private int dex;    // Destreza
    private int sab;    // Sabedoria

    public Jogador() {
        this("", 0, 0, 0, 0);
    }

    public Jogador(String nomeJogador, int vidaMax, int str, int dex, int sab) {
        super(nomeJogador, vidaMax, 10);

        this.inventJogador = new Inventario();

        this.espada = new Espada();

        this.str = str;
        this.dex = dex;
        this.sab = sab;
    }

    @Override
    public int atacar(int resultadoDado) {
        int dano = this.espada.getDanoArma() + resultadoDado;
        return dano;
    }

    public boolean intimidar(int resultadoDado, int inimigoCA) {
        boolean estaIntimidando = ((resultadoDado + this.str) / 2 > inimigoCA) ? true : false;
        return estaIntimidando;
    }

    public boolean abrirInventario() {
        if (this.inventJogador.verificaInventarioVazio()) {
            System.out.println("O inventário está vazio");
            return false;
        }
        this.inventJogador.imprimirItensInventario();
        return true;
    }

    public void mexerInventario(int escolha) {

    }

    public short fugir(int resultadoDado, int inimigoCA) {

        /*
             0 -> falha
             1 -> sucesso
        */

        short resultado = (resultadoDado + dex > inimigoCA) ? (short) 1 : 0;

        return resultado;

    }

}
