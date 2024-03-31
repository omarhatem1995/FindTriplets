import java.util.List;

public class Main {
    public static void main(String[] args) {
        //array of triplets
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        //the sum to check
        int targetSum = 0;
        List<List<Integer>> result = FindTriplets.findTriplets(nums, targetSum);
        //for loop to get the output of the triplets.
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}