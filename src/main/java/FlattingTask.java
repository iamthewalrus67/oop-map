import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattingTask {
    public static List<String> flattingStrings(List<String> inputList) {
        List<String> flattenedList = inputList.stream().flatMap(x -> Arrays.stream(x.split(""))).collect(Collectors.toList());
        return flattenedList;
    }
}
