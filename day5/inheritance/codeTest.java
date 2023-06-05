package day5.inheritance;
import java.util.*;
public class codeTest {
    public static String solution(String my_string, int[] indices) {
        StringBuilder result = new StringBuilder(my_string);

        Arrays.sort(indices);
        for (int i = indices.length - 1; i >= 0; i--) {
            int index = indices[i];
            if (index >= 0 && index < result.length()) {
                result.deleteCharAt(index);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

        String result = solution(my_string, indices);
        System.out.println(result); // 출력: programmers
    }
}
