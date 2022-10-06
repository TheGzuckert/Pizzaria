package null_object;

public class MenuDAO {
	

	public static final String[] pizzas = { "Mussarela", "Frango", "Calabresa" };

	public static AbstractPizza getCustomer(String pizza) {
		for (int i = 0; i < pizzas.length; i++) 
			if (pizzas[i].equalsIgnoreCase(pizza)) 
				return new AvailablePizza(pizza);			
		
		return new NullPizza();
	}
}
