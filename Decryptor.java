public class Decryptor {

    public static String textDecryptor (String text, int shift) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            int encryptedLetterIndex = indexOfLetterCycler(text.charAt(i), shift);
            if(LanguageOfLetterDefiner.languageOfLetterDefiner(text.charAt(i)).equals("russian")) {
                decryptedText.append(Encryptor.RUSSIAN_ALPHABET.toCharArray()[encryptedLetterIndex]);
            } else if (LanguageOfLetterDefiner.languageOfLetterDefiner(text.charAt(i)).equals("english")) {
                decryptedText.append(Encryptor.ENGLISH_ALPHABET.toCharArray()[encryptedLetterIndex]);
            }
            else decryptedText.append(text.charAt(i));
        }

        return decryptedText.toString();
    }

    public static int indexOfLetterCycler(char letter, int shift) {
        int indexOfLetter = LetterInAlphabetIndexDefiner.letterInAlphabetIndexDefiner(letter);
        int shiftedIndex = indexOfLetter - shift;

        if (LanguageOfLetterDefiner.languageOfLetterDefiner(letter).equals("russian")) {

            while (shiftedIndex < 0) {
                shiftedIndex = shiftedIndex + 33;
            }
            return shiftedIndex;

        } else {
            while (shiftedIndex < 0) {
                shiftedIndex = shiftedIndex + 26;
            }
            return shiftedIndex;
        }
    }
}
