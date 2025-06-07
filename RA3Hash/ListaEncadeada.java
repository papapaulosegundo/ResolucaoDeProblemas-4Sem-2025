public class ListaEncadeada {

	class No {
		Registro dado;
		No prox;
		
		No(Registro dado) {
			this.dado = dado;
		}
	}
	
	No primeiro;
	No ultimo;
	
	public void inserir(Registro dado) {
		No novo = new No(dado);
		if( primeiro == null ) {
			primeiro = novo;
			ultimo   = novo;
		}			
		else {
			ultimo.prox = novo;
			ultimo = novo;
		}			
	}
	
	public boolean buscar(long chave) {
		if( primeiro == null )
			return false;
		else {
			No aux = primeiro;
			while( aux != null ) {
				if( aux.dado.getRegistro() == chave )
					return true;				
				aux = aux.prox;
			}
			return false;
		}			
	}
}
