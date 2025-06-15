public class AtividadeRA4 {

	private static long SEED = 20050330;
	
	public static boolean verificaOrdenacao(int dados[]) {
		for(int i = 1; i < dados.length; i++ ) {
			if( dados[i] < dados[i-1] ) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int conjunto[];
		int tamanhos[] = {1000, 10000, 100000, 500000, 1000000};
		
		for( int tam : tamanhos ) {

			// A) InsertSort
			conjunto = GeraRegistrosAleatorios.gerar(tam, SEED);
			System.out.println("----------------------------");
			System.out.println("Ordenado: " + verificaOrdenacao(conjunto) );
			InsertSort.ordenar(conjunto);
			System.out.println(InsertSort.result.exporta("InsertSort", 1));
			System.out.println("Ordenado: " + verificaOrdenacao(conjunto) );

			// B) MergeSort
			conjunto = GeraRegistrosAleatorios.gerar(tam, SEED);
			System.out.println("----------------------------");
			System.out.println("Ordenado: " + verificaOrdenacao(conjunto) );
			MergeSort.ordenar(conjunto);
			System.out.println(MergeSort.result.exporta("MergeSort", 1));
			System.out.println("Ordenado: " + verificaOrdenacao(conjunto) );
			
			// B) QuickSort
			conjunto = GeraRegistrosAleatorios.gerar(tam, SEED);
			System.out.println("----------------------------");
			System.out.println("Ordenado: " + verificaOrdenacao(conjunto) );
			QuickSort.ordenar(conjunto);
			System.out.println(QuickSort.result.exporta("QuickSort", 1));
			System.out.println("Ordenado: " + verificaOrdenacao(conjunto) );
						
			// C) RadixSort
			conjunto = GeraRegistrosAleatorios.gerar(tam, SEED);
			System.out.println("----------------------------");
			System.out.println("Ordenado: " + verificaOrdenacao(conjunto) );
			RadixSort.ordenar(conjunto);
			System.out.println(RadixSort.result.exporta("RadixSort", 1));
			System.out.println("Ordenado: " + verificaOrdenacao(conjunto) );
		}

	}
}
