package leet;

public class StringRotation {
	
	public static boolean isRotation(String s1, String s2) {
		return (s1 != null && s2!= null && s1.length()==s2.length() && (s1+s1).indexOf(s2) != -1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringRotation.isRotation(null, "ccba"));
		System.out.println(StringRotation.isRotation(null, null));
		System.out.println(StringRotation.isRotation("abcc", null));
		System.out.println(StringRotation.isRotation("abccc", "ccba"));
		System.out.println(StringRotation.isRotation("abcc", "ccab"));
	}

}
