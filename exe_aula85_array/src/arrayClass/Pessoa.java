package arrayClass;

public class Pessoa {
	private String name;
	private Double n1;
	private Double n2;
	
	public Pessoa(String name, Double n1, Double n2) {
		this.name = name;
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getN1() {
		return n1;
	}
	
	public Double getN2() {
		return n2;
	}
	
	public Double avaliar() {
		return (n1 + n2) / 2;
	}
	
	
}
