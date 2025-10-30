public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);

        lista.mostrar();

        // Tentando inserir mais um elemento (lista cheia)
        lista.inserir(60);
    }
}
