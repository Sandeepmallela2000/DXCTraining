package dxc_Next;

 class Regex_Password {
	public static boolean checkPasswordValidity(String password) 
	{
		if(password.matches("((?=.[0-9])(?=.[A-Z])(?=.[a-z])(?=.[@#$%*]).{8,20})"))
		{
			return false;
		}
		else 
			return true;
		
	}	 
	public static void main(String[] args) 
	{
		String password = "P@$sW0rd";
		 System.out.println("The password is "+ (checkPasswordValidity(password)?"valid!":"invalid!"));
	}


}
