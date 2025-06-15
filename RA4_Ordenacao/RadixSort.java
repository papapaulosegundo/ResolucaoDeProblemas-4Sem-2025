
public class RadixSort {
	
	public static Resultado result;

    public static void ordenar(int[] dados) {
		result = new Resultado(dados.length);
		result.iniciar();
		
        int max = encontrarMaiorValor(dados);

        // Aplica counting sort para cada d�gito (1, 10, 100, ...)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortPorDigito(dados, exp);
        }
		result.finalizar();
    }

    private static void countingSortPorDigito(int[] dados, int exp) {
        int n = dados.length;
        int[] output = new int[n]; // array de sa�da
        int[] count = new int[10]; // para d�gitos de 0 a 9

        // Conta ocorr�ncias de cada d�gito no array
        for (int i = 0; i < n; i++) {
            int digito = (dados[i] / exp) % 10;
            count[digito]++;
        }

        // Calcula posi��es acumuladas
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Constr�i o array de sa�da (de tr�s para frente para estabilidade)
        for (int i = n - 1; i >= 0; i--) {
            int digito = (dados[i] / exp) % 10;
            output[count[digito] - 1] = dados[i];
            count[digito]--;
        }

        // Copia o array ordenado para o original
        for (int i = 0; i < n; i++) {
        	result.somaTroca();
        	dados[i] = output[i];
        }
    }

    private static int encontrarMaiorValor(int[] array) {
        int max = array[0];
        for (int valor : array) {
            if (valor > max) {
                max = valor;
            }
        }
        return max;
    } 
}
