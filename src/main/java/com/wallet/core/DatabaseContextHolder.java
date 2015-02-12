package com.wallet.core;

public class DatabaseContextHolder {
	
	private static final ThreadLocal<DataSourceType> contextHolder = new ThreadLocal<DataSourceType>();

	public static void setCustomerType(DataSourceType customerType) {
		contextHolder.set(customerType);
	}

	public static DataSourceType getCustomerType() {
		return contextHolder.get();
	}

	public static void clearCustomerType() {
		contextHolder.remove();
	}
}
