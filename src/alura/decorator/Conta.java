package alura.decorator;

import java.util.Date;

public class Conta {

	
	private Double saldo;
	private Date dataAbertura;

	public Conta(Double saldo, Date dataAbertura) {
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", dataAbertura=" + dataAbertura + "]";
	}
	
	

}
