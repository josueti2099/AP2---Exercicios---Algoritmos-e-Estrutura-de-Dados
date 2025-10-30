public class Pilha {
    private int[] elementos = new int[5];
    private int topo = -1;

    public void empilhar(int valor) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo] = valor;
            System.out.println("Empilhado: " + valor);
        } else {
            System.out.println("A pilha está cheia!");
        }
    }

    public int desempilhar() {
        if (topo >= 0) {
            int valor = elementos[topo];
            topo--;
            System.out.println("Desempilhado: " + valor);
            return valor;
        } else {
            System.out.println("A pilha está vazia!");
            return -1;
        }
    }

    // Exibe o estado atual da pilha
    public void mostrar() {
        System.out.println("\n=== ESTADO ATUAL DA PILHA ===");
        System.out.print("Elementos (base → topo): ");
        if (topo == -1) {
            System.out.println("vazia");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
        System.out.println("Topo: " + topo);
        System.out.println("Tamanho atual: " + (topo + 1));
        System.out.println("Capacidade máxima: " + elementos.length);
    }
}
