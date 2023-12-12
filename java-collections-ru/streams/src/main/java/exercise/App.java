package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        List<String> freeHosts = Arrays.asList(
            "gmail.com",
            "yandex.ru",
            "hotmail.com"
        );

        var quantity = emails.stream()
                .filter(email -> freeHosts.contains(email.split("@")[1]))
                .count();

        return (int) quantity;
    }
}
// END
