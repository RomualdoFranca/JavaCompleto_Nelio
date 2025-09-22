package secao16.interfaces.exercicio.correcao.model.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import secao16.interfaces.exercicio.correcao.model.entities.Contract;
import secao16.interfaces.exercicio.correcao.model.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {

		double basicQuota = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			//adicionando os dados como um objeto Installment e adicionando na lista
			contract.getInstallments().add(new Installment(dueDate, quota));
		}
	}

}
