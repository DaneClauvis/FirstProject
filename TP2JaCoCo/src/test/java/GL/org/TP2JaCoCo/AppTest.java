package GL.org.TP2JaCoCo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest 
    
{
   
 
    String input = "laval" ;
	App app1 = new App() ;
	
    @Test
    public void isPalindroneTest() {
    	assertEquals(true, app1.isPalindrone(input));
    }
    
}
