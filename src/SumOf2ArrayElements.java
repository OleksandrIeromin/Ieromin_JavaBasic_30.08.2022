import java.util.Arrays;

public class SumOf2ArrayElements {

    public static void main(String[] args) {
        int[] nums = generateRandomArray(7);
        int sum = 4;
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("sum: " + sum);
        findSum(nums, sum);

    }
    private static void findSum(int[] nums, int sum) {
        for (int i = 0; i < nums.length; i++) {
            int numsNumber = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int sum_numsNumber_numsArray = numsNumber + nums[j];
                System.out.println("findSum: " + numsNumber + " + " + nums[j] + " = " + sum_numsNumber_numsArray);
                boolean findSum = sum_numsNumber_numsArray == sum;
                System.out.println(findSum);
            }
        }
    }

    private static int[] generateRandomArray(int setArrayLength) {
        int[] generatedArray = new int[setArrayLength];
        for (int i = 0; i < generatedArray.length; i++) {
            generatedArray[i] = (int) (Math.random() * 4);
        }
        return generatedArray;
    }
}
