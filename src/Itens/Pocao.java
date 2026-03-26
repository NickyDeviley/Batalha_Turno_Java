package Itens;

import Entidades.Entidade;

public final class Pocao extends Item {

    private Efeito efeito;
    private int qtdCura;

    public Pocao() {

        super("Poção de Cura", 5);
        this.efeito = Efeito.CURA;
        this.qtdCura = 10;

    }

    @Override
    public void usar(Entidade alvo) {
        if (this.efeito == Efeito.CURA) {
            alvo.receberCura(this.qtdCura);
        }
    }

    public Efeito getEfeito() {
        return this.efeito;
    }


}
