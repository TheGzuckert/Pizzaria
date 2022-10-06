package Observer;

public class Pedido implements Observer {

	private String name;

	public Pedido(String name) {
		super();
		this.name = name;
	}

	public void notificacao(Request request) {
		System.out.println(name + " chegou pelo " + request);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}