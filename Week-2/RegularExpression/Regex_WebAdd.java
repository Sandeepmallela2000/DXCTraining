package dxc_Next;

 public class Regex_WebAdd {

	public static boolean checkWebAddressValidity(String webAddress) 
	{
		if(webAddress.matches("(http://|https://)(www\\.).[a-zA-Z0-9](.com|.org|.net)"))
		{
			return false;
		}
		else 
			return true;
		
	}

	public static void main(String[] args) 
	{
		String webAddress = "http://www.company.com";
		 System.out.println("The web address is "+(checkWebAddressValidity(webAddress)?"valid!":"invalid!"));

	}


	}


