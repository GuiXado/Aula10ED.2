package model;

import java.util.Objects;

public class Morador {

	public int numAp;
	public String nome;
	public String modelo;
	public String cor;
	public String placa;
	

	public Morador() {
	}


	public Morador(int numAp, String nome, String modelo, String cor, String placa) {
		this.numAp = numAp;
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
	}


	@Override
	public String toString() {
		return "Morador [numAp: " + numAp + ", nome: " + nome + "]";
	}


	@Override
	public int hashCode() {
		int posicao = (int)numAp / 100;
		return posicao % 7;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Morador other = (Morador) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(nome, other.nome) && numAp == other.numAp && Objects.equals(placa, other.placa);
	}
	
	
}
