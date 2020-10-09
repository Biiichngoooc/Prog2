import static org.junit.Assert.*;

import org.junit.Test;

import Application_Prog2.App;

public class TestJUnit {

	@Test
	public void test() {
		
		String str1 = "abc";
		System.out.println(str1);
		String str2 = App.compareText();
        //String str1
        assertEquals(str1, str2);
	}
	
	

}
