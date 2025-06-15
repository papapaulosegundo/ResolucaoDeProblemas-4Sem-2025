
public class QuickSort {
	
	public static Resultado result;

    public static void ordenar(int[] dados) {
		result = new Resultado(dados.length);
		result.iniciar();
		
		quickSort(dados, 0, dados.length - 1);
		
		result.finalizar();
    }

    private static void quickSort(int[] dados, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(dados, inicio, fim);
            quickSort(dados, inicio, pivo - 1); // Ordena parte esquerda
            quickSort(dados, pivo + 1, fim);    // Ordena parte direita
        }
    }

    private static int particionar(int[] dados, int inicio, int fim) {
        int pivo = dados[fim]; // pivô escolhido como o último elemento
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
        	result.somaComparacao();
            if (dados[j] <= pivo) {
                i++;
                trocar(dados, i, j);
            }
        }
        result.somaTroca();
        trocar(dados, i + 1, fim); // Coloca o pivô na posição correta
        return i + 1;
    }

    private static void trocar(int[] dados, int i, int j) {
        int temp = dados[i];
        dados[i] = dados[j];
        dados[j] = temp;
        result.somaTroca();
        result.somaTroca();
    }
}
