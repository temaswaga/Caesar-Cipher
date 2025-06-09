public class LetterInAlphabetIndexDefiner {

    public static int letterInAlphabetIndexDefiner (char letter) {

        if (LanguageOfLetterDefiner.languageOfLetterDefiner(letter).equals("russian")) {
            return Encryptor.RUSSIAN_ALPHABET.indexOf(letter);

        } else if (LanguageOfLetterDefiner.languageOfLetterDefiner(letter).equals("english")) {
            return Encryptor.ENGLISH_ALPHABET.indexOf(letter);

        } else { return -1;}

    }
}
