package string;
class SpclChar {
    public static String moveSpecialCharacters(String str) {
    	//Implement your code here and change the return value accordingly
    	  String alphaNumeric = "";
    	  String special = "";
      for (int i = 0; i < str.length(); i++) {
    	  char c = str.charAt(i);
    	  if (!String.valueOf(c).matches("\\w")) {
    	      special +=c;
    	  } else {
    	      alphaNumeric +=c;
    	  }

    	    }
    	    return alphaNumeric + special;
    	}
     public static void main(String[] args) {
        String str1 = "He@#$llo!*&";
        String str2 = "%$Wel*&come!";
        System.out.println(moveSpecialCharacters(str1));
        System.out.println(moveSpecialCharacters(str2));
    }
}



