package br.com.caelum.contas.main;

import java.io.FileNotFoundException;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaException {

	/*
	 * public static void main(String[] args) throws FileNotFoundException { new
	 * java.io.FileInputStream("arquivo.txt"); }
	 */
	
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		
		cc.deposita(100);
		//cc.saca(150); exce��o � lan�ada
		
		
		
		Conta cp = new ContaPoupanca();
		cp.deposita(100);
		
		try {
			cc.saca(50);
			System.out.println("Consegui sacar da Conta Corrente");
			cp.saca(50);
			System.out.println("Consegui sacar da Conta Poupan�a");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage()); // esse m�todo retorna a mensagem passada ao cons
											    // do m�todo chamado saca						
		}
		
	}
}
