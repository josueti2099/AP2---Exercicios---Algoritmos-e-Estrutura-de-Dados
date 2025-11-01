public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        pilha.mostrar();

        pilha.desempilhar();
        pilha.mostrar();

        pilha.desempilhar();
        pilha.desempilhar();

        // Tentando desempilhar com a pilha vazia
        pilha.desempilhar();
    }
}
