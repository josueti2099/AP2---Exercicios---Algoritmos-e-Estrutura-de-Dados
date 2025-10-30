public class Fila {
    private int[] elementos = new int[5];
    private int inicio = 0;
    private int fim = 0;
    private int tamanho = 0;

    public void enfileirar(int valor) {
        if (tamanho < elementos.length) {
            elementos[fim] = valor;
            fim = (fim + 1) % elementos.length;
            tamanho++;
            System.out.println("Enfileirado: " + valor);
        } else {
            System.out.println("A fila está cheia!");
        }
    }

    public int desenfileirar() {
        if (tamanho > 0) {
            int valor = elementos[inicio];
            inicio = (inicio + 1) % elementos.length;
            tamanho--;
            System.out.println("Desenfileirado: " + valor);
            return valor;
        } else {
            System.out.println("A fila está vazia!");
            return -1;
        }
    }

    // Exibe o estado atual da fila
    public void mostrar() {
        System.out.println("\n=== ESTADO ATUAL DA FILA ===");
        System.out.print("Elementos (início → fim): ");
        if (tamanho == 0) {
            System.out.println("vazia");
        } else {
            for (int i = 0; i < tamanho; i++) {
                int indice = (inicio + i) % elementos.length;
                System.out.print(elementos[indice] + " ");
            }
            System.out.println();
        }
        System.out.println("Início: " + inicio);
        System.out.println("Fim: " + fim);
        System.out.println("Tamanho atual: " + tamanho);
        System.out.println("Capacidade máxima: " + elementos.length);
    }
}
