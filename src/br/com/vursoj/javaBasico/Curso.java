package br.com.vursoj.javaBasico;

import javax.swing.JOptionPane;

public class Curso {

	//Metodos static so vai poder acessar objetos static
	static float n1;
	static float n2;
	static float media;
	
	static void insiraNota(){
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota "));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota "));
		
	}
	
	static void calculaMedia(){
		media = (n1+n2)/2;
		
	}
	
	static void exibeMedia(){
		JOptionPane.showMessageDialog(null, media);
	}
}
