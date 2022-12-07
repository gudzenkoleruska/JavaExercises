package advancedHometasks;

import java.util.Arrays;

public class HomeTask5Advanced {

    public static void printLine(){
        System.out.println("_____________________________________________________________");
    }

    //Task 1:

    public static int countSheeps (Boolean arraySheeps[]){
        int count = 0;

        for(int i = 0; i < arraySheeps.length; i++ ){
            if (arraySheeps [i] != null) {
                if (arraySheeps[i] == true) {
                    count++;
                }
            } else{
                    return count;
                }
            }
        return count;
    }

//        Task 2:
        public static int doubleInteger(int i) {

        return i * 2;
        }

        //Task 3
        public static boolean isLove(final int flower1, final int flower2) {
            if ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower2 % 2 == 0 && flower1 % 2 != 0)){
                return true;
            }
            return false;
        }

        //Task 4
        public static String numberToString(int number) {
            // Return a string of the number here!
            return Integer.toString(number);
        }

//    public static String numberToString(int num) {
//        return String.valueOf(num);
//    }

//    public static String numberToString(int num) {
//        String res = "";
//        while (num != 0) {
//            int mod = num % 10;
//            res = String.valueOf(mod) + res;
//            num = num / 10;
//        }
//        return res;
//    }

    //Task 5:

    public static int findSmallestInt(int[] args) {

        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;
    }

        //Task 6:
        public static String countingSheep(int num) {
            StringBuilder str = new StringBuilder();

            for(int i = 0 ; i < num; i++){
                str.append(i + 1 + " sheep ...");
            }
            return str.toString();
        }

//    public static String countingSheep(int num) {
//        String text = " sheep...";
//        String result = "";
//        for (int i = 1; i <= num; i++) {
//            result += i + text;
//        }
//
//        return result;
//    }



    public static void main(String[] args) {


        //Task: sort array with words/phrases
       String[] arr = {"Today\n", "Moment\n", "I see you\n", "Apple\n", "Happy end\n" };
       System.out.println("Array before sorting: " + Arrays.toString(arr));
       Arrays.sort(arr);
       System.out.println("Array after sorting: " + Arrays.toString(arr));
        printLine();

        //Task: create array string from any song. Calculate and print every char
        String [] arrSong = {"Tired of all the excuses for not excepting EXCEL", "Sign a contract stating that I’m at peace with myself"};
        char[] arrleters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' , 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String arrSongNew = Arrays.toString(arrSong).toLowerCase();
        System.out.println(arrSongNew);

        for (int i = 0; i <= arrleters.length - 1; i++){
            int count = 0;

           for (int j = 0; j <= arrSongNew.length() - 1; j++){
               if (arrleters[i] == arrSongNew.charAt(j)){
                   count++;
               }
           }
            System.out.println(arrleters[i] + ": " + count);
        }
        printLine();

//        Task 1: Consider an array/list of sheep where some sheep may be missing from their place. We need a function
//        that counts the number of sheep present in the array (true means present).
            Boolean[] arr1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
        System.out.println("Count of sheeps: " + countSheeps(arr1));
        printLine();

//        Task 2: Code as fast as you can! You need to double the integer and return it.
        System.out.println("Result of double integer: " + doubleInteger(10));
        printLine();

//        Task 3: Timmy & Sarah think they are in love, but around where they live, they will only know once they pick
//        a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals
//        it means they are in love.
//        Write a function that will take the number of petals of each flower and return true if they are in love and
//    false if they aren't.

        System.out.println("Любят или не любят: " + isLove(1, 1));
        printLine();

//        Task 4: We need a function that can transform a number (integer) into a string.
//                What ways of achieving this do you know?
//                 Examples (input --> output):
//        123  --> "123"
//        999  --> "999"
//        -100 --> "-100"
        System.out.println("From Integer to String: " + numberToString(123));
        printLine();

//        Task 5: Given an array of integers your solution should find the smallest integer.
//        For example:
//        Given [34, 15, 88, 2] your solution will return 2
//        Given [34, -345, -1, 100] your solution will return -345
//        You can assume, for the purpose of this kata, that the supplied array will not be empty.
        System.out.println("Min value from arr: " + findSmallestInt(new int[]{1, 2, 4, -1, 0, 10, 5}));
        printLine();


//        Task 6: Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
//        Input will always be valid, i.e. no negative integers.
        System.out.println("Count sheeps: " + countingSheep(5));
        printLine();

















    }










}