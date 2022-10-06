package State;

public class Busca extends EstadoPizza {

	public Busca(Pizza pizza) {
		super(pizza);
		System.out.println("O cliente esta indo buscar a Pizza" + getPizza().getPedido());

	}

	@Override
	public void Preparando() {
		System.out.println("A Pizza ainda esta sendo preparada");

	}

	@Override
	public void Pronta() {
		System.out.println("A Pizza ainda esta pronta");

	}

}
