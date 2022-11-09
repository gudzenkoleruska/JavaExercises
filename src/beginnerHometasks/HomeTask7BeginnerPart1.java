package beginnerHometasks;

import java.util.Arrays;

import static advancedHometasks.HomeTask5Advanced.printLine;
import static beginnerHometasks.HomeTask6BeginnerPart1.printNumberTask;

public class HomeTask7BeginnerPart1 {
    public static void main(String[] args) {

        printNumberTask(1);
        System.out.println(returnMonth(5));
        System.out.println(returnDate(13));
        printLine();

        printNumberTask(2);
        returnFirstAddNumber(7, 7, 0);
        returnFirstAddNumber(14, -7, 0);
        returnFirstAddNumber(-7, 14, 0);
        returnFirstAddNumber(-7, -7, -7);
        returnFirstAddNumber(7, 21, 7);
        System.out.println();
        returnFirstAddNumber(-14, 14, -7);
        System.out.println();
        returnFirstAddNumber(-21, 14, 7);
        System.out.println();
        returnFirstAddNumber(21, -14, -7);
        System.out.println();
        printLine();


//        Task 3
//        Создать массив catsNames[], заполнить его любыми своими значениями (не такими, как были на уроке).

        printNumberTask(3);

        String[] catsName = new String[6];

        catsName[0] = "Sharik";
        catsName[1] = "Bob";
        catsName[2] = "Valera";
        catsName[3] = "Mark";
        catsName[4] = "Super";
        catsName[5] = "Barsik";

        System.out.println(Arrays.toString(catsName));
        printLine();

//        Task 4
//        В массиве catsNames[] изменить значение элемента с индексом 4 на “Рыжик”,  а значение элемента с
//        индексом 1 на “Черныш”.

        printNumberTask(4);

        catsName[1] = "Chernish";
        catsName[4] = "Rizik";
        System.out.println(Arrays.toString(catsName));
        printLine();

//        Task 5
//        Создать массив catsColors[] и заполнить его значениями (см картинку в презентации).
        printNumberTask(5);
        String[] catsColors = {"black", "yelow", "white", "red", "grey", "grey"};
        System.out.println(Arrays.toString(catsColors));

        printLine();
//        Task 6
//        Создать массив catsAges[] и заполнить его любыми целочисленными валидными значениями.
        printNumberTask(6);

        int[] catsAges = {10, 4, 5, 6, 8, 2};
        System.out.println(Arrays.toString(catsAges));
        printLine();

//        Task 7
//        Создать массив isCatRed[] и заполнить его соответствующими значениями (см картинку в презентации. Red = рыжий)
        printNumberTask(7);
        boolean[] isCatRed = new boolean[6];

        if (catsColors.length == isCatRed.length) {
            for (int i = 0; i < catsColors.length; i++) {
                if (catsColors[i].equals("grey")) {
                    isCatRed[i] = true;
                } else {
                    isCatRed[i] = false;
                }
            }
        }
        System.out.println(Arrays.toString(isCatRed));

        printLine();

//        Task 8
//        Распечатать для массивов catsNames[] и catsColors[]:


        printNumberTask(8);
//        имя кота в коробке с номером 4

        System.out.println(catsName[4]);
        System.out.println();

//        имена котов из коробок с четными индексами
        for (int i = 0; i < catsName.length; i += 2) {
            System.out.print(catsName[i] + " ");
        }
        System.out.println();

//        имена котов из коробок, чьи индексы кратны 4
        for (int i = 0; i < catsName.length; i += 4) {
            System.out.print(catsName[i] + " ");
        }
        System.out.println();

//        цвет котов из коробок с нечетными индексами
        for (int i = 1; i < catsColors.length; i += 2) {
            System.out.print(catsName[i] + " ");
        }
        System.out.println();

//        цвет котов из коробок, чьи индексы кратны 3, но не кратны 2

        for (int i = 0; i < catsColors.length; i += 3) {
            if (i % 2 != 0) {
                System.out.print(catsName[i] + " ");
            }
        }
        System.out.println();
        printLine();

        printNumberTask(9);
//    Task 9
//    Распечатать “Накорми кота!” для всех серых котов
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("grey")) {
                System.out.println("Накорми кота!");
            }
        }
        printLine();

//    Task 10
//        Распечатать “Дай коту воды!” для всех котов со значениями true из массива isCatRed[]
        printNumberTask(10);
        for (int i = 0; i < isCatRed.length; i++) {
            if (isCatRed[i]) {
                System.out.println("Дай коту воды!");
            }
        }
        printLine();

        //    Task 12
        //    Для кота в последней коробке распечатать имя, цвет, возраст
        printNumberTask(12);
        if ((catsName.length == catsColors.length) && (catsColors.length == catsAges.length)) {
            int length = catsName.length - 1;
            System.out.print(catsName[length] + " ");
            System.out.print(catsColors[length] + " ");
            System.out.print(catsAges[length] + "\n");
        }

        printLine();

        //    Task 13
        //    Распечатать имя, цвет, возраст котов в двух серединных коробках
        printNumberTask(13);

        if ((catsName.length == catsColors.length) && (catsColors.length == catsAges.length)) {
            int length1 = catsName.length / 2;

            System.out.println(catsName[length1 - 1] + " " + catsName[length1]);
            System.out.println(catsColors[length1 - 1] + " " + catsColors[length1]);
            System.out.println(catsAges[length1 - 1] + " " + catsAges[length1]);
        }
        printLine();

        //    Task 15
        //    Распечатать “Накорми … !” , где … - имя кота, а значение isCatRed == true
        printNumberTask(15);

        if (catsName.length == isCatRed.length) {
            for (int i = 0; i < isCatRed.length; i++) {
                if (isCatRed[i]) {
                    System.out.println("Накорми " + catsName[i] + "!");
                }
            }
        }
        printLine();

        //    Task 16
        //    Распечатать “Накорми … !” , где … - имя кота, а значение isCatRed == true
        printNumberTask(16);

//        Распечатать средний возраст котов из массива catsAges[]
//        Распечатать возраст самого молодого кота
//        Распечатать возраст самого старого кота

        int countAge = 0;
        int averageAge;
        int minAge = catsAges[0];
        int maxAge = catsAges[0];

        for (int i = 0; i < catsAges.length; i++) {
            countAge += catsAges[i];
            if (catsAges[i] < minAge) {
                minAge = catsAges[i];
            }
            if (catsAges[i] > maxAge) {
                maxAge = catsAges[i];
            }
        }
        averageAge = countAge / catsAges.length;

        System.out.println("Average age: " + averageAge);
        System.out.println("Min age: " + minAge);
        System.out.println("Max age: " + maxAge);

        printLine();

        //    Task 19
        //    Распечатать количество серых котов и количество рыжих котов

        printNumberTask(19);

        int greyColors = 0;
        int redColors = 0;

        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("grey")) {
                greyColors++;
            }
            if (catsColors[i].equals("red")) {
                redColors++;
            }
        }
        System.out.println("Count grey cats: " + greyColors);
        System.out.println("Count red cats: " + redColors);

        printLine();

        //    Task 20
        //    Распечатать имя кота, если кот находится в коробке с нечетным индексом и его возраст не больше 2 лет
        printNumberTask(20);

        if (catsName.length == catsAges.length) {

            for (int i = 1; i < catsAges.length; i += 2) {
                if (catsAges[i] <= 2) {
                    System.out.println(catsName[i]);
                }
            }
        }

    }
//
//    Task 1:
//    Прочитать ссылку про оператор switch в документации Oracle, посмотреть видео (ссылки в презентации),
//    и переписать  методы returnMonth(), returnDayOfTheWeek() с помощью оператора switch.

    public static String returnMonth(int numberMonth) {

        if (numberMonth > 0 && numberMonth < 13) {
            switch (numberMonth) {
                case 1:
                    return "Jan";
                case 2:
                    return "Feb";
                case 3:
                    return "Mar";
                case 4:
                    return "Apr";
                case 5:
                    return "May";
                case 6:
                    return "Jun";
                case 7:
                    return "Jul";
                case 8:
                    return "Aug";
                case 9:
                    return "Sep";
                case 10:
                    return "Oct";
                case 11:
                    return "Nov";
                case 12:
                    return "Dec";
            }
        }
        return "Error";
    }


    public static String returnDayOfTheWeek(int number) {
        if (number > 0 && number < 8) {

            switch (number) {
                case 1:
                    return "Mon";
                case 2:
                    return "Tue";
                case 3:
                    return "Wed";
                case 4:
                    return "Thu";
                case 5:
                    return "Fri";
                case 6:
                    return "Sat";
                case 7:
                    return "Sun";
            }
        }
        return "Error";
    }

    public static int returnDayOfTheWeek(String day) {

        switch (day) {
            case "Mon":
                return 1;
            case "Tue":
                return 2;
            case "Wed":
                return 3;
            case "Thu":
                return 4;
            case "Fri":
                return 5;
            case "Sat":
                return 6;
            case "Sun":
                return 7;
        }

        return 0;
    }

    public static int returnDate(int date) {
        if (date < 10) {
            String number = String.format("%03d", date);

            return Integer.valueOf(number); //добавляем ноль для 1-9
        } else {
            return date;
        }
    }

    public static int daysInMonth(int month, int year) {

        int numDays;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:

                return -1;
        }

        return numDays;
    }

    public static void printEightDaysFromDate(String day, int month, int date, int year) {

        int currentYear = year; //использовал для метода без агумета year. Для текущего года.

        if (returnDayOfTheWeek(day) == 0 ||
                returnMonth(month).equals("Error") ||
                month <= 0 || // лишнее т.к. уже проверяется в returnMonth
                date <= 0 ||
                date > (daysInMonth(month, year))) {

            System.out.println("Please enter correct data.");

        } else {
            int currentDay = returnDayOfTheWeek(day);
            int currentMonth = month;
            int currentDate = date;
// print day
            for (int i = 0; i <= 7; i++) {
                if (currentDay != 7) {
                    System.out.print(returnDayOfTheWeek(currentDay) + ", ");
                    currentDay++;
                } else {
                    System.out.print(returnDayOfTheWeek(currentDay) + ", ");
                    currentDay = 1;
                }
// prinnt month + date
                if (currentDate <= daysInMonth(currentMonth, currentYear)) {
                    System.out.println(returnMonth(currentMonth) + " " + returnDate(currentDate));
//                    System.out.println(" " + currentYear); //проверка года - закоментить
                    currentDate++;
                } else {
                    if (currentMonth != 12) {
                        currentMonth++;
                    } else {
                        currentMonth = 1;
                        currentYear = year + 1;
                    }
                    currentDate = 1;
                    System.out.println(returnMonth(currentMonth) + " " + returnDate(currentDate));
//                    System.out.println(" " + currentYear); //проверка года - закоментить
                    currentDate++;
                }
            }
        }
    }

//    Task 2
//    Написать универсальный метод для построения последовательности, которая начинается с числа start, заканчивается
//    числом end (оба включительно). Все числа в этой последовательности должны быть кратны числу step. Этот метод должен
//    высчитывать первое кратное число в диапазоне [start, end] и строить последовательность (возрастающую или убывающую)
//    от вычисленного первого кратного числа с шагом step.

    public static void returnFirstAddNumber(int start, int end, int step) {

        if (step == 0) {
            System.out.println("Error! Enter correct step number");

        } else if (start == end && step != end) {
            System.out.println("Error! Start and end number equals, and entered step doesn't work ");

        } else if (start == end && start % end == 0){
            System.out.println(start);
        }
        else {
            int newStart = start - start % step;

            if (start <= end && step > 0) {          //возрастающая последовательность

                if (newStart < start) {
                    newStart += step;
                }
                for (int i = newStart; i <= end; i += step) {

                    System.out.print(i + " ");
                }

            } else if (start >= end && step > 0) {         //убывающая последовательность

                if (newStart > start) {
                    newStart -= step;
                }
                for (int i = newStart; i >= end; i -= step) {

                    System.out.print(i + " ");
                }
            } else if (start <= end) {

                if (newStart < start) {
                    newStart -= step;

                }
                for (int i = newStart; i <= end; i -= step) {

                    System.out.print(i + " ");
                }

            } else {
                if (newStart > start) {
                    newStart += step;
                }
                for (int i = newStart; i >= end; i += step) {

                    System.out.print(i + " ");
                }
            }
        }
    }



}


