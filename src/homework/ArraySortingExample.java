package homework;

public class ArraySortingExample {
    public static void main(String[] args) {
        //Առաջադրանք 1
        int[] nums = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int num : nums)
            System.out.print(num + ", ");
        System.out.println();
        //Առաջադրանք 2
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]){
                    int temp = nums[j+1];
                    nums[j+1]= nums[j];
                    nums[j]= temp;
                }

            }
        }
        for (int num : nums)
            System.out.print(num+", ");
    }
}
