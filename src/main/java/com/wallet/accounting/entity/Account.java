package com.wallet.accounting.entity;

import java.math.BigDecimal;

/**
 * @author LL
 *
 */
public class Account {

	private String id;
	private AccountType accountType;
	private CURRENCY currency;

	private BigDecimal balance;

	public CURRENCY getCurrency() {
		return currency;
	}

	public void setCurrency(CURRENCY currency) {
		this.currency = currency;
	}

	public static enum CURRENCY {
		RMB
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}
