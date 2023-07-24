package com.example.demo;

public class password {
	private String password;

	
	
	 public String getPassword() {
		return password;
	}



	public void setPassword(String passwod) {
		this.password = passwod;
	}



	public static Boolean isValidPassword(String password)
	    {
	            boolean isValid = true;
	            if (password.length() > 15 || password.length() < 8)
	            {
	                    isValid = false;
	            }
	            String upperCaseChars = "(.*[A-Z].*)";
	            if (!password.matches(upperCaseChars ))
	            {
	                    isValid = false;
	            }
	            String lowerCaseChars = "(.*[a-z].*)";
	            if (!password.matches(lowerCaseChars ))
	            {
	                    isValid = false;
	            }
	            String numbers = "(.*[0-9].*)";
	            if (!password.matches(numbers ))
	            {
	                    isValid = false;
	            }
	            String specialChars = "(.*[@,#,$,%].*$)";
	            if (!password.matches(specialChars ))
	            {
	                    isValid = false;
	            }
				return isValid;
				

	    }
}
