import org.junit.runner.*;
import org.junit.runner.notification.Failure;

/**
 * The test class TestingRunner runs the Testing JUnit test suite.
 *
 * @author  Luke Simmons
 * @version 12/03/2015
 */

public class TestingRunner {
    
    public static void main(String[] args) {
        
        Result result = JUnitCore.runClasses(Testing.class);
        
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        
        System.out.println(result.wasSuccessful());
        
    }    
}
