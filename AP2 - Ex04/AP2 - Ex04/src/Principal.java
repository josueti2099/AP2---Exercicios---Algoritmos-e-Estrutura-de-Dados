public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        lista.inserir(10);
        lista.inserir(20);
        lista.mostrar();

        pilha.empilhar(5);
        pilha.empilhar(15);
        pilha.mostrar();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.desenfileirar();
        fila.mostrar();
    }
}
