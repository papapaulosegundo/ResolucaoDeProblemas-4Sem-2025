public class TabelaHash {
	
	public static int RESTO = 0;
	public static int MULTIPLICACAO = 1;
	public static int DOBRAMENTO = 2;
	
	private int tamanho;
	private int tipoFuncao;
	private ListaEncadeada dados[];
	
	public TabelaHash(int tamanho) {
		dados = new ListaEncadeada[tamanho];
		this.tamanho = tamanho;
		this.tipoFuncao = RESTO;
	}
	
	public void setTipoFuncao(int tipoFuncao) {
		this.tipoFuncao = tipoFuncao;		
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public int inserir(long chave, Registro dado) {
		int colisao = 0;
		int hash = hash(chave);

		if( dados[hash] == null ) {
			dados[hash] = new ListaEncadeada();
		} else {
			colisao++;
		}
		dados[hash].inserir(dado);
		
		return colisao;
	}
	
	public boolean buscar(long chave) {
		int hash = hash(chave);
		if( dados[hash] == null ) {
			return false;
		} else {
			return dados[hash].buscar(chave);
		}		
	}
	
	private int hash(long chave) {
		switch( tipoFuncao ) {
		case 0: // Resto da divisão
			return (int) (chave % tamanho);
			
		case 1: // Multiplicacao
			double A = 0.6180339887; // constante: proporção áurea
            double frac = (chave * A) % 1;
            return (int) (tamanho * frac);
	
		case 2: // Dobramento
			String s = String.valueOf(chave);
            int soma = 0;
            for (int i = 0; i < s.length(); i += 2) {
                String part;
                if( i + 2 >= s.length() )
                	part = s.substring(i);
                else
                	part = s.substring(i, i+2);
                
                soma += Integer.parseInt(part);
            }
            return (int) (soma % tamanho);
		}
		return 0;
	}
}
