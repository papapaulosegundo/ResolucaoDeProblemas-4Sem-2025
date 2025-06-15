
public class Resultado {

	private long tamanho = 0;
	private long troca = 0;
	private long compara = 0;
	private long tempoIni = 0;
	private long tempoFim = 0;

	public Resultado(long tamanho) {
		this.tamanho = tamanho;
	}
	public void somaTroca() {
		troca++;
	}
	public void somaComparacao() {
		compara++;
	}
	public void iniciar() {
		tempoIni = System.currentTimeMillis();
	}
	public void finalizar() {
		tempoFim = System.currentTimeMillis();
	}
	public double tempo() {
		return (tempoFim - tempoIni) / 1000.0;
	}
	public String exporta(String algoritmo, int rodada) {
		return algoritmo + ";" +
	           rodada + ";" +
	           tamanho + ";" +
	           compara + ";" +
			   troca + ";" +
			   tempo() ;
	}
}
