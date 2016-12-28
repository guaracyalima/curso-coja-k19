package br.com.vursoj.javaBasico.teste;

import br.com.vursoj.javaBasico.Fabrica;

public class FabricaTeste {

	public static void main(String[] args) {
		Fabrica cu = new Fabrica();
		cu.fabricaCarro();
		cu.fabricaCarro();
		cu.fabricaCarro();
		
		System.out.println("O ze ruela tem mais um caro "+cu.totalDeCarros);
		
	}
}
