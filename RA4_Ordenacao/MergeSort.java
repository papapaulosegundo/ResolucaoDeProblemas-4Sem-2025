
public class MergeSort {
	
	public static Resultado result;

    public static void ordenar(int[] dados) {
		result = new Resultado(dados.length);
		result.iniciar();
		
		mergeSort(dados, 0, dados.length - 1);
		
		result.finalizar();
    }

    private static void mergeSort(int[] dados, int esquerda, int direita) {
    	if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;

            // Ordena as duas metades
            mergeSort(dados, esquerda, meio);
            mergeSort(dados, meio + 1, direita);

            // Combina as duas metades ordenadas
            intercalar(dados, esquerda, meio, direita);
        }
    }

    private static void intercalar(int[] dados, int esquerda, int meio, int direita) {
        int[] temp = new int[direita - esquerda + 1];

        int i = esquerda;      // Índice da primeira metade
        int j = meio + 1;      // Índice da segunda metade
        int k = 0;             // Índice do array temporário

        // Intercala os dois subarrays ordenados
        while (i <= meio && j <= direita) {
            result.somaComparacao();
            if (dados[i] <= dados[j]) {
                temp[k++] = dados[i++];
            } else {
                temp[k++] = dados[j++];
            }
        }

        // Copia os elementos restantes da primeira metade (se houver)
        while (i <= meio) {
            temp[k++] = dados[i++];
        }

        // Copia os elementos restantes da segunda metade (se houver)
        while (j <= direita) {
            temp[k++] = dados[j++];
        }

        // Copia os elementos de volta para o array original
        for (int m = 0; m < temp.length; m++) {
            result.somaTroca();
        	dados[esquerda + m] = temp[m];
        }
    }
}
