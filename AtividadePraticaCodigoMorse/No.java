public class No {

    char dado;
    No esquerda;
    No direita;

    public No(char dado) {
        this.dado = dado;
        esquerda = null;
        direita = null;
    } 
    
    public char getDado() {
    	return dado;
    }
    
    public No getEsquerda() {
    	return esquerda;
    }
    
    public No getDireita() {
    	return direita;
    }
    
    void setDado(char dado) {
    	this.dado = dado;
    }
    
    void setEsquerda(No esquerda) {
    	this.esquerda = esquerda;
    }
    
    void setDireita(No direita) {
    	this.direita = direita;
    }
}