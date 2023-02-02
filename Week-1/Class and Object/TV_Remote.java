package DXC;

class TV
{
	int channel;
	int volume;
	boolean status;
	public TV(int channel, int volume, boolean status) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.status = status;
	}
	
	
	void turnOff()
	{
	if (status == true)
	{
		status= false;
		System.out.println("TV is Off");
	}
	else
	{
		System.out.println("TV is already OFF");
	}
	}
	
	void turnOn()
	{
	if(status == false)
	{
		status = true;
		System.out.println("TV is On");
	}
	else
	{
		System.out.println("TV is already ON");
	}
	}
	
	
	
	void channelUp()
	{
		if (channel <= 7 && status == true)
		{
			channel++;
			System.out.println("Channel is Increased");
		}
		else
		{
			System.out.println("It has reached Maximum Channel Number");
		}
	}
	
	void channelDown()
	{
		if (channel == 7 && status == true)
		{
			channel--;
			System.out.println("Channel is Decreased");
		}
		else
		{
			System.out.println("It has reached Minimum Channel Number");
		}
	}
	
	void volumeUp()
	{
		if (volume <= 7 && status == true)
		{
			volume++;
			System.out.println("volume is Increased");
		}
		else
		{
			System.out.println("It has reached Maximum volume");
		}
	}
	
	void volumeDown()
	{
		if (volume <= 7 && status == true)
		{
			volume--;
			System.out.println("volume is decreased");
		}
		else
		{
			System.out.println("It has reached Minimum Volume");
		}
	}
}
public class TV_Remote {

	public static void main(String[] args) {
		
	TV t1 = new TV(122, 6, true);
	t1.turnOn();
	t1.turnOff();
	t1.volumeUp();
	t1.volumeDown();
	t1.channelUp();
	t1.channelDown();
	
	}

}
