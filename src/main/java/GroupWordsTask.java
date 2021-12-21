import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Map<String, Integer> groupIt(List<String> words) {
        Map<Character, List<String>> result = words.stream()
                                                        .collect(Collectors
                                                                .groupingBy(s -> s.charAt(0), HashMap::new,  Collectors.toList()));
        System.out.println(result.toString());
        return null;
    }
}
