import java.util.Scanner;

public class Que1_TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }


        System.out.print("Enter the target: ");
        int target = sc.nextInt();


        int[] result = twoSum(nums, target);


        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No solution found.");
        }


    }
}
