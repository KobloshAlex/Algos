package algoexpert;

public class CiserEngryption {

  private static final int LAST_INDEX_OF_ALPHABET = 122;
  private static final int FIRST_INDEX_OF_ALPHABET = 96;
  private static final int ALPHABET_LENGTH = 26;

  public static void main(String[] args) {
    System.out.println(caesarCypherEncryptor("xyz", 2));
  }

  public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here.

    // if key is greater then number of letters in alphabet
    key = key % ALPHABET_LENGTH;

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      final char c = str.toCharArray()[i];
      final int ascii = c + key;

      if (ascii <= LAST_INDEX_OF_ALPHABET) {
        stringBuilder.append((char) ascii);
      } else {
        stringBuilder.append((char) (FIRST_INDEX_OF_ALPHABET + ascii % LAST_INDEX_OF_ALPHABET));
      }
    }

    return stringBuilder.toString();
  }
}
