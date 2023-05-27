package application;
import java.util.Scanner;

public class startGame {
    public static void main(String[] args) {
        exibirTelaInicial();
        iniciarJogo();
    }

    public static void exibirTelaInicial() {
    	Scanner sc = new Scanner(System.in);
        String opcao = sc.nextLine();
        
        System.out.println("===== JOGO DE XADREZ =====");
        System.out.println("Bem-vindo(a) ao jogo de xadrez!");
        System.out.println("Clique em Start para iniciar o jogo.");
        System.out.println("==========================");
        System.out.print("Opção: ");

        if (opcao.equalsIgnoreCase("start")) {
            System.out.println("Iniciando o jogo...");
        } else {
            System.out.println("Opção inválida. O jogo será encerrado.");
            System.exit(0);
        }
        sc.close();
    }

    public static void iniciarJogo() {
        
    }
}
