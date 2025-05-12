
public class ArvoreBinaria {

    private No raiz;

    public ArvoreBinaria() {
    	raiz = new No(' ');
    }
 
    public void inserir(String codigoMorse, char caracter ) {
        No atual = raiz;
        for (int i = 0; i < codigoMorse.length(); i++) {
            char simbolo = codigoMorse.charAt(i);
            if (simbolo == '.') {
                if (atual.esquerda == null) 
                	atual.esquerda = new No(' ');
                atual = atual.esquerda;
            } else if (simbolo == '-') {
                if (atual.direita == null) 
                	atual.direita = new No(' ');
                atual = atual.direita;
            }
        }
        atual.dado = caracter;
    }
    
    public String buscar(String codigoMorse) {
    	
    	String codigos[] = codigoMorse.split(" ");
    	String saida = "";
    	for( String str : codigos ) {
            No atual = raiz;
    		for(int i = 0; i < str.length(); i++ ) {
    			char simbolo = str.charAt(i);
                if (simbolo == '.') {
                    atual = atual.esquerda;
                } else if (simbolo == '-') {
                	atual = atual.direita;
                } else {
                	atual = null;
                	break;
                }
    		}
    		if( atual == null ) {
    			return "ERRO: Simbolo não reconhecido";
    		} else {
    			saida += atual.dado;
    		}
    	}
    	return saida;
    }
}