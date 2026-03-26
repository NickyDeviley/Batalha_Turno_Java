package Principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nDigite o nome do seu personagem?");
        String nomeJogador = sc.next();

        GerenciadorBatalha batalha = new GerenciadorBatalha(nomeJogador, sc);

        sc.close();

    }

}
