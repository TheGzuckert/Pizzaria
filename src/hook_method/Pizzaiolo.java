package hook_method;

public class Pizzaiolo extends Funcionarios {

	public Pizzaiolo(String nome, double rendaFuncionario) {
		super(nome, rendaFuncionario);

	}

	@Override
	protected double ImpostoMensal() {
		return this.getRendaMensal() * 0.2;
	}
	
	

}
