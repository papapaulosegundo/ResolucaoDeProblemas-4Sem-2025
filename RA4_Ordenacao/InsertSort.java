
public class InsertSort {
	
	public static Resultado result;

	public static void ordenar(int[] dados) {
		
		result = new Resultado(dados.length);
		result.iniciar();
		
		for(int i = 1; i < dados.length; i++ ) {
			int chave = dados[i];
			int j = i - 1;
			
			result.somaComparacao();
			while( j >= 0 && dados[j] > chave ) {
				dados[j + 1] = dados[j];
				j--;
				result.somaTroca();
				result.somaComparacao();
			}
			dados[j + 1] = chave;
			result.somaTroca();
		}		
		result.finalizar();
	}
}
