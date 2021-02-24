import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] numbers = { 7, 2, 5, 7, 11, 23, -32, 435, 5, 23, 21, 543, 12, 324, 564, 3124, 69, 3243, 420, 3424, 76,
                987, 90000000 };
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
        altBubbleSort(numbers); // alternative, but in reverse
        System.out.println(Arrays.toString(numbers));
        System.out.println("Maximum number is: " + maxNum(numbers));
        System.out.println("Minimum number is: " + minNum(numbers));
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static int maxNum(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int minNum(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    // alternative version
    public static void altBubbleSort(int[] nums) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                    sorted = false;
                }
            }
        }
    }
}

// 7) Advanced: teha nt Bubble/Selection sort algoritm selgituse järgi
// 5) Ise tehtud min/max funktsioonid, kuhu sisse võib anda tühja või täis
// massiivi, ka miinus arvudega, ja leiab vastavad min/max
