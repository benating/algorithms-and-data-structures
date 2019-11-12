package StringsAndArrays;

public class StringCompression {
    String diegoSolution(String string) {
        String[] letters = string.split("");
        int length = letters.length;

        StringBuilder result = new StringBuilder();
        int totalLetters = 0;

        for (int i = 0; i < length; i++) {
            String current = letters[i];
            int counter = 1;
            for (int j = i +1; j < length; j++) {
                String iteration = letters[j];
                if (current.equals(iteration)) {
                    counter++;
                } else {
                    i = j - 1;
                    break;
                }
            }

            result.append(current);
            result.append(counter);
            totalLetters += counter;
            if (totalLetters >= length) break;
        }
        return result.toString();
    }
}
