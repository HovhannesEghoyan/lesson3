package homework;

public class CharArrayUtil {
    public static void main(String[] args) {
        char[] chars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        //Խնդիր 1
        for (int i = 0; i < chars.length; i++) {

        }
        System.out.println(chars);
        System.out.println();
        //Խնդիր 2
        System.out.println(chars.length);
        System.out.println();
        System.out.println("First Character: " + chars[0]);
        System.out.println("Last Character: " + chars[11]);
        System.out.println();
        //Խնդիր 3
        char c = 'a';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                count++;
            }
        }
        System.out.println("Character 'a' count:" + count);
        System.out.println();
        //Խնդիր 4
        char[] vowels = {'a', 'e', 'i', 'A', 'E', 'I', 'O', 'U', 'o', 'u'};
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j])
                    sum++;

            }

        }
        System.out.println("Vowels count: " + sum);
        System.out.println();
        //Խնդիր 5
        char[] vowels1 = {'a', 'e', 'i', 'A', 'E', 'I', 'O', 'U', 'o', 'u'};
        int count1 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'a' && chars[i] != 'e' && chars[i] != 'i' && chars[i] != 'o' && chars[i] !=
                    'u' && chars[i] != 'I' && chars[i] != 'A' && chars[i] != 'E' && chars[i] != 'O' && chars[i]
                    != 'U' && chars[i] != ' ' && chars[i] != '!')
                count1++;
        }
        System.out.println("Consonants count: " + count1);
        System.out.println();
        //Խնդիր 6
        char spaces = ' ';
        int sum1 = 0;
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == spaces)
                sum1++;
        }
        System.out.println("Spaces count:" + sum1);
        System.out.println();
        //Խնդիր 7
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;

        }

        System.out.print(chars);
        System.out.println();
        System.out.println();
        //Խնդիր 9
        char[] chars1 = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        char oldChar = 'a';
        char newChar = '*';
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == oldChar) {
                chars1[i] = newChar;

            }


        }
        System.out.print(chars1);
        System.out.println();
        //Խնդիր 10
        boolean palindrome = true;
        for (int i = 0; i < chars.length / 2; i++) { //կաշխատի մինչև մեջտեղ և կհամեմատվի  մյուս կեսի հետ
            if (chars[i] != chars[chars.length - 1 - i]) {//կհամեմատ է առաջին ու վերջին թվերը
                palindrome = false;
                break;
            }
        }
        System.out.println("Palindrome is " + palindrome);
        System.out.println();
        System.out.println("BONUS2");
        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};

        boolean equal = true;

        if (first.length != second.length) {
            equal = false;
        } else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    equal = false;
                    break;
                }
            }
        }

        System.out.println("Arrays are equal: " + equal);


        System.out.println("BONUS3");
        char[] chars2 = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};

        for (int i = 0; i <chars2.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j <i; j++) {
                if (chars2[i] == chars2[j]) {
                    duplicate = true;
                    break;
                }

            }


            if (!duplicate) {
                System.out.print(chars2[i] + " ");
            }
        }


    }
}




















