public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String numberString = String.valueOf(x);
        for(int i=0;i<numberString.length() / 2;i++) {
            if(numberString.charAt(i) != numberString.charAt(numberString.length() -i -1)) {
                return false;
            }
        }

        return true;
    }
}
