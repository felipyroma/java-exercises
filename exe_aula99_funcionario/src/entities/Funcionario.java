package entities;

public class Funcionario {
	private Integer id;
	private String name;
	private Double salary;
	
	public Funcionario(Integer id, String name, Double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public Double aumentarSalario(Double porcentagem) {
		return salary += salary * porcentagem / 100;
		
	}
}
