package beginnerHometasks;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Locale;

import static advancedHometasks.HomeTask5Advanced.printLine;
import static beginnerHometasks.HomeTask6BeginnerPart1.printNumberTask;

public class HomeTask6BeginnerPart2 {
    public static void main(String[] args) {

        printNumberTask(12);
//        Написать метод, который принимает параметр  и печатает
//        последовательность четных чисел от нуля.
//        Длина последовательности = .

        printSeq(10);
        printLine();
        printSeq1(10);
        printLine();


        printNumberTask(13);

//        Напишите метод, который принимает целое число n, и выводит все
//        степени числа 2 от 1 до n включительно
        System.out.println();
        printNum(5);
        printLine();


        printNumberTask(14);
        System.out.println();
        //    Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.

        bigNumber();
        printLine();

        printNumberTask(15);
        System.out.println();

//        Написать метод, который генерирует  последовательность чисел:
//        0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5

        generateNumbers();
        printLine();

        printNumberTask(16);
        System.out.println();

//        Распечатать последовательность чисел:
//        0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25

        for (int i = 0; i <= 25; i++) {
            if (i == 25) {
                System.out.print(i);
            } else if (i % 3 == 0 || i % 5 == 0 && i != 25) {
                System.out.print(i + ", ");
            }
        }

        System.out.println();
        printLine();

        printNumberTask(17);
        System.out.println();

//        Написать метод, который принимает параметры n, m, , и печатает
//        последовательность нечетных чисел,  начиная с числа n, с шагом m,  длина последовательности - l (сколько чисел будет выделено)

        printOddNum(2, 3, 9);

        System.out.println();
        printLine();

        printNumberTask(18);

//        Написать метод, который принимает на вход параметры n, m,  и генерирует последовательность
//        случайных целых чисел в промежутке от n до m  включительно. Длина последовательности - .
//        Вывести результат на печать
        System.out.println();
        printRandomNumber(1, 100, 10);

        printLine();

        printNumberTask(19);
        System.out.println();
//        Сгенерируйте и распечатайте последовательность чисел, где для каждого положительного или
//        отрицательного значения n выводится на печать значение, рассчитанное по формуле:
//        Для n = 0 и невалидных ситуаций  выводится значение 0

        method19(5, 4);
        System.out.println();
//ИЛИ
        yN(5);
        System.out.println();

        printLine();

        printNumberTask(21);
        System.out.println();
//        Сгенерируйте последовательность целых положительных  двузначных чисел, в которых разница
//        между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.

        twoDigits ();
        System.out.println();

        printLine();

        printNumberTask(23);
        System.out.println();
//        Написать метод, который генерирует последовательность простых положительных чисел и
//        выводит последовательность на печать

        printPositiveProst(200);
        System.out.println();

        printLine();


        printNumberTask(24);
        System.out.println();
        //    Написать метод, который принимает на вход параметры day = “Sun”, month = 10, date = 2, и выводит на печать  последовательность:
//        Sun, Oct 02
//        Mon, Oct 03
//        Tue, Oct 04
//        Wed, Oct 05
//        Thu, Oct 06
//        Fri, Oct 07
//        Sat, Oct 08
//        Sun, Oct 09

        printEightDaysFromDate("Fri", 10, 14);


    }

    //Task 12
    public static void printSeq(int l) {
        if (l > 0) {
            int count = 0;

            for (int i = 0; count < l; i += 2) {
                System.out.println(i);
                count++;
            }
        }
    }
//ИЛИ
    public static void printSeq1(int l) {
        if (l > 0) {
            for (int i = 0; l > 0; i += 2, l--) {
                System.out.println(i);
            }
        }
    }

    //Task 13
    public static void printNum (int n){
    for (int i = 0; i <= n; i++){
        System.out.println(Math.pow(2, i) + "\t");
    }
    }

    //Task 14
    public static void bigNumber() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print(String.valueOf(j).repeat(i) + " ");
            }
            System.out.println();
        }
    }

    //Task 15

    public static void generateNumbers () {
        System.out.print(0 + ", ");

        for (int i = -1; i >= -5; i--) {
            if (i >= -4) {
                System.out.print(Math.abs(i) + ", " + i + ", ");   // The Math.abs() function returns the absolute value of a number.
            } else if (i == -5) {
                System.out.println(Math.abs(i) + ", " + i);
            }
        }
    }

    //Task 17
    public static void printOddNum( int n5, int m5, int l5){
        int countNumbers = 0;

        if ( n5 % 2 != 0 || m5 % 2 != 0){

            for (int i = n5; countNumbers < l5; i += m5){
                if (i % 2 != 0){
                    countNumbers++;

                    System.out.print(i + " ");
                }
            }
        }
    }


    //Task 18
    public static int countRandom (int n, int m){
        int num = (int)((Math.random() * (m - n + 1) + n));
        return num;
}

    public static void printRandomNumber(int n, int m, int p) {
        if (p > 0) {            //проверка на валидное число
            for (int i = p; i > 0; i--) {      //уменьшаем значение
                System.out.println(countRandom(n, m) + " ");
            }
        }
    }

    //Task19
    public static void method19 (int n, int l){
        if (n > 1){
            for(int i = n; l > 0; i++, l--){
                double y = Math.ceil((Math.pow(i,2) + 1) / (2 * n - 1 ) * 100) / 100;                         //Math.ceil - округление
                System.out.println(y);
            }
        }
    }

    public static void yN (int n){
        if (n > 0){
            for(int i = 1; i <= n; i++){
                System.out.printf(Locale.ENGLISH, "%.2f ", (Math.pow(i, 2) + 1) / (2 * i - 1 ) );
            }
            }else {
            System.out.println(0);
        }
    }

    //Task 21
    public static void twoDigits(){

        for (int i = 10; i < 99; i++){
            if (Math.abs((i /10) -  (i % 10 )) <= 3){
                System.out.print(i + " ");
            }
        }
    }

    //Task 23

    public static void printPositiveProst(int x){

        for(int i = 2; i <= x; i++){

            int count;
            count = 0;

            for(int j = 2; j <= 100; j++){                  //1 and 0 -не простые числа
                if(i % j == 0 && i != j){
                    count++;
                }
            }

            if(count == 0){
                System.out.print(i + " ");
            }
        }
    }


//    Task 24


    public static String returnMonth(int number) {
        if (number > 0 && number < 13) {
            if (number == 1) {

                return "Jan";
            } else if (number == 2) {

                return "Feb";
            } else if (number == 3) {

                return "Mar";
            } else if (number == 4) {

                return "Apr";
            } else if (number == 5) {

                return "May";
            } else if (number == 6) {

                return "Jun";
            } else if (number == 7) {

                return "Jul";
            } else if (number == 8) {

                return "Aug";
            } else if (number == 9) {

                return "Sep";
            } else if (number == 10) {

                return "Oct";
            } else if (number == 11) {

                return "Nov";
            } else if (number == 12) {

                return "Dec";
            }
        }

        return "Error";
    }

    public static String returnDayOfTheWeek(int number) {
        if (number > 0 && number < 8) {
            if (number == 1) {

                return "Mon";
            } else if (number == 2) {

                return "Tue";
            } else if (number == 3) {

                return "Wed";
            } else if (number == 4) {

                return "Thu";
            } else if (number == 5) {

                return "Fri";
            } else if (number == 6) {

                return "Sat";
            } else {

                return "Sun";
            }
        }

        return "Error";
    }

    public static int returnDayOfTheWeek(String day) {
        if (day.equals("Mon")) {
            return 1;
        } else if (day.equals("Tue")) {
            return 2;
        } else if (day.equals("Wed")) {
            return 3;
        } else if (day.equals("Thu")) {
            return 4;
        } else if (day.equals("Fri")) {
            return 5;
        } else if (day.equals("Sat")) {
            return 6;
        } else if (day.equals("Sun")) {
            return 7;
        }

        return 0;
    }

    public static int returnDate(int date) {
        if (date < 10) {
            String number = String.format("%03d", date);;

            return Integer.valueOf(number);
        } else {
            return date;
        }
    }


    public static void printEightDaysFromDate(String day, int month, int date) {
        int l = 8;
        if (returnDayOfTheWeek(day) == 0 || returnMonth(month).equals("Error") || month <= 0 || date <= 0) {
            System.out.println("Please enter correct data.");
        } else if (month <= 7 && month % 2 == 1 && date > 31) {
            System.out.println("Please enter correct date.");
        } else if (month >= 8 && month <= 12 && month % 2 == 0 && date > 31) {
            System.out.println("Please enter correct date.");
        } else if ((month == 4 || month == 6 ||  month == 9 || month == 11) && date > 30) {
            System.out.println("Please enter correct date.");
        }
        else if (month == 2 && date > 28) {
            System.out.println("Please enter correct date.");
        } else {
            for (int i = returnDayOfTheWeek(day); i <= 7 && l > 0; i++, date++, l--) {
                if (i != 7) {
                    if ((month <= 7 && month % 2 != 0 && returnDate(date) >= 32)
                            || ((month == 9 || month == 11) && returnDate(date) >= 31)
                            || ((month == 4 || month == 6) && returnDate(date) >= 31)
                            || (month >= 8 && month <= 12 && month % 2 == 0 && returnDate(date) >= 32)
                            || (month == 2 && returnDate(date) >= 29)) {
                        date = 1;
                        month +=1;
                    }

                    System.out.println(returnDayOfTheWeek(i) + ", " + returnMonth(month) + " " + returnDate(date));
                } else {
                    System.out.println(returnDayOfTheWeek(i) + ", " + returnMonth(month) + " " + returnDate(date));
                    i = 0;
                }
            }
        }
    }


}




