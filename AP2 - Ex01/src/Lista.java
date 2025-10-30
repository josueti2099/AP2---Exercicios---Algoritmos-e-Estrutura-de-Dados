public class Lista {
    // Vetor para armazenar até 5 números inteiros
    private int[] elementos = new int[5];
    private int tamanho = 0; // controla quantos elementos já foram inseridos

    // Método para inserir um novo valor na lista
    public void inserir(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("A lista está cheia! Não é possível inserir mais elementos.");
        }
    }

    // Método para mostrar os elementos da lista
    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.print("Elementos da lista: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println(); // quebra de linha no final
        }
    }
}
