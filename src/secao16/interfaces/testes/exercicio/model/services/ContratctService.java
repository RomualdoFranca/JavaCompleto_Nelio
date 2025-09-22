package secao16.interfaces.testes.exercicio.model.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import secao16.interfaces.testes.exercicio.model.entities.Contratc;
import secao16.interfaces.testes.exercicio.model.entities.Installment;

public class ContratctService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public void processContratc(Contratc contratc, int month) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Installment installment =  new Installment();//instancia um obj do tipo parcela
		//valor da parcela sem o juros e taxa
		double amount = contratc.getTotalValue() / month;
		
		OnlinePaymentService service = new PaypalService();
		
		for(int i = 1; i <= month; i++) {
			//setar a data de vencimento pegando a data inserida no contrato e adicionando 1 mês atraves do método
			installment.setDueDate(contratc.getDate().plusMonths(i));
			
			//valor da parcela sem o juros e taxa. Ou seja, é o valor total divido pela quantidade de meses
			installment.setAmount(contratc.getTotalValue() / month);
			//pega o valor da parcela que foi setado na linha de código acima e atribui o valor da parcela sem juros a um 			variável
			double interestFreeInstallment = installment.getAmount();
			//variavel que armazena apenas o juros
			double interest = service.interest(interestFreeInstallment, i);
			//variavel que armazena apenas a taxa
			double tax = service.paymentFee(interestFreeInstallment + interest);
			//seta ao valor da parcela o juros e a taxa
			installment.setAmount(installment.getAmount()+ interest + tax);
			System.out.println("Installment");
			System.out.println("dueDate = " + installment.getDueDate().format(dtf));
			System.out.println("amount = " + String.format("%.2f", installment.getAmount()));
			System.out.println();
		}
	}
	
	
	
	
	
}
