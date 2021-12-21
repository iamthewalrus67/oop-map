import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public static List<Integer> mapping(List<String> arr) {
        List<Integer> intList = arr.stream().filter(s -> s.matches("[0-9]+")).map(Integer::parseInt).collect(Collectors.toList());
        return intList;
    }
}
