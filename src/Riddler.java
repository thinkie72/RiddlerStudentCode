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
        String[] numbers = encrypted.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            decrypted.append(((char) Integer.parseInt(numbers[i])));
        }
        System.out.println(decrypted);
        return decrypted.toString();
    }

    public String decryptThree(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        int numBits = 8;
        for (int i = 0; i < encrypted.length() - numBits; i += numBits) {
            decrypted.append((char) (Integer.parseInt(encrypted.substring(i, i + numBits), 2)));
        }
        System.out.println(decrypted);
        return decrypted.toString();
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
