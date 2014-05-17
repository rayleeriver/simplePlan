package leet;

public class StringReverse {
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringReverse.reverse("aabb"));
	}
}
