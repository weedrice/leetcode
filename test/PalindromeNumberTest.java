import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void test() {
        PalindromeNumber testClass = new PalindromeNumber();
        Assert.assertTrue(testClass.isPalindrome(121));
        Assert.assertFalse(testClass.isPalindrome(1212));
    }
}
