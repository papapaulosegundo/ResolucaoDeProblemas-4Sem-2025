public class Lista {
    private No inicio;

    public Lista() {
        inicio = null;
    }

    // inserir no final
    public void inserir(int dado) {
        No novo = new No(dado);
        if( inicio == null ) {
            inicio = novo;
        } else {
            No temp = inicio;
            while( temp.getProx() != null ) {
                temp = temp.getProx();
            } 
            temp.setProx(novo);
        }
    }

    // remover do final
    public int remover() {
        // lista vazia
        if( inicio == null) {
            System.out.println("Lista vazia");
            return -1;
        }
        // elemento unico
        if( inicio.getProx() == null ) {
            int retorno = inicio.getDado();
            inicio = null;
            return retorno;
        }
        // mais elementos
        No penultimo = inicio;
        No temp = inicio.getProx();
        while( temp.getProx() != null ) {
            penultimo = temp;
            temp = temp.getProx();
        }
        int retorno = temp.getDado();
        penultimo.setProx(null);
        return retorno;
    }

    // remover do inicio
    public int removerInicio() {
        if( inicio == null ) {
            System.out.println("Lista vazia");
            return -1;
        }
        int retorno = inicio.getDado();
        inicio = inicio.getProx();
        return retorno;
    }

    // consultar dado do inicio
    public int consultarInicio() {
        if( inicio == null ) {
            return -1;
        } else {
            return inicio.getDado();
        }
    }

    public void listar() {
        System.out.print("[ ");
        No temp = inicio;
        while( temp != null ) {
            System.out.print(temp.getDado() + " ");
            temp = temp.getProx();
        }
        System.out.println("]");
    }

    public boolean vazia() {
        return inicio == null;
    }

}