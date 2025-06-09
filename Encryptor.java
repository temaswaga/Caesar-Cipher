public class Encryptor {
    public final static String RUSSIAN_ALPHABET ="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public final static String ENGLISH_ALPHABET ="abcdefghijklmnopqrstuvwxyz";

    public static String textEncryptor (String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            int encryptedLetterIndex = indexOfLetterCycler(text.charAt(i), shift);
            if(LanguageOfLetterDefiner.languageOfLetterDefiner(text.charAt(i)).equals("russian")) {
                encryptedText.append(RUSSIAN_ALPHABET.toCharArray()[encryptedLetterIndex]);
            } else if (LanguageOfLetterDefiner.languageOfLetterDefiner(text.charAt(i)).equals("english")) {
                encryptedText.append(ENGLISH_ALPHABET.toCharArray()[encryptedLetterIndex]);
            }
            else encryptedText.append(text.charAt(i));
        }
        return encryptedText.toString();
    }

    public static int indexOfLetterCycler(char letter, int shift) {
        int indexOfLetter = LetterInAlphabetIndexDefiner.letterInAlphabetIndexDefiner(letter);
        int shiftedIndex = shift + indexOfLetter;

        if (LanguageOfLetterDefiner.languageOfLetterDefiner(letter).equals("russian")) {
            while (shiftedIndex > 33) {
                shiftedIndex = shiftedIndex - 33;
            }
            return shiftedIndex;

        } else {
            while (shiftedIndex > 26) {
                shiftedIndex = shiftedIndex - 26;
            }
            return shiftedIndex;
        }
    }
}
