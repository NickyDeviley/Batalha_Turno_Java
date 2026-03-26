package Principal;

public class GerenciadorDialogos {

    private static String mensagemInicial = "Você encontra um Goblin, o que você faz?";
    private static String[] opcoes = {"(1) Atacar", "(2) Intimidar", "(3) Abrir Inventario", "(4) Fugir"};
    private static String[] opcoesInventario = {"(1) Usar Item", "(2) Jogar Item Fora"};
    private static String[] finais = {"Você venceu!", "Você perdeu!"};

    public static void imprimirMensagemIncial() {
        System.out.println(mensagemInicial);
    }

    public static void imprimirOpcoes() {
        System.out.print("\n");
        for (String n : opcoes) {
            System.out.print(n + "\n");
        }
    }

    public static void imprimirOpcoesInventario() {
        for (String n : opcoesInventario) {
            System.out.println(n);
        }
    }

    public static void jogarItemFora() {
        System.out.println("Jogou o item fora!");
    }

    public static void imprimirAtaque(boolean verificaAcerto, int dano) {

        if (verificaAcerto) {
            System.out.println("Você acertou o ataque!");
            System.out.print("Causou: " + dano + " de Dano!");
        }
        else {
            System.out.println("Você errou o ataque!");
        }

    }

    public static void imprimirIntimidacao(boolean estaIntimidando) {

        if (estaIntimidando) {
            System.out.println("Você intimidou o goblin!");
            System.out.println("\n" + finais[0]);
        }
        else {
            System.out.println("Você não intimidou o goblin!");
            System.out.println("\n" + "O combate Continua.");
        }
    }

    public static void fuga(int verificaFuga) {

        if (verificaFuga == -1) {
            System.out.println("Você correu do goblin, mas foi pego por um troll. Ele esmagou sua cabeça com uma mordida!");
            System.out.println("\n" + finais[1]);
        }
        if (verificaFuga == 0) {
            System.out.println("Você não conseguiu fugir! O goblin logo te alcança.");
        }
        if (verificaFuga == 1) {
            System.out.println("Você conseguiu fugir do goblin!");
            System.out.println("\n" + finais[0]);
        }


    }

}
