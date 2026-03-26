package Entidades.Jogador;

import Itens.Item;
import Itens.Pocao;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Item> inventario;

    // Construtor
    public Inventario() {
        inventario = new ArrayList<>();
        inventario.add(0, new Pocao());
    }

    public void jogarItemFora(int ID) {
        inventario.get(ID).diminuirQtdItem();
    }

    public void imprimirItensInventario() {
        for (Item n : inventario) {
            System.out.println(n.getNomeItem());
        }
    }

    public boolean verificaInventarioVazio() {
        return this.inventario.isEmpty();
    }

    private void diminuirQtdItem(int ID) {
        this.inventario.get(ID).diminuirQtdItem();
        esvaziaInventario();
    }
    private void aumentarQtdItem(int ID, int qtdParaAumentar) {
        this.inventario.get(ID).aumentarQtdItem(qtdParaAumentar);
    }

    private void esvaziaInventario() {

        int qtdItensInventario = 0;

        for (Item n : inventario) {
            qtdItensInventario = n.getQtdItem();
        }

        if (qtdItensInventario == 0) {
            this.inventario.clear();
        }

    }


}
