package hook_method;

public abstract class Funcionarios {
	
	private String nome;
	private double rendaFuncionario;

	public Funcionarios(String nome, double rendaFuncionario) {
		super();
		this.nome = nome;
		this.rendaFuncionario = rendaFuncionario;
	}

	public double ImpostoAnual() {
		return ImpostoMensal() * 0.12;
	}

	protected abstract double ImpostoMensal();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaMensal() {
		return rendaFuncionario;
	}

}
