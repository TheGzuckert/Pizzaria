package State;

public class Pizza {
	
	private Request request;
	private EstadoPizza state;
	
	public Pizza() {
		super();
		this.state = new Forno(this);		
	}
	
	public void Preparando() {
		state.Preparando();
	}
	
	public void Pronta() {
		state.Pronta();
	}
	
	public EstadoPizza getState() {
		return state;
	}
	
	public void setState(EstadoPizza state) {
		this.state = state;
	}
	
	
	public Request getPedido() {
		return request;
	}
	
	public void setPedido(Request request) {
		this.request = request;
		this.setState(new Entrega(this));
	}
	
}
