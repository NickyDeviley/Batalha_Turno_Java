package Entidades;

public abstract class Entidade {

    // ATRIBUTOS
    protected String nomeEntidade;
    protected int vidaMax;
    protected int vidaAtual;
    protected boolean estaVivo;
    protected int entidadeCA;

    // CONSTRUTORES
    public Entidade() {
        this("", 0, 0);
    }

    public Entidade(String nomeEntidade, int vidaMax, int entidadeCA) {
        this.nomeEntidade = nomeEntidade;
        this.vidaMax = vidaMax;
        this.vidaAtual = vidaMax;
        this.estaVivo = true;
        this.entidadeCA = entidadeCA;
    }

    public void receberDano(int danoRecebido) {
        this.vidaAtual = this.vidaAtual - danoRecebido;
        if (vidaAtual <= 0) {
            mataJogador();
        }
    }

    public void receberCura(int curaRecebida) {
        this.vidaAtual = this.vidaAtual + curaRecebida;
        if (this.vidaAtual > this.vidaMax)
            this.vidaAtual = vidaMax;
    }

    public void mataJogador() {
        this.estaVivo = false;
    }

    // MÉTODOS ABSTRATAS
    public abstract int atacar(int resultadoDado);

    // GETTERS & SETTERS
    public String getNomeEntidade() { return this.nomeEntidade; }
    public int getVidaMax() { return this.vidaMax; }
    public int getVidaAtual() { return this.vidaAtual; }
    public Boolean getEstaVivo() { return this.estaVivo; }
    public int getEntidadeCA() { return this.entidadeCA; }
}
