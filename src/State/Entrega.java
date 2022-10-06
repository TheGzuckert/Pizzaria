package State;

public class Entrega extends EstadoPizza {

	public Entrega(Pizza pizza) {
		super(pizza);
		System.out.println("O Request esta feito o cliente ira receber em casa" + getPizza().getPedido());
	}

	@Override
	public void Preparando() {
		System.out.println("A Pizza ainda esta sendo preparada");
		
	}

	@Override
	public void Pronta() {
		System.out.println("A Pizza esta pronta");
		
	}

}
