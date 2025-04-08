public class Merge {

    public Fila merge(Fila A, Fila B ) {
        Fila nova = new Fila();

        while( !A.vazia() && !B.vazia() ) {
            if( A.consultar() < B.consultar() ) {
                nova.inserir(A.remover());
            } else {
                nova.inserir(B.remover());
            }
        } 

        while ( !A.vazia() ) {
            nova.inserir(A.remover());
        }
        while( !B.vazia() ) {
            nova.inserir(B.remover());
        }
        return nova;
    }
}
