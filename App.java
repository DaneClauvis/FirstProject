package GL.org.TP2JaCoCo;

/**
 * Hello world!
 *
 */
public class App 
{   
	public boolean isPalindrone(String word) {
		if(word==null) {
			throw new IllegalArgumentException(" input string should not be null");
		}
		if(word.equals(Reverse(word))) {return  true;}
		else 
			return false ;
	}
	
	private static String Reverse(String input) {
		String rev="";
		for(int i = input.length()-1; i>=0 ; i--) {
			rev= rev+input.charAt(i);
		}
		return rev ;
	}
 
    public static void main( String[] args ) {
        System.out.println( "Hello World!" ); 
        System.out.println( "it s mee kiss" ); 
        String b= "adoul";
        System.out.println(Reverse(b));
        Client cl = new Client(1,'boue','yar','11/12/1950','bbb@gamil.com','123ABC','1555847',1);
        
    }
}
