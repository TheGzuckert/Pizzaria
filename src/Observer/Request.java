package Observer;

public interface Request {

	public void notificacao(String message);
	
	public void addObserver(Observer observer);

}
