public class Pilha {
    private Lista lista;

    public Pilha() {
        lista = new Lista();
    }

    public void inserir(int dado) {
        lista.inserir(dado);
    }

    public int remover() {
        if( lista.vazia() ) {
            System.out.println("Pilha vazia!");
            return -1;
        } else {
            return lista.remover();
        }
    }

    public void listar() {
        lista.listar();
    }
}
