package Strategy;

import java.math.BigDecimal;


public class INSS implements Imposto {

	public BigDecimal calcular(Orcamento orcamento) {
		System.out.println("O Imposto de R$100 sobre o INSS é: ");
		return orcamento.getValor().multiply(new BigDecimal("0.22"));
	}
}
