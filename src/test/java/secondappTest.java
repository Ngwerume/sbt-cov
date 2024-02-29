public class HelloWorldTest {
    public static void main(String[] args) {
        testHelloWorld();
    }

    public static void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        String expectedOutput = "Hello, World!";
        String actualOutput = helloWorld.getHelloMessage();
        if (expectedOutput.equals(actualOutput)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
            System.out.println("Expected: " + expectedOutput);
            System.out.println("Actual: " + actualOutput);
        }
    }
}
