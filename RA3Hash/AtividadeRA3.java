public class AtividadeRA3 {

	private static long SEED = 20050330;
	
	public static int adicionarHash(TabelaHash tabela, Registro[] conjunto) {
		int colisoes = 0;
		for(int i = 0; i < conjunto.length; i++ ) {
			// System.out.println("\tInserindo " + conjunto[i].getRegistro());
			int colisao = tabela.inserir(conjunto[i].getRegistro(), conjunto[i]);
			colisoes += colisao;
		}
		return colisoes;
	}
	
	public static void main(String[] args) {
		Registro[][] conjuntos = new Registro[3][];
		System.out.println("Gerando conjunto com 1000000 de registros...");
		conjuntos[0] = GeraRegistrosAleatorios.gerar(1000000, SEED);
		System.out.println("Gerando conjunto com 5000000 de registros...");
		conjuntos[1] = GeraRegistrosAleatorios.gerar(5000000, SEED);
		System.out.println("Gerando conjunto com 20000000 de registros...");
		conjuntos[2] = GeraRegistrosAleatorios.gerar(20000000, SEED);

		System.out.println("Iniciando inserções...");
		for(int conjunto = 0; conjunto < 3; conjunto++ ) {
			for( int tamHash = 1000; tamHash <= 100000; tamHash *= 10 ) {
				for( int tipoFuncao = 0; tipoFuncao < 3; tipoFuncao++ ) {	
					TabelaHash tabHash = new TabelaHash(tamHash);
					System.out.print("Conjunto " + 
				                     String.format("%-9d",conjuntos[conjunto].length) +
				                     " Tabela " + 
				                     String.format("%-6d",tamHash) +
				                     " Funcao Hash: " +
				                     tipoFuncao);
					tabHash.setTipoFuncao(tipoFuncao);
					
					long tempoIni = System.currentTimeMillis();
					int colisoes = adicionarHash(tabHash, conjuntos[conjunto]);
					long tempoFim = System.currentTimeMillis();
					
					long tempo = tempoFim - tempoIni;
					System.out.println("\tColisoes: " + 
					                   String.format("%-9d", colisoes) + 
					                   " Tempo: " + tempo);
				}					
			}
		}	
		
	}
}
