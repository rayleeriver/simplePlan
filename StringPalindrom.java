package leet;

public class StringPalindrom {
	
	public static boolean isPalindrom(String s) {
		if (s == null || s.length() == 0)
			return false;
		
		for (int i=0; i < s.length() /2; i++) {
			if (s.charAt(i) != s.charAt((s.length() - 1) - i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(StringPalindrom.isPalindrom(null));
		System.out.println(StringPalindrom.isPalindrom(""));
		System.out.println(StringPalindrom.isPalindrom("1"));
		System.out.println(StringPalindrom.isPalindrom("aba"));
		System.out.println(StringPalindrom.isPalindrom("abba"));
	}

}
