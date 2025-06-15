
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

            intercalar(dados, esquerda, meio, direita);
        }
    }

    private static void intercalar(int[] dados, int esquerda, int meio, int direita) {
        int[] temp = new int[direita - esquerda + 1];

        int i = esquerda;     
        int j = meio + 1;      
        int k = 0;             

        while (i <= meio && j <= direita) {
            result.somaComparacao();
            if (dados[i] <= dados[j]) {
                temp[k++] = dados[i++];
            } else {
                temp[k++] = dados[j++];
            }
        }

        while (i <= meio) {
            temp[k++] = dados[i++];
        }

        while (j <= direita) {
            temp[k++] = dados[j++];
        }

        for (int m = 0; m < temp.length; m++) {
            result.somaTroca();
        	dados[esquerda + m] = temp[m];
        }
    }
}
