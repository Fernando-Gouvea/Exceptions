package Model.Entities;

import Model.Exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	public Account() {
		
	}
	
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit){
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}


	public Integer getNumber() {
		return number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}


	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount){
		if (amount>balance)throw new DomainException("Not enough balance");
		if (amount>withdrawLimit)throw new DomainException("The amount exceeds withdraw limit");
		balance -= amount; 
	}


	@Override
	public String toString() {
		return "______________________"+
				"Account number: " + number + 
				"\nHolder: " + holder +
				"\nNew Balance: " + balance +
				"\nWith draw Limit: " + withdrawLimit; 
				}
	
	
	
	
	
	
	

}
