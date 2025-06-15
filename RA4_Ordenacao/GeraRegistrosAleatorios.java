import java.util.Random;

public class GeraRegistrosAleatorios {

	public static int[] gerar(int nItens, long seed) {
		int[] itens = new int[nItens];
		
		Random rand = new Random(seed);
		for( int i = 0; i < nItens; i++) {
			itens[i] = rand.nextInt(1000000001);	// numero aleatorio entre 0 e 1.000.000.000
			// System.out.println("Item["+i+"]:" + itens[i].getRegistro());
		}
		return itens;
	}
}
