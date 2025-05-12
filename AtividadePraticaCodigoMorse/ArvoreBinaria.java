
public class ArvoreBinaria {

    private NoArvore raiz;

    public ArvoreBinaria() {
    	raiz = new NoArvore(' ');
    }
 
    public void inserir(String codigoMorse, char caracter ) {
        NoArvore atual = raiz;
        for (int i = 0; i < codigoMorse.length(); i++) {
            char simbolo = codigoMorse.charAt(i);
            System.out.println("Inserindo simbolo " + simbolo);
            if (simbolo == '.') {
                if (atual.getEsquerda() == null) {
                	atual.setEsquerda(new NoArvore(' '));
                }
                atual = atual.getEsquerda();
            } else if (simbolo == '-') {
                if (atual.getDireita() == null) {
                	atual.setDireita(new NoArvore(' '));
                }
                atual = atual.getDireita();
            } else {
            	System.out.println("ERRO: S�mbolo inv�lido " + simbolo);
            	return;
            }
        }
        System.out.println("Inserindo caracter " + caracter);
        atual.setDado(caracter);
    }
    
    public String buscar(String codigoMorse) {
    	
    	String codigos[] = codigoMorse.split(" ");
    	String saida = "";
    	for( String str : codigos ) {
            NoArvore atual = raiz;
    		for(int i = 0; i < str.length(); i++ ) {
    			char simbolo = str.charAt(i);
                if (simbolo == '.') {
                    atual = atual.getEsquerda();
                } else if (simbolo == '-') {
                	atual = atual.getDireita();
                } else {
                	atual = null;
                	break;
                }
    		}
    		if( atual == null ) {
    			return "ERRO: Simbolo n�o reconhecido";
    		} else {
    			saida += atual.getDado();
    		}
    	}
    	return saida;
    }
    
    public void imprimir() {
    	System.out.println("raiz");
    	imprimir(raiz, "", "raiz");
    }
    private void imprimir(NoArvore no, String recuo, String simbolo) {
        if (no != null) {
        	if( no.getDado() > ' ')
        		System.out.println(recuo + simbolo + " (" + no.getDado() + ")");
            imprimir(no.getEsquerda(), recuo + "  ", ".");
            imprimir(no.getDireita(), recuo + "  ", "-");
        }
    }
    
    public String obterCodigoMorse(char letra) {
        letra = Character.toUpperCase(letra);
        return buscarCodigo(raiz, letra, "");
    }

    private String buscarCodigo(NoArvore no, char letra, String caminho) {
        if (no == null) {
            return null;
        }
        if (no.getDado() == letra) {
            return caminho;
        }

        // tenta � esquerda (ponto)
        String resultadoEsquerda = buscarCodigo(no.getEsquerda(), letra, caminho + ".");
        if (resultadoEsquerda != null) {
            return resultadoEsquerda;
        }

        // tenta � direita (tra�o)
        String resultadoDireita = buscarCodigo(no.getDireita(), letra, caminho + "-");
        return resultadoDireita;
    }


}