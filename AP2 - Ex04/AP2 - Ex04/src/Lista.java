public class Lista {
    private int[] elementos = new int[5];
    private int tamanho = 0;

    public void inserir(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("A lista está cheia!");
        }
    }

    // Exibe o estado atual da lista
    public void mostrar() {
        System.out.println("\n=== ESTADO ATUAL DA LISTA ===");
        System.out.print("Elementos: ");
        if (tamanho == 0) {
            System.out.println("vazia");
        } else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
        System.out.println("Tamanho atual: " + tamanho);
        System.out.println("Capacidade máxima: " + elementos.length);
    }
}
