package com.xworkz.Jeans;

public enum MysqlCredentialls {

	URL("jdbc:mysql://localhost:3306/cloth"), USERNAME("root"), PASSWORD("Sathish@123@");

	String values;

	private MysqlCredentialls(String values) {
		this.values = values;
	}

	public String getValues() {
		return values;
	}

}
