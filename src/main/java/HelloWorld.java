import java.util.Scanner;

public class HelloWorld {
    
    public static String getMessage() {
        return "Hello, World!";
        
    }
    
    public static String guessContinent(String location) {
        // List of countries and continents (for demonstration purposes)
        String[][] countriesAndContinents = {
            {"United States", "North America"},
            {"Canada", "North America"},
            {"Brazil", "South America"},
            {"France", "Europe"},
            {"Germany", "Europe"},
            {"India", "Asia"},
            {"China", "Asia"},
            {"Australia", "Australia"},
            // Add more countries and continents as needed
        };
        
        for (String[] countryContinent : countriesAndContinents) {
            if (countryContinent[0].equalsIgnoreCase(location)) {
                return countryContinent[1];
            }
        }
        
        return "Sorry, I have no idea where that is.";
    }
    
    public static void main(String[] args) {
        System.out.println(getMessage());
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where are you from?");
        String location = scanner.nextLine();
        
        String continent = guessContinent(location);
        System.out.println("You are on " + continent);
    }
}
