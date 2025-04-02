package Desenvolvimento.Pilha;

public class Main {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(5);

        pilha.insere(10);
        pilha.imprime();
        pilha.insere(5);
        pilha.imprime();
        pilha.insere(3);
        pilha.imprime();

        pilha.remove();
        pilha.imprime();
        pilha.remove();
        pilha.imprime();
        pilha.remove();
        pilha.imprime();
    }
    
}
