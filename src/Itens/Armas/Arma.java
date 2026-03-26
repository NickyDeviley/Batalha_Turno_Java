package Itens.Armas;

public abstract class Arma {

    protected String nomeArma;
    //protected int pesoArma;
    protected String descricaoArma;
    protected int danoArma;

    public Arma() {

        this("", "", 0);

    }

    public Arma(String nomeArma, String descricaoArma, int danoArma) {

        this.nomeArma = nomeArma;
        this.descricaoArma = descricaoArma;
        this.danoArma = danoArma;

    }

    public String getNomeArma() { return this.nomeArma; }
    public String getDescricaoArma() { return this.descricaoArma; }
    public int getDanoArma() { return this.danoArma; }

}
