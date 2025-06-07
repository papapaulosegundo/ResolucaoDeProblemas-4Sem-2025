import java.util.Random;

public class GeraRegistrosAleatorios {

	public static Registro[] gerar(int nItens, long seed) {
		Registro[] itens = new Registro[nItens];
		
		Random rand = new Random(seed);
		for( int i = 0; i < nItens; i++) {
			itens[i] = new Registro(rand.nextLong(100000001));	// numero aleatorio entre 0 e 100.000.000
			// System.out.println("Item["+i+"]:" + itens[i].getRegistro());
		}
		return itens;
	}
}
