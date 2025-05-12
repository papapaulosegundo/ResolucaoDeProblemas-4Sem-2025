package PrimeiraAtividadePilhaFila.Fila;;

public class Main {
 
    public static void main(String[] args) {
        Fila fila = new Fila(3);
        fila.insere(10);
        fila.imprime();
        fila.insere(20);
        fila.imprime();
        fila.insere(5);
        fila.imprime();
        fila.insere(25);
        fila.imprime();
        fila.remove();
        fila.imprime();
        fila.remove();
        fila.imprime();
        fila.insere(25);
        fila.remove();
        fila.imprime();
        fila.remove();
        fila.imprime();
        fila.remove();
        fila.imprime();
        fila.remove();
        fila.imprime();
    }
}
