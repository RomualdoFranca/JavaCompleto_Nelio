package secao14.excecoes.exercicio.model.entities;

import secao14.excecoes.exercicio.model.exception.DomainAccountException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdraw;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdraw) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdraw = withdraw;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdraw() {
		return withdraw;
	}
	
	public void deposit(double amount) {
//		amount += getBalance();
		this.balance = amount + getBalance();
	}
	
	public void withdraw(double amount) throws DomainAccountException {
		if(amount > getWithdraw()) {
			throw new DomainAccountException("The amount exceeds withdraw limit");
		}
		if(amount > getBalance()) {
			throw new DomainAccountException("Not enough balance");
		}
		this.balance = getBalance() - amount;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Number: " + getNumber());
		sb.append("\nHolder: " + getHolder());
		sb.append("\nInitial balance: $" + String.format("%.2f", getBalance()));
		sb.append("\nWithdraw limit: $" + String.format("%.2f", getWithdraw()));
		
		return sb.toString();
	}
	
	
	
	
	
	
}
