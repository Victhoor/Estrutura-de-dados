package arranjo;

public class Arranjo {

	public Integer[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	
	public Integer menor() {
		return null;
	}
	
	// O método Maior() do Arthur deve ficar assim
	public Integer maior(Integer[] lista) {
		Integer[] clone_a = lista.clone();
		return clone_a[lista.length-1];
	}
	
	// Método soma()
	public Integer soma() {
		int somaTotal = 0;
		
		for(int valor : a) {
			somaTotal += valor;
		}
		
		return somaTotal;
	}

	public Integer repeticoes(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
