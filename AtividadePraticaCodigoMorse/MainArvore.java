
public class MainArvore {

    public static void main(String[] args) {
    	
    	ArvoreBinaria arvore = new ArvoreBinaria();
    	
        // Arrays paralelos com letras e seus c�digos
        char[] caracter = {
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
            'O','P','Q','R','S','T','U','V','W','X','Y','Z',
            '0','1','2','3','4','5','6','7','8','9'
        };

        String[] codigoMorse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--..",
            "-----",".----","..---","...--","....-",".....","-....","--...","---..","----."
        };
        
        for (int i = 0 ; i < caracter.length ; i++) {
            arvore.inserir(codigoMorse[i], caracter[i]);
        }
        
        // Busca codigos de cada caracter
        for( int i = 0; i < caracter.length; i++ ) {
            System.out.println(caracter[i] + ": " + arvore.obterCodigoMorse(caracter[i]));        	
        }

        // busca o caracter de cada codigo;
        for( int i = 0; i < codigoMorse.length; i++ ) {
            System.out.println(codigoMorse[i] + ": " + arvore.buscar(codigoMorse[i]));        	
        }
        
        arvore.imprimir();
    }
    

}
