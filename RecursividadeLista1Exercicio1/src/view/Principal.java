package view;

import controller.SomaNaturaisController;

public class Principal {
	
	public static void main(String[] args) {
		SomaNaturaisController sn = new SomaNaturaisController();
		
		int[] vet = {4, 5, 9, 2, 8, -4, 77};
		int tamanho = 7;
		
		System.out.println(sn.soma(vet, tamanho, 0));
	}
}
