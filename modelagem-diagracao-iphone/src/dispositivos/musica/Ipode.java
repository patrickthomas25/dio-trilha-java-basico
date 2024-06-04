package dispositivos.musica;

public class Ipode implements ReprodutorMusical {
	
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música " + musica);
		
	}
	
	public void tocar() {
		System.out.println("Tocando música.");
	}

	
	public void pausar() {
		System.out.println("Pausando música.");
		
	}

}
