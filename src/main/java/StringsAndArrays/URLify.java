package StringsAndArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class URLify {
    String solution(String string, Integer length){

        String[] split = string.split(" ");
        ArrayList<String> withUrl = Arrays.stream(split).map(word -> word.concat("%20")).collect(Collectors.toCollection(ArrayList::new));
        withUrl.set(split.length - 1, split[split.length - 1]);

        StringBuilder result = new StringBuilder();
        withUrl.forEach(result::append);

        return result.toString();
    }
}
