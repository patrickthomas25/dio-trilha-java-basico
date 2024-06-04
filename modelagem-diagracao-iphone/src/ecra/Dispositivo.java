package ecra;

import dispositivos.iphone.Iphone;
import dispositivos.internet.NavegadorInternet;
import dispositivos.musica.ReprodutorMusical;
import dispositivos.telefone.AparelhoTelefonico;

public class Dispositivo {
	public static void main(String[] args) {
		Iphone acao = new Iphone();
		
		ReprodutorMusical ipode = acao;
		NavegadorInternet internet =  acao;
		AparelhoTelefonico phone = acao;
		
		
		ipode.selecionarMusica("Música 01");
		ipode.tocar();
		ipode.pausar();
		
		internet.exibirPagina("www.iphone.com");
		internet.adicionarNovaAba();
		internet.atualizarPagina();
		
		phone.atender();
		phone.iniciarCorreioVoz();
		phone.ligar("## #####-####");
	}
}
