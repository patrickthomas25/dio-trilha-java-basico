package dispositivos.internet;

public class Computador implements NavegadorInternet {

	public void exibirPagina(String url) {
		System.out.print("Exibindo página: " +url);
	}

	public void adicionarNovaAba() {
		System.out.print("Adicionando nova aba.");
		
	}

	public void atualizarPagina() {
		System.out.print("Atualizando página.");
		
	}

}
