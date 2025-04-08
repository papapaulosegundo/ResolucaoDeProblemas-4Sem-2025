public class Fila {
    private Lista lista;

    public Fila() {
        lista = new Lista();
    }

    public void inserir(int dado) {
        lista.inserir(dado);
    }

    public int remover() {
        if( lista.vazia() ) {
            System.out.println("Fila vazia!");
            return -1;
        } else {
            return lista.removerInicio();
        }
    }

    public int consultar() {
        return lista.consultarInicio();
    }

    public void listar() {
        lista.listar();
    }

    public boolean vazia() {
        return lista.vazia();
    }
    
}
