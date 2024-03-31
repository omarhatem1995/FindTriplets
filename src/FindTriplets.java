import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTriplets {
    public static List<List<Integer>> findTriplets(int[] numberss, int target) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(numberss);

        for (int i = 0; i < numberss.length - 2; i++) {
            if (i == 0 || (i > 0 && numberss[i] != numberss[i - 1])) {
                int left = i + 1, right = numberss.length - 1, sum = target - numberss[i];
                while (left < right) {
                    if (numberss[left] + numberss[right] == sum) {
                        triplets.add(Arrays.asList(numberss[i], numberss[left], numberss[right]));
                        while (left < right && numberss[left] == numberss[left + 1]) left++;
                        while (left < right && numberss[right] == numberss[right - 1]) right--;
                        left++;
                        right--;
                    } else if (numberss[left] + numberss[right] < sum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return triplets;
    }
}