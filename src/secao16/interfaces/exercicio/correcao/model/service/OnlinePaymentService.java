package secao16.interfaces.exercicio.correcao.model.service;

public interface OnlinePaymentService {
	
	double paymentFee(double amount);
	double interest(double amount, int months);

}
