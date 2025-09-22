package secao16.interfaces.testes.exercicio.model.services;

public interface OnlinePaymentService {
	
	public Double paymentFee(double amount);//taxa de pagamento
	public Double interest(double amount, int months); // juros

}
