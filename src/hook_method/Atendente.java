package hook_method;

public class Atendente  extends Funcionarios{

	public Atendente(String nome, double rendaFuncionario) {
		super(nome, rendaFuncionario);
	}


	protected double ImpostoMensal() {
		return this.getRendaMensal() * 0.1;
	}
	
	

}
