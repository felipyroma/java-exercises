package entities;

public class ContaBancaria {
	private Integer numberAccount;
	private String name;
	private Double saldo = 0.0;
	
	public ContaBancaria(Integer numberAccount, String name, Double inicialDeposite) {
		this.numberAccount = numberAccount;
		this.name = name;
		depositar(inicialDeposite);
	}
	
	public ContaBancaria(Integer numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}
	
	public Integer getNumberAccount() {
		return numberAccount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.printf("O nome de usuário foi mudado para: %s", this.name);
	}
	
	public Double getSaldo() {
		return this.saldo;
	}

	public void sacar(Double saque) {
		saldo -= (saque + 5);
		System.out.printf("Foram sacados %.2f reais! \n", saque);
	}
	
	public void depositar(Double deposito) {
		saldo += deposito;
		System.out.printf("Foram depositados %.2f reais! \n", deposito);
	}
	
	

	
}
