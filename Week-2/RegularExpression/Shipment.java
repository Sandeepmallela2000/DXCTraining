package dxc_Next;

 class RegexShipment {
	public boolean checkProductNameValidity(String productName) {
		 
	  	String[] words=productName.split("\\h+");
	  	if(words.length==2 || words.length==3)
	  	{
	  		if(productName.matches("([a-zA-Z]+){1}([\\s{1}a-zA-Z]+){1}(\\s{1}[a-zA-Z]+){1}"))
			{
				return true;
			}
			else 
				return false;
	  	}
	  	else
	  		return false;

}
public boolean checkProductIdValidity(String productId) {
	
	if(productId.matches("[a-zA-Z0-9]{2,20}"))
	{
		return true;
	}
	else 
		return false;

}
public boolean checkTrackerIdValidity(String trackerId) {
	
	if(trackerId.matches("[A-Z]:[A-Z]{4}:[a-z]{3}:[0-9]{2}"))
	{
		return true;
	}
	else 
		return false;
}

}


 class Shipment {

	public static void main(String[] args) 
	{
		RegexShipment regexShipment = new RegexShipment();
		 
		 //Change the values for testing your code with different values
		 
		 String productName = "Digital Camera";
		 System.out.println("The product name is "+ (regexShipment.checkProductNameValidity(productName) ? "valid!" : "invalid!"));
		 
		 String productId = "DC1911";
		 System.out.println("The product Id is "+ (regexShipment.checkProductIdValidity(productId) ? "valid!" : "invalid!"));
		 
		 String trackerId = "D:CMDC:cmd:23";
		 System.out.println("The tracker Id is "+ (regexShipment.checkTrackerIdValidity(trackerId) ? "valid!" : "invalid!"));
	}


}
