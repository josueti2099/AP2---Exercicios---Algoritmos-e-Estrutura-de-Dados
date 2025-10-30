public class Pilha {
    private int[] elementos = new int[5]; // capacidade fixa de 5 elementos
    private int topo = -1; // -1 indica que a pilha está vazia

    // Método para empilhar (inserir)
    public void empilhar(int valor) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo] = valor;
            System.out.println("Empilhado: " + valor);
        } else {
            System.out.println("A pilha está cheia! Não é possível empilhar mais elementos.");
        }
    }

    // Método para desempilhar (remover o elemento do topo)
    public int desempilhar() {
        if (topo >= 0) {
            int valor = elementos[topo];
            topo--;
            System.out.println("Desempilhado: " + valor);
            return valor;
        } else {
            System.out.println("A pilha está vazia! Nada para desempilhar.");
            return -1; // valor simbólico para indicar erro
        }
    }

    // Método opcional para mostrar o conteúdo da pilha
    public void mostrar() {
        if (topo == -1) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.print("Conteúdo da pilha: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}
