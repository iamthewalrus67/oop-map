import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strList = List.of("1", "2a" , "3", "abc");
        List<Integer> intList = MapTask.mapping(strList);
        System.out.println(intList.toString());

        List<String> inputList = List.of("abc", "def", "ghi");
        List<String> flattenedList = FlattingTask.flattingStrings(inputList);
        System.out.println(flattenedList.toString());

        System.out.println(FizzBuzzTask.fizzBuzzIt(FizzBuzzTask.fizzBuzz(20)));

        GroupWordsTask.groupIt(List.of("Hello", "Hi", "World"));
    }
}
