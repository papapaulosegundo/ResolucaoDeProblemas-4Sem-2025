package Desenvolvimento.Pilha;

public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        dados = new int[capacidade];
        topo = -1;
    }
    public Pilha() {
        this(10);
    }

    public boolean cheia() {
        if( topo == capacidade - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean vazia() {
        if(  topo == -1 ) {
            return true;
        } else {
            return false;
        }
    }

    public void insere(int elemento) {
        if( !cheia() ) {
            topo++;
            dados[topo] = elemento;
        }
    }

    public int remove() {
        if( !vazia() ) {
            return dados[topo--];
        }
        return -1;
    }

    public void imprime() {
        for( int i = 0; i <= topo; i++ ) {
            System.out.print(dados[i]+"\t");
        }
        System.out.println();
    }
}