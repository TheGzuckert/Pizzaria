package State;

public abstract class EstadoPizza {
	
	private Pizza pizza;
	
	public EstadoPizza(Pizza pizza) {
		super();
		this.pizza = pizza;
	}
	
	public abstract void Preparando();
	
	public abstract void Pronta();
	
	
	public Pizza getPizza() {
		return pizza;
	}
	
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
}
