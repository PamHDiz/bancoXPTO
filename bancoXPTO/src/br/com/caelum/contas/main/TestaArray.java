package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArray {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		
		for(int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100);
			contas[i] = conta;
		}
		
		double media = 0;
		
		for(int i = 0; i < contas.length; i++) {
			media = contas[i].getSaldo() / contas.length;
		}
		
		System.out.println(media);
		
	}

}
