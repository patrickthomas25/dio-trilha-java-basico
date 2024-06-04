package dispositivos.iphone;

import dispositivos.internet.NavegadorInternet;
import dispositivos.musica.ReprodutorMusical;
import dispositivos.telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página " + url + " via iPhone ");		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba via iPhone.");		
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página via iPhone.");		
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música via iPhone.");		
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música via iPhone.");		
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionado música " + musica + " via iPhone ");		
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + " via iPhone.");		
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo via iPhone.");		
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz via iPhone.");		
		
	}

}
