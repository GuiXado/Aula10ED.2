package view;

import model.Morador;
import controller.Condominio;

public class Principal {

	public static void main(String[] args) {
		Morador m1 = new Morador(101, "gui", "sedan", "preto", "placa");
		Morador m2 = new Morador(102, "ra", "SUV", "branco", "placa");
		Morador m3 = new Morador(201, "re", "picape", "preto", "placa");
		Morador m4 = new Morador(202, "san", "sedan", "vermelho", "placa");
		Morador m5 = new Morador(301, "le", "SUV", "cinza", "placa");
		Morador m6 = new Morador(303, "fred", "sedan", "preto", "placa");
		Morador m7 = new Morador(701, "isa", "sedan", "branco", "placa");
		Morador m8 = new Morador(702, "dani", "picape", "azul", "placa");
		
		Morador[] moradores = {m1, m2, m3, m4, m5, m6, m7, m8};
		
		Condominio con = new Condominio();
		
	    for (Morador m : moradores) {
	    	con.adicionarMorador(m);
	    }
	    
	    Morador mor = new Morador();
	    mor.numAp = 101;
	    try {
			mor = con.buscarMorador(mor);
			System.out.println(mor.toString());
			
			con.removeMorador(mor);
			
			int andar = 2;
			con.listaPorAndar(andar);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	    
	}
}
