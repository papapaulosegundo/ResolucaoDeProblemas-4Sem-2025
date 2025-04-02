package Desenvolvimento.Fila;

public class Fila {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int capacidade;
    private int itens;

    public Fila(int capacidade) {
        dados = new int[capacidade];
        this.capacidade = capacidade;
        itens = 0;
        primeiro = 0;
        ultimo = -1;
    }
    public Fila() {
        this(10);
    }

    public boolean cheia() {
        if( itens == capacidade ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean vazia() {
        if( itens == 0 ) {
            return true;
        } else {
            return false;
        }
    }

    public void insere(int elemento) {
        if( cheia() ) {
            System.out.println("Fila cheia!");
        } else {
            ultimo++;
            if( ultimo == capacidade ) 
                ultimo = 0;
            dados[ultimo] = elemento;
            itens++;
        }
    }

    public int remove() {
        if( vazia() ) {
            System.out.println("Fila vazia!");
            return -1;
        } else {
            int ret = dados[primeiro];
            primeiro++;
            if( primeiro == capacidade ) 
                primeiro = 0;
            itens--;
            return ret;
        }
    }

    public void imprime() {
        int pos = primeiro;
        for( int i = 1; i <= itens; i++ ) {
            System.out.print(dados[pos]+"\t");
            pos++;
            if( pos == capacidade ) {
                pos = 0;
            }
        }
        System.out.println();
    }
}
