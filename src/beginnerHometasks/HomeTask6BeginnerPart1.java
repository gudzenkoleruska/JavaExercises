package beginnerHometasks;

import static advancedHometasks.HomeTask5Advanced.printLine;

public class HomeTask6BeginnerPart1 {
    public static void main(String[] args) {

        printNumberTask(1);
        printFizzBuzz(100);
        printLine();

        //Part 1
        printNumberTask(1.1);
//        Распечатать последовательность чисел от 0 до 9 включительно.

        for (int i = 0; i <= 9; i++) {
            System.out.println("Последовательность чисел от 0 до 9 : " + i);
        }
        printLine();

        printNumberTask(2);
//        Распечатать последовательность чисел от 10 исключительно до 0 включительно

        for (int i = 10; i >= 0; i--) {
            System.out.println("Последовательность чисел от 10 исключительно до 0 : " + i);
        }
        printLine();

        printNumberTask(3);
//        Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        for (int i = 50; i <= 55; i += 2) {
            System.out.println("Распечатать последовательность чисел от 50 до 55 включительно с шагом 2 : " + i);
        }
        printLine();

        printNumberTask(4);
//        Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)

        int begin = 326;
        int end = 301;

        int start = begin - begin % 7;

        for (int i = start; i >= end; i -= 7) {
            System.out.println("Распечатать последовательность чисел, кратных 7, в промежутке (327, 300) : " + i);
        }
        printLine();

        printNumberTask(5);
//        Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1

        for (double i = 12; i <= 13; i += 0.1) {
            i = Math.round(i * 100) / 100.0;                 //или метод Math.ceil( i *100) / 100;
            System.out.println("Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1 :" + i);
        }
        printLine();

        printNumberTask(6);
//        Распечатать последовательность четных чисел от 215 до 237 включительно

        int a = 215;
        int b = 237;

        int diff = a + a % 2;

        for (int i = diff; i <= b; i += 2) {
            System.out.println("Распечатать последовательность четных чисел от 215 до 237 включительно:" + i);
        }


        printLine();
        printNumberTask(7);
//        Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.

        int c = 7 + 1;
        int d = 14 - 1;
        int step = 7;
        int start1 = c + (step - c % step);

        if (start1 < d) {
            for (int i = c; i <= d; i += step) {
                System.out.println("Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно " +
                        "до 14 исключительно:" + i);
            }
        }

        printLine();
        printNumberTask(8);
//        Распечатать последовательность которая начинается с минимального значения типа данных short и заканчивается
//        максимальным значением short. Числа в последовательности должны быть кратны 15001.

        short num1 = Short.MIN_VALUE;
        short num2 = Short.MAX_VALUE;
        int step1 = 15001;

        int diff1 = num1 - (num1 % 15001);

        for (int i = diff1; i <= num2; i += step1) {
            System.out.println("Распечатать последовательность которая начинается с минимального значения типа данных short и заканчивается\n" +
                    "//        максимальным значением short и кратна 15001 :" + i);
        }

        printLine();
        printNumberTask(9);
//        Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11, должны быть
//        распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом. А ноль необходимо
//        распечатать словом ZERO.

        for (int i = -10; i <= 34; i++) {

            if (i % 11 == 0 && i != 0) {
                System.out.println((char) 27 + "[31m" + i);
            } else if (i % 12 == 0 && i != 0) {
                System.out.println((char) 27 + "[34m" + i);
            } else if (i == 0) {
                System.out.println("ZERO");
            } else {
                System.out.println((char) 27 + "[30m" + i);
            }
        }

        printLine();
        printNumberTask(10);
        System.out.println();

//        Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность десятичных
//    чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.

        printNumbers(10.0, 2, -2);
        System.out.println();



        printLine();
        printNumberTask(11);
        System.out.println();
//        Написать метод, который принимает на вход параметры n и m типа char, и выводит на печать последовательность
//        букв английского алфавита в промежутке между значениями n и m включительно.

        printLetter('f', 'v');




    }

    public static void printFizzBuzz(int n) {

        for (int i = 1; i <= n; i++)
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
    }

    public static void printNumberTask(double number) {
        System.out.print("Task number: " + number);
        System.out.println();
    }


    //Task 10
    public static void printNumbers(double start2, double end2, double step2) {
        if (step2 != 0) {
            if (start2 <= end2 && step2 > 0) {                       //возрастающая последовательность
                for (double i = start2; i <= end2; i += step2) {
                    System.out.print(i + "; ");
                }
            } else if (start2 > end2 && step2 < 0) {                //убывающая последовательность
                for (double i = start2; i >= end2; i += step2) {
                    System.out.print(i + "; ");
                }
            }
        }
    }

    //Task 11
    public static void printLetter(char n, char m) {
        if ((n >= 97 && n <= 122) && (m >= 97 && m <= 122) || (n >= 65 && n <= 90) && (m >= 65 && m <= 90)) {
            if (n <= m) {
                for (char i = n; i <= m; i++) {
                    System.out.print(" " + i);

                }
            }else {
                for(char i = n; i >= m; i--){
                    System.out.print(" " + i);
                }
            }
        }
    }



}






