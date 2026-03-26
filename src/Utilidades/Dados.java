package Utilidades;

import java.util.Random;

public class Dados {

    // ATRIBUTOS DA CLASSE
    private Random numAleatorio;
    private int resultado;

    // CONSTRUTOR
    public Dados() {
        numAleatorio = new Random();
    }

    // Resultados entre 1 & 24
    public int jogarDadoVinteQuatro() {
        this.resultado = numAleatorio.nextInt(0, 24) + 1;
        return this.resultado;
    }

    // Resultados entre 1 & 12
    public int jogarDadoDoze() {
        this.resultado = numAleatorio.nextInt(0, 12) + 1;
        return this.resultado;
    }

    // Resultados entre 1 & 6
    public int jogarDadoSeis() {
        this.resultado = numAleatorio.nextInt(0, 6) + 1;
        return this.resultado;
    }

    // Resultados entre 1 & 2
    public int caraCoroa() {
        this.resultado = numAleatorio.nextInt(2) + 1;
        return this.resultado;
    }

}
