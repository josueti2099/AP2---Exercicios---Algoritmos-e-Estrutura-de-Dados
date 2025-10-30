import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        int opcaoPrincipal;
        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Testar Lista");
            System.out.println("2 - Testar Pilha");
            System.out.println("3 - Testar Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoPrincipal = sc.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    menuLista(sc, lista);
                    break;
                case 2:
                    menuPilha(sc, pilha);
                    break;
                case 3:
                    menuFila(sc, fila);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcaoPrincipal != 0);

        sc.close();
    }

    // ---------------- MENU DA LISTA ----------------
    private static void menuLista(Scanner sc, Lista lista) {
        int opcao;
        do {
            System.out.println("\n=== MENU LISTA ===");
            System.out.println("1 - Inserir valor");
            System.out.println("2 - Mostrar lista");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    int valorLista = sc.nextInt();
                    lista.inserir(valorLista);
                    break;
                case 2:
                    lista.mostrar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // ---------------- MENU DA PILHA ----------------
    private static void menuPilha(Scanner sc, Pilha pilha) {
        int opcao;
        do {
            System.out.println("\n=== MENU PILHA ===");
            System.out.println("1 - Empilhar valor");
            System.out.println("2 - Desempilhar valor");
            System.out.println("3 - Mostrar pilha");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    int valorPilha = sc.nextInt();
                    pilha.empilhar(valorPilha);
                    break;
                case 2:
                    pilha.desempilhar();
                    break;
                case 3:
                    pilha.mostrar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // ---------------- MENU DA FILA ----------------
    private static void menuFila(Scanner sc, Fila fila) {
        int opcao;
        do {
            System.out.println("\n=== MENU FILA ===");
            System.out.println("1 - Enfileirar valor");
            System.out.println("2 - Desenfileirar valor");
            System.out.println("3 - Mostrar fila");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    int valorFila = sc.nextInt();
                    fila.enfileirar(valorFila);
                    break;
                case 2:
                    fila.desenfileirar();
                    break;
                case 3:
                    fila.mostrar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
