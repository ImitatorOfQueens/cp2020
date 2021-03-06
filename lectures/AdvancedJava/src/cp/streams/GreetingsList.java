package cp.streams;

import java.util.Arrays;
import java.util.List;

public class GreetingsList
{
	public static void main( String[] args )
	{
		List< String > greetings =
			Arrays.asList( "Hello", "Hi", "Ciao", "Hej", "Bok", "Bonjour" );
//		List< Integer > lengths = new ArrayList<>();
//		for( String greeting : greetings ) {
//			lengths.add( greeting.length() );
//		}
//		for( Integer length : lengths ) {
//			System.out.println( length );
//		}
		
		greetings.stream().map(
			greeting -> greeting.length()
		).forEach( length -> System.out.println( length ) );
	}
}
