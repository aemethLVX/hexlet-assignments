package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> dictionary) {
        var result = new ArrayList<Map<String, String>>();

        for (Map<String, String> book : books) {
            if (book.entrySet().containsAll(dictionary.entrySet())) {
                result.add(book);
            }
        }

        return result;
    }
}
//END
