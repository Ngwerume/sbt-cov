import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    
    @Test
    public void testGuessContinent_ExistingLocation() {
        String location = "United States";
        String expectedContinent = "North America";
        String actualContinent = HelloWorld.guessContinent(location);
        assertEquals(expectedContinent, actualContinent);
    }
    
    @Test
    public void testGuessContinent_NonExistingLocation() {
        String location = "Japan";
        String expectedContinent = "Sorry, I have no idea where that is.";
        String actualContinent = HelloWorld.guessContinent(location);
        assertEquals(expectedContinent, actualContinent);
    }
    
    @Test
    public void testGuessContinent_CaseInsensitive() {
        String location = "australia";
        String expectedContinent = "Australia";
        String actualContinent = HelloWorld.guessContinent(location);
        assertEquals(expectedContinent, actualContinent);
    }
}