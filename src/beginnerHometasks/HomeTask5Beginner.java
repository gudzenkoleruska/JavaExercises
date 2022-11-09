package beginnerHometasks;

import static java.lang.Integer.*;

public class HomeTask5Beginner {

    public static void main(String[] args) {

        System.out.println("**************************************");
        //Task 2
        int dayNumber = 3;
        String expectedResultString = "Wednesday";
        String actualResultString = returnWeekDays(dayNumber);
        verifyEquals(expectedResultString, actualResultString);

        printTCNumber();
        printResults(verifyEquals(expectedResultString, actualResultString));
        System.out.println("**************************************");

        //Task 3
        int age1 = 20;
        int age2 = 40;
        int age3 = 60;

        int expectedResult = 40;
        int actualResult = calculateAverageAge(age1, age2, age3);
        verifyEquals(expectedResult, actualResult);

        printTCNumber();
        printResults(verifyEquals(expectedResult, actualResult));

        age1 = -20;
        age2 = -40;
        age3 = -60;

        int expectedResult1 = MIN_VALUE;
        int actualResult1 = calculateAverageAge(age1, age2, age3);
        verifyEquals(expectedResult1, actualResult1);

        printTCNumber();
        printResults(verifyEquals(expectedResult1, actualResult1));

        System.out.println("**************************************");

        //Task 4
        int age4 = -5;
        int age5 = -30;
        int age6 = -3;

        int expectedResult2 = -30;
        int actualResult2 = minValue(age4, age5, age6);
        verifyEquals(expectedResult2, actualResult2);

        printTCNumber();
        printResults(verifyEquals(expectedResult2, actualResult2));
        System.out.println("**************************************");

        //Task 5

        int k = 3, l = 30, m = 300, n = 3000;

        int expectedResult4 = 3;
        int actualResult4 = findMinNumberOfTwo(k, l);
        verifyEquals(expectedResult4, actualResult4);

        printTCNumber();
        printResults(verifyEquals(expectedResult4, actualResult4));
        System.out.println("**************************************");

        //Task 6
        int expectedResult5 = 3;
        int actualResult5 = findMinNumberOfThree(k, l, m);
        verifyEquals(expectedResult5, actualResult5);

        printTCNumber();
        printResults(verifyEquals(expectedResult5, actualResult5));

        int expectedResult6 = 3;
        int actualResult6 = findMinNumberOfFour(k, l, m, n);
        verifyEquals(expectedResult6, actualResult6);

        printTCNumber();
        printResults(verifyEquals(expectedResult6, actualResult6));
        System.out.println("**************************************");

        //Task 7
        double temp1 = 39.0;
        double temp2 = 39.0;
        double temp3 = 39.0;

        double expectedResult7 = 39.0;
        double actualResult7 = calculateTempCatAv(temp1, temp2, temp3);
        verifyEquals(expectedResult7, actualResult7);


        printTCNumber();
        printResults(verifyEquals(expectedResult7, actualResult7));

        temp1 = 15.5;
        temp2 = 40.5;
        temp3 = 38.0;

        double expectedResult8 = -1;
        double actualResult8 = calculateTempCatAv(temp1, temp2, temp3);
        verifyEquals(expectedResult8, actualResult8);

        printTCNumber();
        printResults(verifyEquals(expectedResult8, actualResult8));
        System.out.println("**************************************");

        //Task 8
        String nameEmployee = "Смирнова Мария Ивановна";
        double payEmployee = 70000.00;

        String expectedResult9 = "Смирнова Мария Ивановна     70000 руб 0 коп";
        String actualResult9 = returnPayEmployee(nameEmployee, payEmployee);
        verifyEquals(expectedResult9, actualResult9);

        printTCNumber();
        printResults(verifyEquals(expectedResult9, actualResult9));

        String nameEmployee1 = "";
        double payEmployee1 = 676878.77880;

        String expectedResult10 = "";
        String actualResult10 = returnPayEmployee(nameEmployee1, payEmployee1);
        verifyEquals(expectedResult10, actualResult10);

        printTCNumber();
        printResults(verifyEquals(expectedResult10, actualResult10));

        String nameEmployee2 = null;
        double payEmployee2 = 70000.00;

        String expectedResult11 = "";
        String actualResult11 = returnPayEmployee(nameEmployee2, payEmployee2);
        verifyEquals(expectedResult10, actualResult10);

        printTCNumber();
        printResults(verifyEquals(expectedResult11, actualResult11));

        //Task 9

        nameEmployee = "Смирнова Мария Ивановна";
        String nameEmployee3 = "Серебров Иван Петрович";
        payEmployee = 70000.00;
        double payEmployee3 = 75006.00;

        System.out.println(returnDoubleNameAndSurname("Смирнова Мария Ивановна",70000.00,
                "Серебров Иван Петрович",75006.00));

        printSalary(
                returnPayEmployee("Смирнова Мария Ивановна",70000.54 ),
                returnPayEmployee("Серебров Иван Петрович",7565767.67 ));
        System.out.println("**************************************");


        //Task 11
        printTCNumber();
        System.out.println(returnText(10.75));

        double rubKop = 2.05;
        String expectedResult13 = "2 руб 05 коп";
        String actualResult13 = returnText2 (rubKop);

        verifyEquals(expectedResult13, actualResult13);

        printTCNumber();
        printResults(verifyEquals(expectedResult13, actualResult13));
        System.out.println("**************************************");


        //Task 14

        int year = 1999;
        int expectedResult14 = 1;
        int actualResult14 = returnSumDigitsOfData (year);

        verifyEquals(expectedResult14, actualResult14);

        printTCNumber();
        printResults(verifyEquals(expectedResult14, actualResult14));

        System.out.println(printLuckyNumber(1992));
        System.out.println("**************************************");


        //Task 15

        int num1 = 12;
        int num2 = 13;
        int num3 = 101;

        String expectedResult15 = "Среднее значение 42 отличается от медианы 13  на 29";
        String actualResult15 = calculateDiffAverageAndMediana (num1, num2, num3);


        verifyEquals(expectedResult15, actualResult15);

        printTCNumber();
        printResults(verifyEquals(expectedResult15, actualResult15));
        System.out.println("**************************************");


        //Task 16
        printTCNumber();
        System.out.println(roundNumber(10.75));
        System.out.println("**************************************");

        //Task 17
        printTCNumber();
        System.out.println(solveTask(3, 4, 20));
        System.out.println("**************************************");

        //Task 18
        printTCNumber();

        int x = 20;

        if (x % 2 != 0 && x >= 0){
            System.out.println("The statement is true");
        }
        System.out.println("The statement is false");
        System.out.println("**************************************");


        //Task 19
        printTCNumber();
        findRandomNumber();
        System.out.println("**************************************");


        //Task 20
        printTCNumber();
        System.out.println("RandomPositive " + returnRandomPositive() + " " +  "RandomNegative "+ returnRandomNegative());
        System.out.println("**************************************");






    }




    static int tcNumber = 2;

    static public void printTCNumber() {

        System.out.print("TC_" + tcNumber++ + "\t--\t");
    }

    public static void printResults(String value) {
        System.out.println(value);
        System.out.println();
    }


    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {

            return "Pass";
        }

        return "Fail";

    }

    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {

            return "Pass";
        }

        return "Fail";

    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {

            return "Pass";
        }

        return "Fail";

    }


    //Task 2
//    Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели. В случае невалидных значений
//    метод возвращает “Error”. Протестировать метод

    public static String returnWeekDays(int dayNumber) {
        if (dayNumber > 0 && dayNumber < 8) {
            switch (dayNumber) {
                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Thursday";
                case 5:
                    return "Friday";
                case 6:
                    return "Saturday";
                case 7:
                    return "Sunday";
            }
        }

        return "Error";
    }

    //Task 3
//    Написать алгоритм вычисления среднего возраста (int) в семье из 3х человек.
//    Например,
//    int age1 = 20,
//    int age2 = 40,
//    int age3 = 60
//    Average = 40.

    public static int calculateAverageAge(int age1, int age2, int age3) {
        if (age1 >= 0 && age1 <= 150 && age2 >= 0 && age2 <= 150 && age3 >= 0
                && age3 <= 150) {
            int quantityPeople = 3;

            return (age1 + age2 + age3) / quantityPeople;
        }

        return MIN_VALUE;
    }

    //Task 4

//    age1 = -5;
//    age2 = -30;
//    age3 = -3;
//    должно вернуть  Integer.MIN_VALUE;

    public static int minValue(int age1, int age2, int age3) {
        return Math.min(age1, Math.min(age2, age3));
    }

    //Task 5
//    Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
//    k и l
//    k, l, m
//    k, l, m, n
//    Переменные должны быть типа int
//
//    Happy path test data:
//            if k = 3, l = 30, m = 300, n = 3000
//    expected results:
//    a) 3
//    b) 3
//    c) 3
//
//    Написать тесты на каждый метод.

    public static int findMinNumberOfTwo(int k, int l) {
        return Math.min(k, l);
    }

    public static int findMinNumberOfThree(int k, int l, int m) {
        return Math.min(k, Math.min(l, m));
    }

    public static int findMinNumberOfFour(int k, int l, int m, int n) {
        return Math.min(k, Math.min(l, Math.min(m, n)));
    }
//Task 6
//    Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота. Метод принимает и
//    возвращает значения типа double.
//    Например,
//    t1 = 39
//    t2 = 39
//    t3 = 39
//    t4 = 39
//    t5 = 39
//    TempAverage = 39

    public static double calculateTempCatAv(double temp1, double temp2, double temp3) {

        double countTem = 3.0;
        double averageTemp;

        if (temp1 >= 25.00 && temp1 <= 45.00 && temp2 >= 25.00 && temp2 <= 45.00 && temp3 >= 25.00 && temp3 <= 45.00) {
            averageTemp = (temp1 + temp2 + temp3) / countTem;

            return averageTemp;
        }

            return -1.0;
        }



//Task 7
//    Написать метод, который принимает на вход 2 параметра -  цену и количество товара (количество в штуках).
//    Алгоритм возвращает сумму покупки в виде десятичного числа.
//    Например,
//    price for 1 = 25 руб 50 коп (25.5)
//    amount = 5
//    expected total = 127 руб 50 коп (127.5)
//
//    При невалидных значениях метод возвращает -1

    public static double returnSumm(double price, int amount) {
        if (price > 0 && amount > 0.0) {

            return price * amount;
        }

        return -1;
    }

    //Task 8
//    Написать метод, который принимает на вход необходимые параметры и возвращает строку ведомости выдачи зарплаты
//    сотрудникам.
//    Например:
//            “Смирнова Мария Ивановна 		70000 руб 00 коп”
//    если имя сотрудника придет в виде пустой строки или в виде null (String -  это референсный тип данных и может
//    принимать значение null), то в ведомости должна быть распечатана пустая строка "".
//    Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана, как 0, то в ведомости тоже
//    должна быть распечатана пустая строка ""


    public static String returnPayEmployee(String nameEmployee, double payEmployee) {
        int wholePartOfNumber = (int) Math.floor(payEmployee);
        int decimalPartOfNumber = (int) Math.ceil(payEmployee * 100) - wholePartOfNumber * 100;

        if (nameEmployee == null || nameEmployee.equals("") || nameEmployee.equals(" ")
                || payEmployee <= 0) {

            return "";
        } else {
            return "" + nameEmployee + "     " + wholePartOfNumber + " руб "
                    + decimalPartOfNumber + " коп";
        }
    }

    //Task 9
//    Создать метод, который печатает ведомость для нескольких сотрудников, используя метод из задачи 8, например:
//
//    Смирнова Мария Ивановна 		70000 руб 00 коп
//    Серебров Иван Петрович 		128059 руб 00 коп
//
//    Метод в задании 9 может принимать разные параметры, в зависимости от того, что вам нужно для печати ведомости.
//    Смысл этого метода - распечатать несколько строк ведомости одновременно. Каждая из строк должна формироваться с помощью метода, написанного в задании 8.
//
//    На этот метод писать тесты не нужно, просто распечатать ведомость.

    public static String returnDoubleNameAndSurname (String nameEmployee, double payEmployee,
                                                     String nameEmployee2, double payEmployee2){
        return returnPayEmployee(nameEmployee,payEmployee) + "\n"
                + returnPayEmployee(nameEmployee2, payEmployee2);
    }

    //Task 10
//    Написать метод, который принимает на вход количество часов (int) работы в день, стоимость одного часа работы в
//    десятичном числе, и возвращает заработную плату в месяц в целых единицах.
//    При невалидных значениях метод возвращает -1.

    public static int calculateSalary(int hours, double price) {
        if (price >= 12 && hours > 0 && hours <= 24) {
            int salary = (int) (hours * price * 21);

            return salary;
        }
        return -1;
    }

    public static void printSalary(String w1, String w2){
        System.out.println();
        System.out.println(w1);
        System.out.println(w2);

    }
    //Task 11
//    Написать метод, который принимает на вход десятичное число (например, 10.75),
//    и возвращает строку “10 руб 75 коп”.

    public static String returnText (double number){
        return (int) number + " руб " + (int)(number * 100 % 100) + " коп ";
    }

    public static  String returnText2 (double number2){
        if (number2 < 0 ){

            return "Error";
        }
        int rub1 = (int) number2;
        int kop = (int) (Math.round(number2 * 100 % 100));
        String format = "";

        if (kop > 9){
            format = "" + rub1 + " руб " + kop + " коп";
        } if (kop <= 9){
            format = "" + rub1 + " руб 0" + kop + " коп";
        }
        return format;
    }


    //Task 14

//    Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
//        Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается
//        сумма всех чисел.
//        Например:
//        год рождения 1999
//        1 + 9 + 9 + 9 = 28
//        2 + 8 = 10
//        1 + 0 = 1
//        Счастливое число - 1

    public static int returnSumDigitsOfData (int birthDayYear) {

        int number = birthDayYear;
        int stopDigit = 9;

        if(birthDayYear > 0){
            while (number > stopDigit){
                number = sumNumberDigits(number);
            }

            return sumNumberDigits(number);
        }

        return (-1);
    }

    public static int sumNumberDigits (int number){
        int sum = 0;

        while(number != 0){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static String printLuckyNumber (int yearOfBirth){
        if (yearOfBirth == 1 || yearOfBirth > 9999){
            return "Error";
        }

        int luckyNum = yearOfBirth % 9;
        if (luckyNum == 0){
            luckyNum = 9;
        }

        return "Your lucky number is " + luckyNum;
    }

    //Task 15

//    а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
//    Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
//    Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

    public static String calculateDiffAverageAndMediana (int num1, int num2, int num3){
            int average = (num1 + num2 + num3) / 3;

            int max = Math.max(Math.max(num1,num2), num3);
            int min = Math.min(Math.min(num1,num2), num3);

            int median = num1 + num2 + num3 - (max + min);

            int diffAverageAndMediana = average - median;

            if (diffAverageAndMediana > 2){

                return String.format("Среднее значение %s отличается от медианы %s  на %s", average, median, diffAverageAndMediana);
            }

                return String.format("Среднее значение = %s, медиана = %d", average, median);

    }

    //Task 16
//    Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75) и
//    округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.

    public static String roundNumber (double summPayment){
        if (summPayment >= 0){
            String totalAmount = returnText(Math.floor(summPayment));

            return totalAmount;
        }

        return "Error";
    }

    //Task 17
//    Посчитать с помощью методов класса Math
//    int a = 3
//    int b = 4
//    int c = 20
//
//    Вернуть значение с округлением в бОльшую сторону.

    public static int solveTask (int a, int b, int c){
        if (a <= 0 || b <= 0 || c <= 0){

            return -1;
        }

        return (int) Math.ceil((Math.sqrt((a * b + c) * Math.pow(a, b)) / Math.PI));
    }

    //Task 19
//    Написать метод, который с помощью методов класса Math высчитывает случайно сгенерированную степень
//    сгенерированного случайного числа. Метод возвращает значение и выводит на экран: “Число … в степени … = …”
//    Число может быть в пределах от 0 до 1 исключительно.
//    Степень числа может быть от 0 до 10 включительно

    public static double findRandomNumber(){
        double a = Math.random();
        double n = (int) (Math.random() * 11);
        double randomNumber = Math.pow(a, n);
        System.out.println(String.format("Число " + a + " в степени " + n + " = " + randomNumber));

        return randomNumber;

    }
    //Task 20
//    Написать метод, который возвращает целочисленное случайное число в пределах от 1 до 99 включительно.
//    Затем написать метод, который возвращает случайное число в пределах от -1 до -99 включительно

    public static int returnRandomPositive(){
        int num1 = (int) (Math.random() * 99) + 1;

        return num1;
    }

    public static int returnRandomNegative(){
        int num2 = (int) (Math.random() * 99) - 99;

        return num2;
    }






}









