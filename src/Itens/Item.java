package Itens;

import Entidades.Entidade;

public abstract class Item {

    // ATRIBUTOS GENÉRICOS DOS ITENS
    protected String nomeItem;
    protected int qtdItem;

    public Item() {
        this("", 0);
    }

    public Item(String nomeItem, int qtdItem) {
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
    }

    public abstract void usar(Entidade alvo);

    public void diminuirQtdItem() {
        this.qtdItem--;
    }
    public void aumentarQtdItem(int qtdParaAumentar) {
        this.qtdItem = this.qtdItem + qtdParaAumentar;
    }

    public String getNomeItem() { return this.nomeItem; }
    public int getQtdItem() { return this.qtdItem; }


}
