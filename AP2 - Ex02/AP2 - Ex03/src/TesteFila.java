public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        fila.mostrar();

        fila.desenfileirar();
        fila.mostrar();

        fila.enfileirar(40);
        fila.enfileirar(50);
        fila.enfileirar(60); // deve mostrar mensagem de fila cheia
        fila.mostrar();

        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();
    }
}
