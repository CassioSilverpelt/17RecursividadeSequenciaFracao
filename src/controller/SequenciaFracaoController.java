package controller;

public class SequenciaFracaoController {
	public SequenciaFracaoController() {
		super();
	}
	
	public double sequenciaFracao(int n) {
		if (n == 0) {return 0;}
		//Usando a mesma lógica da funcão Fatorial, porém se usa 0 para somar e não alterar o resultado.
		else {
			return (double) 1/funcaoFatorial(n) + sequenciaFracao(n-1);
			//Converter para double pois o programa estava automaticamente usando inteiros.
			//Basicamente descrevi a sequência apresentada, inserindo a função fatorial no denominador.
		}
		
	}
	
	public int funcaoFatorial(int n) {
		if (n == 0) {return 1;}
		//Ponto de Parada decrescente a partir do número recebido. Número se torna 0 e retorna 1. Ultima parada deve retornar 1 para não interferir no resultado.
		else {return n * funcaoFatorial(n-1);}
		//N que multiplica N-1, até N ser 0.
	} 
	
}
