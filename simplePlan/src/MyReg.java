

public class MyReg {
	boolean isMatch(String s, String p) {
		if (s.length() == 0 && p.length() == 0) {
			return true;
		}
		
		if ((s.length() != p.length()) && (p.indexOf("*") == -1)) {
			return false;
		}
		
		if (p.length() > 1 && p.charAt(1) == '*') {
			char anyOccuranceChar = p.charAt(0);
			String remainPattern = p.substring(2);
		}
		
		if (s.charAt(0) == p.charAt(0)) {
			return isMatch(s.substring(1), p.substring(1));
		} else if (p.charAt(0) == '.') {
			return true;
		}
		
		return false;
	}
}
