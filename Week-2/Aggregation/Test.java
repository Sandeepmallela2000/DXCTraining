package dxc_Next;
 class CabServiceProvider {
	

	private String cabServiceName;
	private int totalcabs;
	 Driver driver;


	
	public CabServiceProvider(String cabServiceName, int totalcabs) 
	{
		this.cabServiceName = cabServiceName;
		this.totalcabs = totalcabs;
	}
public double  calculateRewardPrice( Driver driver) {
	return totalcabs;
	
	
}
	public String getCabServiceName() {
		return cabServiceName;
	}

	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}

	public int getTotalcabs() {
		return totalcabs;
	}

	public void setTotalcabs(int totalcabs) {
		this.totalcabs = totalcabs;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public double CalculateRewardPrice(Driver driver)
	{
		double bonus=0;
		
		if(cabServiceName=="Halo")
		{
			  if (driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5)
	            {
	              bonus = 10 * driver.getAverageRating();
	            }
	            else if (driver.getAverageRating() >= 4 && driver.getAverageRating() < 4.5)
	            {
	              bonus = 5 * driver.getAverageRating();
	            }
		}
		else if(cabServiceName=="Aber")
		{
			if (driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5)
            {
                bonus = 8 * driver.getAverageRating();
            } 
            else if (driver.getAverageRating() >= 4 && driver.getAverageRating() < 4.5) 
            {
                bonus = 3 * driver.getAverageRating();
            }
		}
		return Math.round(bonus);
	}
}
class Driver {
	
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName, float averageRating){
		this.driverName=driverName;
		this.averageRating=averageRating;
	}
	
	public String getDriverName(){
		return this.driverName;
	}
	
	public void setDriverName(String driverName){
		this.driverName=driverName;
	}
	
	public float getAverageRating(){
		return this.averageRating;
	}
	
	public void setAverageRating(float averageRating){
		this.averageRating=averageRating;
	}

    //DO NOT MODIFY THE METHOD
    //Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}



public class Test {
	public static void main(String args[]){
	    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		
		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) 
		{
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.CalculateRewardPrice(driver);
			if (bonus>0)
			{
				System.out.println("Bonus: $"+bonus+"\n");
			}
			else
			{
				System.out.println("Sorry, bonus is not available!");
			}
		}
		
		//Create more objects of CabServiceProvider and Driver classes for testing your code
	}

}
