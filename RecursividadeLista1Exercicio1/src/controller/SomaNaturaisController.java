package controller;

public class SomaNaturaisController {
	public SomaNaturaisController() {
		super();
	}
	
	public int soma(int[] vet, int tamanho, int i) {
		//Condição de Parada: Se não há mais elementos a serem somados ou se  um número negativo foi encontrado, a soma dos primeiros elementos naturais é realizada e a recursão é encerrada.
		
		if(i == tamanho || vet[i] <= 0) {
			return 0;
		}else {
			
			//Chamada dos Passos: A posição atual do vetor(vet[i]) é somado ao resultado da função soma, enviando o vetor, o tamanho, e i incrementado em 1, sendo retornado no final.
			
			return vet[i] + soma(vet, tamanho, i+1);
		}
	}
}
