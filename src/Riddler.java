/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Tyler Hinkie
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        // Letters array so to prevent calling toCharArray() repeatedly
        char[] letters = encrypted.toCharArray();
        char first;
        for (char c : letters) {
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    first = 'a';
                }
                else first = 'A';

                // Adds decrypted character to the string using the formula
                decrypted.append((char) (((c - first + 9) % 26) + first));
            }
            // Adds spaces or other special characters
            else decrypted.append(c);
        }
        System.out.println(decrypted);
        return decrypted.toString();
    }

    public String decryptTwo(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        // Splits the list of numbers into an array by space separation
        String[] numbers = encrypted.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            // Cast ints to chars to add to decrypted to complete the message
            decrypted.append(((char) Integer.parseInt(numbers[i])));
        }
        System.out.println(decrypted);
        return decrypted.toString();
    }

    public String decryptThree(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        // Number of binary bits equivalent to the proper message
        // This was also important for easy transfer during testing
        int numBits = 8;
        for (int i = 0; i < encrypted.length() - numBits; i += numBits) {
            // Use parseInt() to find the base 10 equivalent to the binary string and then cast that to a char
            decrypted.append((char) (Integer.parseInt(encrypted.substring(i, i + numBits), 2)));
        }
        System.out.println(decrypted);
        return decrypted.toString();
    }

    public String decryptFour(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        // A char[] to prevent calling toCharArray() repeatedly
        char[] dingbats = encrypted.toCharArray();
        for (int i = 0; i < dingbats.length; i++) {
            // Takes int equivalent to dingbat hex number and subtracts the difference of the starting dingbat unicode
            // number and the start of the alphabet at 65
            decrypted.append((char) ((int) dingbats[i] - 9919));
        }
        System.out.println(decrypted);
        return decrypted.toString();
    }
}
