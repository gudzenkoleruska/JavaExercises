package advancedLessons;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayStringLesson {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, -4, 10, 20_000, 1500, 0};
        System.out.println("Длина массива: " + arr.length);
        System.out.println("_________________________________________________");

        for (int i = 0; i <= 7; i++) {
            if (arr[i] == -4) {
                continue;
            }
            System.out.println("i=" + i + " arr[i] = " + arr[i]);
        }
        System.out.println("_________________________________________________");

        int arr2[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(arr2[2]));
        System.out.println((arr2[2][2]));        //показать элемент под индексом 2, строки 2
        System.out.println(Arrays.toString(arr2));  //выводит ссылки
        System.out.println(Arrays.deepToString(arr2)); //выводит элементы массива

        System.out.println("_________________________________________________");

        int[] array = {1, 2, 5, -4, 10, 20_000, 1500, 0};
        int min = array [0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
                minIndex = i;
                System.out.println("Минимальное значение в массиве: " + min
                        + "\nИндекс минимального числа:" + minIndex);
            }
        }
        System.out.println("_________________________________________________");

        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальное значение в массиве: " + max
                + "\nИндекс максимального числа:" + maxIndex);
        System.out.println("_________________________________________________");

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Сумма чисел в массиве: " + sum);
        System.out.println("_________________________________________________");

//        Scanner input = new Scanner(System.in);
//        int sum1 = 0;
//        int number = 1;
//        while (number != 0){
//            System.out.println("Введи новое число: ");
//            number = input.nextInt();
//            sum1 += number;
//            System.out.println("Sum is to far " + sum1);
//        }

        String s1 = "Apple Leo";
        String s2 = new String("Apple Leo");
        String s3 = "Apple Leo";
        String[] str = {s1, s2, s3};

        System.out.println(s1.equals(s2));     //true
        System.out.println(s1 == s2);          //fasle

        System.out.println(s1.charAt(3));     //выводит символ из строки
        System.out.println(s1.indexOf('l'));
        System.out.println(s1.indexOf('l',2+1));
        System.out.println(s1.toLowerCase().indexOf('l',3+1));

        System.out.println((char)65);
        System.out.println((char) ('A' + 1));
        System.out.println(s1.contains("Leo"));

        System.out.println(String.join(", ", "1", "2", "3", "4"));

        String a = "1 2 3 4 5 6";
        String [] arra_y = a.split(" ");
        System.out.println(Arrays.toString(arra_y));
        System.out.println(Arrays.deepToString(arra_y));
        System.out.println("_________________________________________________");

        //StringBuffer - способ конкатинации строк
        StringBuffer sBuffer = new StringBuffer("test");
        sBuffer.append(" String Buffer");
        System.out.println(sBuffer);

        StringBuffer sb = new StringBuffer("abc");
        sb.append("def");
        System.out.println(sb);

        System.out.println("_________________________________________________");
        Integer x = 127;
        Integer y = 127;
        System.out.println(String.format("x = %s, y = %d, x == y is %b", x, y, x.equals(y)));
        System.out.println("_________________________________________________");

        System.out.println("temp: " + taF( -40));

        System.out.println("_________________________________________________");

        // Цикл for each
        int[] arrI = {1, 2, 5, 10, 100, -1, 9};

        int max5 = Integer.MIN_VALUE;
        for (int num5: arrI){
            if (num5 > max5){
                max5 = num5;
            }
        }

        System.out.println(Arrays.toString(arrI) + " largest number: " + max5);
        System.out.println("_________________________________________________");


    }
    static double taF (double cel){

        return (9.0 * cel / 5) +32;

        }




}
