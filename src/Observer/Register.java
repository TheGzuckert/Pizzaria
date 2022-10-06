package Observer;

import java.util.ArrayList;
import java.util.List;

public class Register implements Request {
	private String name;
	private List<Observer> observers;

	public Register(String name) {
		super();
		this.name = name;
	}

	public void addObserver(Observer observer) {
		getObservers().add(observer);
	}

	public void removeObserver(Observer observer) {
		getObservers().remove(observer);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private List<Observer> getObservers() {
		if (observers == null)
			this.observers = new ArrayList<Observer>();
		return observers;
	}

	@Override
	public String toString() {
		return name;
	}


	public void notificacao(String message) {
		for (Observer o : observers)
			o.notificacao(this);
	}

}
