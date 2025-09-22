package secao16.interfaces.testes.exercicio.model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	//vai calcular a taxa de 2% sobre o amount acrescido da taxa de 1% que foi calculada no método interest()
	public Double paymentFee(double amount) {// taxa de pagamento.
		
//		for(int i = 1; i <= )
		return null;
	}

	@Override
	public Double interest(double amount, int months) {
		double interest = (amount * 0.01) * months;
		
		return interest;
	}
}
