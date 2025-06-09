public class LanguageOfLetterDefiner {

    public static String languageOfLetterDefiner (char letter) {
        if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')) {
            return "english";
        }
        else if ((letter >= 'А' && letter <= 'Я') || (letter >= 'а' && letter <= 'я') || letter == 'Ё' || letter == 'ё') {
            return "russian";
        }
        else return "anotherLanguagesLetterOrSymbol";
    }

}
