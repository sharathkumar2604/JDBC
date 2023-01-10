package com.xworkz.shoes;

public enum MysqlCredentials {

	
	URL("jdbc:mysql://localhost:3306/Footware"),USERNAME("root"),PASSWORD("Sathish@123@");
	String values;

	private MysqlCredentials(String values) {
		this.values = values;
	}

	public String getValues() {
		return values;
	}
	
	
	
	
	
}
