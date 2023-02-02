package dxc_Next;

public class Participant {
	
	    private static int counter = 10001;
	    private String name;
	    private long contactNumber;
	    private String city;
	    private String registrationId;
	    
	    static
	    {
	        counter = 10001;
	    }
	    
	    public Participant(String name, long contactNumber, String city)
	    {
	        this.name = name;
	        this.contactNumber = contactNumber;
	        this.city = city;
	        registrationId = "D" + counter++;
	    }
	    
	    public String getName()
	    {
	        return name;
	    }
	    
	    public long getContactNumber()
	    {
	        return contactNumber;
	    }
	    
	    public String getCity()
	    {
	        return city;
	    }
	    
	    public String getRegistrationId()
	    {
	        return registrationId;
	    }
	}

	class Participant_Details
	{
	    public static void main(String[] args)
	    {
	        Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
	        Participant participant2 = new Participant("Merina", 7890423112L, "New York");
	        Participant[] participants = { participant1, participant2 };
	        for (Participant participant : participants)
	        {
	         System.out.println("Hi " + participant.getName() + "! Your registration id is " + participant.getRegistrationId());
	        }
	    }
	}

