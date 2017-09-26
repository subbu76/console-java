package poc.subbu;

public class StringUtils {

	public static boolean isPalindrome(String input) {
		boolean is_Pali = false;
		if (null!=input && !input.trim().equals("")) {
			StringBuilder reverse = new StringBuilder("");
			for (int i=input.length()-1;i>=0;i--) {
				reverse.append(input.charAt(i));
			}
			is_Pali = reverse.toString().equalsIgnoreCase(input);
		}
		return is_Pali;
	}
	
	public static 
	
}
