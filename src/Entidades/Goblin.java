package Entidades;

public final class Goblin extends Entidade{

    public Goblin() {
        super("Goblin", 30, 6);
    }

    @Override
    public int atacar(int resultadoDado) {

        int dano = 5 + resultadoDado;

        return dano;
    }

    public int inteligenciaArtificial() {

        return 0;
    }

}
