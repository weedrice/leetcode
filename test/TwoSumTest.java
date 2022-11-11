import java.util.ArrayList;
import java.util.Random;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void test () {
        Random random = new Random();
        random.setSeed(System.nanoTime());

        int arrayLength = (int) (Math.random() * 10000);
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        for(int i=0;i<arrayLength;i++) {

            int randomNumber = random.nextInt(1000000000);
            int sign = random.nextInt(2);
            if(sign == 1) {
                randomNumber = randomNumber * -1;
            }

            testArray.add(randomNumber);
        }

        int guessIdx = random.nextInt(testArray.size());
        int guessIdx2 = random.nextInt(testArray.size());
        while(guessIdx != guessIdx2) {
            guessIdx2 = random.nextInt(testArray.size());
        }

    }
}
