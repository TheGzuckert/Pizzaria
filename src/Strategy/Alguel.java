package Strategy;

import java.math.BigDecimal;


public class Alguel implements Imposto {

	public BigDecimal calcular(Orcamento orcamento) {
		System.out.println("O Imposto de R$100 sobre o ISS é: ");
		return orcamento.getValor().multiply(new BigDecimal("0.13"));
	}
}
