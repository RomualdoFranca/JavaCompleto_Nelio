package secao16.interfaces.testes.exercicio.model.entities;

import secao16.interfaces.exercicio.correcao.model.service.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService{

	@Override
	public double paymentFee(double amount) {
		
		return amount * 0.02;
	}

	@Override
	public double interest(double amount, int months) {
		
		return amount * 0.01 * months;
	}
	
	

}
