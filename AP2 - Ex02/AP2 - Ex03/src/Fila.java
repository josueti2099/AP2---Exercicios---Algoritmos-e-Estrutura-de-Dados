public class Fila {
    private int[] elementos = new int[5]; // capacidade fixa
    private int inicio = 0; // índice do primeiro elemento
    private int fim = 0;    // índice onde o próximo elemento será inserido
    private int tamanho = 0; // quantidade atual de elementos

    // Método para enfileirar (inserir no final)
    public void enfileirar(int valor) {
        if (tamanho < elementos.length) {
            elementos[fim] = valor;
            fim = (fim + 1) % elementos.length; // avanço circular
            tamanho++;
            System.out.println("Enfileirado: " + valor);
        } else {
            System.out.println("A fila está cheia! Não é possível enfileirar mais elementos.");
        }
    }

    // Método para desenfileirar (remover do início)
    public int desenfileirar() {
        if (tamanho > 0) {
            int valor = elementos[inicio];
            inicio = (inicio + 1) % elementos.length; // avanço circular
            tamanho--;
            System.out.println("Desenfileirado: " + valor);
            return valor;
        } else {
            System.out.println("A fila está vazia! Nada para desenfileirar.");
            return -1; // valor simbólico
        }
    }

    // Método opcional para mostrar o conteúdo atual da fila
    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.print("Conteúdo da fila: ");
            for (int i = 0; i < tamanho; i++) {
                int indice = (inicio + i) % elementos.length;
                System.out.print(elementos[indice] + " ");
            }
            System.out.println();
        }
    }
}
