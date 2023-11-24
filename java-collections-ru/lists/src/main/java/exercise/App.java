package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String letters, String word) {
        
        List<String> symbols = new ArrayList<String>(Arrays.asList(letters.toLowerCase().split("")));
        var wordsSymbols = List.of(word.toLowerCase().split(""));

        for (var i = 0; i < wordsSymbols.size(); i++) {

            var currentSymbol = wordsSymbols.get(i);

            if (!symbols.contains(currentSymbol)) {
                return false;
            }

            symbols.remove(symbols.indexOf(currentSymbol));
        }

        return true;
    }
}
//END
