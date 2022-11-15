import java.util.Random;

/**
 * Java. My test program
 *
 * @author Bugaienko Sergii
 * @version date 26.10.2022
 */
public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world! " + random.nextInt(10)); //output
        }
    }
}
