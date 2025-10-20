package controller;

import br.gui.listagenerica.*;
import model.Morador;

public class Condominio {
	
	Lista[] controleCondominio;

	public Condominio() {
		controleCondominio = new Lista[7];
		inicializarTabelaHash();
	}

	private void inicializarTabelaHash() {
		int tamanho = controleCondominio.length;
		for (int i = 0; i < tamanho; i++) {
			controleCondominio[i] = new Lista();
		}
	}
	
	public void adicionarMorador(Morador morador) {
		int posicao = morador.hashCode();
		controleCondominio[posicao].addFirst(morador);
	}
	
	public Morador buscarMorador(Morador morador) throws Exception {
		int posicao = morador.hashCode();
		int tamanho = controleCondominio[posicao].size();
		for (int i = 0; i < tamanho; i++) {
			Morador m = (Morador) controleCondominio[posicao].get(i);
			if (m.numAp == morador.numAp) {
				morador.nome = m.nome;
				break;
			}
		}
		if (morador.numAp == 0) {
			throw new Exception("Modador não encontrado");
		}
		return morador;
	}
	
	public void removeMorador(Morador morador) throws Exception {
		int posicao = morador.hashCode();
		int tamanho = controleCondominio[posicao].size();
		for (int i = 0; i < tamanho; i++) {
			Morador m = (Morador) controleCondominio[posicao].get(i);
			if (m.numAp == morador.numAp) {
				controleCondominio[posicao].remove(i);
				break;
			}
		}
		if (morador.numAp == 0) {
			throw new Exception("Modador não encontrado");
		}
	}
	
	public void listaPorAndar(int andar) throws Exception {
		int posicao = hashApe(andar); 
		int tamanho = controleCondominio[posicao].size();
		for (int i = 0; i < tamanho; i++) {
			Morador m = (Morador) controleCondominio[posicao].get(i);
			System.out.println(m.toString());
		}
	}
	
	private int hashApe(int andar) {
	    return andar % controleCondominio.length;
	}
	
}
