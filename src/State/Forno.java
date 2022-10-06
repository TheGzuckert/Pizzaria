package State;

public class Forno extends EstadoPizza  {

	public Forno(Pizza pizza) {
		super(pizza);
		System.out.println("A pizza do cliente esta pronta");
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
