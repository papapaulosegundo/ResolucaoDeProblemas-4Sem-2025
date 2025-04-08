public class FilaV {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int capacidade;
    private int itens;

    public FilaV(int capacidade) {
        dados = new int[capacidade];
        this.capacidade = capacidade;
        itens = 0;
        primeiro = 0;
        ultimo = -1;
    }
    public FilaV() {
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

    public void inserir(int elemento) {
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

    public int consultar() {
        if( vazia() ) {
            return -1;
        } else {
            return dados[primeiro];
        }
    }

    public int remover() {
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

    public void listar() {
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
