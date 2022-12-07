package beginnerLessons;

public class Methods {
    public static void main(String[] args) {
//        printText("Hello");

//        int n = 21;
//
//        if ((n % 2 != 0) && (n % 3 == 0)) {
//            n = 0;
//        } else if ((n % 2 != 0) && (n % 3 != 0)) {
//            n = 0;
//        } else if ((n % 2 !=0) && ( 100 % n == 0)){
//            n = 100;
//        }
//
//        //Test example
//        int expectedResult = 0;
//
//        if (n == expectedResult) {
//            System.out.println("Pass");
//        }else {
//            System.out.println("False");
//        }
//

//        Integer a = 10;
//        Integer b = 20;
//        System.out.println("Compare numbers: " + a.equals(b));


//        System.out.println("Maximum number: " + findMax(10, 40));
//        System.out.println("Maximum number: " + findMax1(20, 10));
//        System.out.println("Maximum number: " + findMax3(30, 5));

        // TC_1
        // A- arrange (обьявить все данные, которые нам известны)
        int a = 10;
        int b = 40;
        int expectedResult = 40;

        //ACT - произвести какие-то действия над переменными(вызвать метод) для получения actual result
        int actualResult = findMax(a, b);

        //Compare with expected result
        verifyEquals(expectedResult, actualResult);

        //Report
        printTCNumber();
        printResults(verifyEquals(expectedResult, actualResult));

        //TC_2

        int a1 = 3;
        int b1 = 3;
        int expectedResult1 = 3;
        int actualResult1 = findMax(a1, b1);
        verifyEquals(expectedResult1, actualResult1);

        printTCNumber();
        printResults(verifyEquals(expectedResult1, actualResult1));


        verifyEquals("Hi", "ki");


        verifyEquals(3.5, 4.2);

        //TC_3

        int number = 3;
        String expectedResultString = "March";
        String actualResultString = returnMonth(number);
        verifyEquals(expectedResultString, actualResultString);

        printTCNumber();
        printResults(verifyEquals(expectedResultString, actualResultString));

        //TC_4
        printTCNumber();
        System.out.println(evaluateDistance (2.5));

        printTCNumber();
        System.out.println(returnDouble(2,3,2));


    }

    static int tcNumber = 1;

    static public void printTCNumber() {
        System.out.print("TC_" + tcNumber++ + "\t--\t");
    }

    public static void printResults(String value) {
        System.out.println(value);
        System.out.println();
    }

    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    //Распечатать текст
    static void printText(String text) {
        System.out.println(text);
    }

    //Найти найбольшее значение
    public static int findMax(int a, int b) {
        int max;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int findMax1(int a, int b) {
        return Math.max(a, b);
    }

    public static int findMax3(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    //Найти найбольшее значение среди 4х значений
    public static int findMaxOutFour(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    public static int findMaxOut4(int a, int b, int c, int d) {
        return findMax(a, findMax(b, findMax(c, d)));
    }

    //Написать метод, который будет принимать число, а возвращать месяц
    public static String returnMonth(int number) {
        if (number > 0 && number < 13) {
            if (number == 1) {
                return "January";
            }
                if (number == 2) {
                    return "February";
                }
                if (number == 3) {
                    return "March";
                }
            }
        return "Error";
    }

    //Написать метод. который принимает расстояние (десятичное число), а возвращает расстояние в километрах и метрах
    // в виде string

    public static String evaluateDistance(double distance){
        int km = (int) distance;
        int m = (int) ((distance - km) * 1000);
        return " " + km + " km " + m + " m";
    }

    //Next Task

    public static double returnDouble (double a, double b, double c){
        double res;
        res = a * b - c;

        if (res > 0){
            return res;
        } if (res <= 0){
            return 0;
        }
        return res;
    }
}
