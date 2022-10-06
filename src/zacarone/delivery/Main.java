package zacarone.delivery;
import java.math.BigDecimal;

import Observer.Pedido;
import Observer.Register;
import State.Request;
import State.Pizza;
import Strategy.CalculadoraDeImposto;
import Strategy.Imposto;
import Strategy.Orcamento;
import hook_method.Atendente;
import hook_method.Funcionarios;
import hook_method.Pizzaiolo;
import null_object.AbstractPizza;
import null_object.MenuDAO;
import Strategy.Alguel;
import Strategy.ISS;
import Strategy.INSS;

public class Main {

	public static void main(String[] args) {

		
		//Strategy implementado
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImposto impostoSobreProdutos = new CalculadoraDeImposto();

		System.out.println(impostoSobreProdutos.calcular(orcamento, new Alguel()));

		System.out.println(impostoSobreProdutos.calcular(orcamento, new ISS()));

		System.out.println(impostoSobreProdutos.calcular(orcamento, new INSS()));
		
		//Fim do Strategy
		
		
		
		
		//Null Object
		/*
		AbstractPizza Opcao1 = MenuDAO.getCustomer("Peperoni");
		AbstractPizza Opcao2 = MenuDAO.getCustomer("Mussarela");
		AbstractPizza Opcao3 = MenuDAO.getCustomer("Frango");
		AbstractPizza Opcao4 = MenuDAO.getCustomer("Requeijão");
		AbstractPizza Opcao5 = MenuDAO.getCustomer("Calabresa");
		
		
		System.out.println("Sabores disponiveis");
		System.out.println(Opcao1.getPizza());
		System.out.println(Opcao2.getPizza());
		System.out.println(Opcao3.getPizza());
		System.out.println(Opcao4.getPizza());
		System.out.println(Opcao5.getPizza());
		
		*/
		//Fim Null Object
		
		//hook method
		/*
		Funcionarios erick = new Pizzaiolo("Erick", 2300);
		Funcionarios poly = new Atendente("Poly", 1650);
		
		System.out.println("O imposto da atendende " + poly.getNome() + " é " + poly.ImpostoAnual());
		System.out.println("O imposto do pizzaiolo " + erick.getNome() + " é " + erick.ImpostoAnual());
		*
		*/
		//Fim hook method
		
		
		//State-pattern
		
		//Pizza pizza = new Pizza();
		//pizza.Preparando();
		//pizza.Pronta();
				
		//Request request = new Request("Pizza de frango");
		//pizza.setPedido(request);
		//pizza.Preparando();
		//pizza.Pronta();
		//
		
		
		//Observer
		
		/*
		Register Ifood = new Register("ifood");
		Register SmartPhone = new Register("whatsapp");
		
		Pedido pedido1 = new Pedido("Pedido 1");
		Pedido pedido2 = new Pedido("Pedido 2");

		Ifood.addObserver(pedido1);
		SmartPhone.addObserver(pedido2);
		
		Ifood.notificacao("Pedido recebido pelo ifood");
		System.out.println();
		SmartPhone.notificacao("Pedido recebido pelo telefone");
		*/
		
		//

	}


}
