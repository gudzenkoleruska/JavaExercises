package beginnerHometasks;

import java.util.Arrays;

import static advancedHometasks.HomeTask5Advanced.printLine;
import static beginnerHometasks.HomeTask6BeginnerPart1.printNumberTask;

public class HomeTask7BeginnerPart2 {

    public static void main(String[] args) {

        printNumberTask(21);
        printNumbers(6);
        printLine();


        printNumberTask(22);
        int[] catAges = new int[]{2, 9, 4, 5, 6, 1};
        printAverage(catAges);
        printLine();


        printNumberTask(23);
        //    Task 23
        //    Создать массив всех нечетных отрицательных чисел в промежутке от (-1000 до -900).

        int count = 0;
        int start = -999;
        int end = -900;

        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        int[] array23 = new int[count];
        int a = 0;

        for (int i = start; i < end; i += 2) {
            array23[a] = i;
            a++;

        }
        System.out.println(Arrays.toString(array23));
        printLine();


        printNumberTask(24);
        //    Task 24
//        Создать массив из 10 случайных положительных целых чисел в промежутке от 100 до 200 включительно.

        int[] array24 = new int[10];

        for (int i = 0; i < array24.length; i++) {
            array24[i] = (int) (Math.random() * 101 + 100);
        }
        System.out.println(Arrays.toString(array24));
        System.out.println();

        printNumberTask(25);
        printYesNo(catAges, 3);
        printLine();


        //    Task 26
        //    Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 24.
        printNumberTask(26);

        int countEven = 0;

        for (int i = 0; i < array24.length; i++){
            if (array24[i] % 2 == 0){
                countEven ++;
            }
        }

        int[] evenArray = new int[countEven];
        int[] oddArray = new int[array24.length - countEven];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < array24.length; i++){
            if (array24[i] % 2 == 0){
                evenArray[evenIndex] = array24[i];
                evenIndex++;
            }
            else{
            oddArray[oddIndex] = array24[i];
            oddIndex++;
            }
        }

        System.out.println(Arrays.toString(array24));
        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));
        printLine();

        //Task 27
        // Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
        //Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.
        printNumberTask(27);

        String[] catsName = {"Sharik", "Bob", "Valera", "Mark", "Super", "Barsik"};

//        System.out.println(Arrays.toString(catsName));

        String[] catsColors = {"black", "yelow", "white", "red", "grey", "grey"};
//        System.out.println(Arrays.toString(catsColors));

        String[][] array27 = new String[3][catAges.length];

        for(int i = 0; i < array27.length; i++){
            for (int j = 0; j < array27[i].length; j++){
                array27[i][j] = (i == 0) ? catsName[j]
                        :(i == 0) ? String.valueOf(catAges[j])
                        :catsColors[j];

                if (i % 2 == 0 && j % 2 == 0){
                    System.out.print(" " + array27[i][j]);
                }
            }
        }
        System.out.println();
        printLine();
        //Task 28
        // Создать двумерный массив целых случайных чисел от 1 до 10 включительно, размерность массива 4*8.

        printNumberTask(28);

        int[][] randomArray = new int[4][8];

        start = 1;
        end = 10;
        int step = (end + 1 - start);

        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 8; j++){
                randomArray[i][j] = (int)(Math.random() * step) + start;
            }
        }

            for (int i = 0; i < 4; i++){
                System.out.println(Arrays.toString(randomArray[i]));
            }
        printLine();

        //Task 29
//        Вывести сумму всех четных чисел массива из задания 28.

        printNumberTask(29);
        int summNumbers = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (randomArray[i][j] % 2 == 0) {
                    summNumbers = summNumbers + randomArray[i][j];
                }
            }
        }
        System.out.println("Summ of numbers: " + summNumbers);
        printLine();

    }

//    Task 21
//
//    Написать метод, который создает и печатает массив четных положительных чисел, значения которых не больше 6.
//    Заполняем значения и печатаем с помощью цикла for. Длина массива - l.

    public static void printNumbers(int l) {
        int[] arrayEven = new int[l];
        if (l > 0) {
            for (int i = 0; i < l; ) {
                int number = (int) (Math.random() * (6 + 1) + 0);
                if (number % 2 == 0) {
                    arrayEven[i] = number;
                    i++;
                }
            }
            System.out.println(Arrays.toString(arrayEven));
        }
    }

    //    Task 22
//    Написать метод, который принимает на вход массив int, и печатает  среднее значение всех элементов массива.
//    Проверить работу метода, если параметр на вход - массив catsAges

    public static void printAverage(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        System.out.println("Average value of array: " + count / arr.length);
    }

    //    Task 25
//        Написать метод, который принимает на вход массив int[] array и число int number. Метод проверяет,
//        содержится ли число number в массиве array. При первом нахождении числа number, метод печатает “yes”.
//        При каждом нахождении чисел на 1 больше числа number,  или на 1 меньше числа number, метод печатает “maybe”.
//        Метод печатает “no”, если не находит ни одного числа, соответствующего условиям.

    public static void printYesNo(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i] || number - 1 == array[i] || number + 1 == array[i]) {
                if (array[i] == number) {
                    System.out.println("yes");
                    break;
                } else if (number - 1 == array[i] || number + 1 == array[i]) {
                    System.out.println("maybe" + " ");
                }
            } else {
                if (i == array.length - 1) {
                    System.out.println("no");
                }
            }
        }
    }

//    Task 30
//    написать универсальный метод создания двумерного массива случайных чисел.
//    Метод ниже принимает количество строк, столбцов, + требуемый диапазон случайных чисел и печатает двумерный
//    массив с заданными условиями.

    public static void random2DArray(int indexA, int indexB, int start, int end) {
        int[][] randomArrays = new int[indexA][indexB];
        int range = (end + 1 - start);

        for (int i = 0; i <= indexA - 1; i++) {
            for (int j = 0; j <= indexB - 1; j++) {

                randomArrays[i][j] = (int) (Math.random() * range) + start;
            }
        }
        for (int i = 0; i <= indexA - 1; i++) {
            System.out.println(Arrays.toString(randomArrays[i]));
        }
    }

}





