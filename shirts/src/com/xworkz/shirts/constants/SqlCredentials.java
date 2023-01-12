package com.xworkz.shirts.constants;

public enum SqlCredentials {

	URL("jdbc:mysql://localhost:3306/textile"),USERNAME("root"),PASSWORD("Sathish@123@");
	String value;

	private SqlCredentials(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	
	
	
}
