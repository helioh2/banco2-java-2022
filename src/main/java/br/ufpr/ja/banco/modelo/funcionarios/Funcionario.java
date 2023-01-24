package br.ufpr.ja.banco.modelo.funcionarios;

public abstract class Funcionario {
	
	private long id;
	private String nome;
	private String cpf;
	private double salario;
	
	private static long idUltimo = 0;
	
	private static synchronized void incrementarIdUltimo() {
		idUltimo++;
	}
	
	public Funcionario(String nome, String cpf) {
		super();
		incrementarIdUltimo();
		this.id = idUltimo;
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public long getId() {
		return id;
	}
//	
//	public double getBonificacao() {
//		return this.salario * 0.10;
//	}

	// CONTRATO:
	public abstract double getBonificacao(); // método abstrato
	
	
	@Override
	public String toString() {
		String str = "";
		str += this.nome + ", " + this.cpf;
		return str;
	}
	

	
	
}
