
public class RadixSort {
	
	public static Resultado result;

    public static void ordenar(int[] dados) {
		result = new Resultado(dados.length);
		result.iniciar();
		
        int max = encontrarMaiorValor(dados);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortPorDigito(dados, exp);
        }
		result.finalizar();
    }

    private static void countingSortPorDigito(int[] dados, int exp) {
        int n = dados.length;
        int[] output = new int[n]; 
        int[] count = new int[10]; 

        for (int i = 0; i < n; i++) {
            int digito = (dados[i] / exp) % 10;
            count[digito]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digito = (dados[i] / exp) % 10;
            output[count[digito] - 1] = dados[i];
            count[digito]--;
        }

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
