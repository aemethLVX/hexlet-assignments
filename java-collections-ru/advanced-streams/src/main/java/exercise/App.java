package exercise;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String configText) {
        var configParsed = Arrays.asList(configText.split("\\r?\\n"));
        String result;

        Stream.of(configParsed)
            .flatMap(line -> Stream.of(line))
            .toList();

        for (var line : configParsed) {

            System.out.println(line);
        }

        return configText;
    }
}
//END
