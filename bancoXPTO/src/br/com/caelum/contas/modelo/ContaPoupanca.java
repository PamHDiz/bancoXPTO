package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {
	
	@Override
	public String getTipo() {
		return super.getTipo() + " Poupan�a";
	}
	
	@Override
	public boolean saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

}
