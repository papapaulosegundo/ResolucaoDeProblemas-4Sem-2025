public class No {
    private int dado;
    private No prox;

    public No(int dado) {
        this.dado = dado;
        this.prox = null;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }
    public void setProx(No prox) {
        this.prox = prox;
    }
    public int getDado() {
        return dado;
    }
    public No getProx() {
        return prox;
    }

}
 