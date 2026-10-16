package homework;

import java.sql.SQLOutput;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] nums = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6,};
        int n = 6;
        int sum = 0;
        for (int i : nums)
            if (i == n) {
                sum++;

            }
        System.out.print("Հանդիպում է " + sum + " անգամ:" + "\n");
        //Առաջադրանք 1
        for (int i = 0; i < nums.length / 2; i++) {
            int count = nums[i];
            nums[i] = nums[nums.length - 1 - i];//սկզբում ինդեկսը 0 է հետո արեցինք 10-1(9-րդ ինդեկսով տիվը) դառավ ինդեկսը 1 վերջին թիվը եկավ առաջ ինդեկս զբաղեցրեց
            nums[nums.length - 1 - i] = count;
        }
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + ", ");

        //Առաջադրանք 2
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] h = {'ա', 'ե', 'է', 'ը', 'ի', 'ո', 'օ', 'ո', 'ւ'};
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < h.length; j++) {
                if (chars[i] == h[j])
                    count++;
            }

        }
        System.out.println();
        System.out.println(count);
        //Առաջադրանք 4
        System.out.println("BONUS1");
        int[] numbers = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};
        int firstMax = numbers[0];
        int secMax = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstMax) {
                secMax = firstMax;//firsty կուդա իրա արժեքը  secin կվերցնե նորը
                firstMax = numbers[i];
            } else if (numbers[i] > secMax && numbers[i] < firstMax)
                secMax = numbers[i];
        }
        System.out.println(secMax);
    }


}




