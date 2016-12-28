package br.com.vursoj.javaBasico;

public class Fabrica {
	public float carro = 0;
	
	public static float totalDeCarros;
	public void fabricaCarro(){
		carro++;
		totalDeCarros++;
	}

}
