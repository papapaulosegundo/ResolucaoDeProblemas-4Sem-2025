
public class NoArvore {

    private char dado;
    private NoArvore esquerda;
    private NoArvore direita;

    public NoArvore(char dado) {
        this.dado = dado;
        esquerda = null;
        direita = null;
    } 
    
    public char getDado() {
    	return dado;
    }
    
    public NoArvore getEsquerda() {
    	return esquerda;
    }
    
    public NoArvore getDireita() {
    	return direita;
    }
    
    void setDado(char dado) {
    	this.dado = dado;
    }
    
    void setEsquerda(NoArvore esquerda) {
    	this.esquerda = esquerda;
    }
    
    void setDireita(NoArvore direita) {
    	this.direita = direita;
    }
}