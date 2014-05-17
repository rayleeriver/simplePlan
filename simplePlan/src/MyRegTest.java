

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyRegTest {
	
	MyReg myReg;
	
	@Before
	public void setup() {
		myReg = new MyReg();
	}

	@Test
	public void test() {
		Assert.assertTrue(myReg.isMatch("aa", "aa"));
		Assert.assertFalse(myReg.isMatch("aa", "aab"));
		Assert.assertFalse(myReg.isMatch("aab", "aa"));
		Assert.assertFalse(myReg.isMatch("aac", "caa"));
		
		Assert.assertFalse(myReg.isMatch("aa", "aaa"));
		Assert.assertFalse(myReg.isMatch("aba", "aaa"));
		Assert.assertFalse(myReg.isMatch("aaabaa", "aaa"));
		Assert.assertFalse(myReg.isMatch("aaaccb", "aaa"));
		Assert.assertTrue(myReg.isMatch("aaa", "aaa"));
		Assert.assertFalse(myReg.isMatch("aaaab", "aaa"));
		Assert.assertFalse(myReg.isMatch("abcbab", "aaa"));
		
		Assert.assertFalse(myReg.isMatch("aa", "a.a"));
		Assert.assertTrue(myReg.isMatch("aba", "a.a"));
		Assert.assertFalse(myReg.isMatch("aaabaa", "a.a"));
		Assert.assertFalse(myReg.isMatch("aaaccb", "a.a"));
		Assert.assertTrue(myReg.isMatch("aaa", "a.a"));
		Assert.assertFalse(myReg.isMatch("aaaab", "a.a"));
		Assert.assertFalse(myReg.isMatch("abcbab", "a.a"));
		
	}

}
