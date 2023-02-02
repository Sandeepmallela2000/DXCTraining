package dXC_Assignment;

public class MoveSpecialChar {
	public static String moveSplCha(String str)
	{
		int len=str.length();
		String regex="[a-zA-Z0-9\\s+]";
		String r1="",r2="";
		for(int i=0;i<len;i++) {
			char c=str.charAt(i);
			if(String.valueOf(c).matches(regex)) {
				r1=r1+c;
			}
			else
			{
				r2=r2+c;
			}
		}
		return r1+r2;
		
	}

	public static void main(String[] args) {
	String s1="Kd&f$d";
	System.out.println(moveSplCha(s1));

	}

}
