package beginnerHometasks;

public class HomeTask4Beginner {
    public static void printTask(int numberTask) {
        System.out.println("\n************ " + "TASK Number: " + numberTask + " ************");
    }

    public static void getTemp(int temp) {
        System.out.println("Температура в Цельсиях: " + temp);
        System.out.println("Температура в Фаренгейтах : " + (temp * 1.8 + 32));
    }

    public static void printExpressions(double k, double l, double m){
        double res1 = k / l;
        double res2 = k % l;

        double res3 = k / m;
        double res4 = k % m;

        System.out.println("Результат деления "+ k + " на "+ l + " = " + res1 + ", а остаток от деления " + res2);
        System.out.println("Результат деления "+ k + " на "+ m + " = " + res3 + ", а остаток от деления " + res4);

    }

    public static void calculateSpeedAverage (int distance, int time){
        double speedAverage = distance / time;
        System.out.printf(
                "Средняя скорость авто %s км/час при пройденном расстоянии %d за время %d" , speedAverage, distance, time);
    }

    public static void checkShort(short numb) {
        if (numb / 100000 == 0) {
            System.out.println(numb + " It’s a five-digit number.");
        } else if (numb / 10000 == 0) {
            System.out.println(numb + " It’s a four-digit number.");
        } else if (numb / 1000 == 0) {
            System.out.println(numb + " It’s a three-digit number.");
        } else if (numb / 100 == 0) {
            System.out.println(numb + " It’s a two-digit number.");
        }else if (numb / 10 == 0){
            System.out.println(numb + " It’s a one-digit number");
        }else{
            System.out.println("Number is not valid");
        }
    }

    static public void main(String[] args) {
        printTask(3);

//        Записать в виде кода следующие логические выражения:
//        1) (2 = 2) И (7 = 7);
//        2) Не(15 < 3);
//        3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
//        4) Не("Сосна" = "Дуб");
//        5) (Не(15 < 3)) И (10 > 20);
//        6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
//        7) (6/2 = 3) ИЛИ (7*5 = 20)

        System.out.println((2 == 2) && (7 == 7));
        System.out.println(!(15 < 3));
        System.out.println(("Сосна".equals("Дуб")) || ("Вишня".equals("Клён")));
        System.out.println(!("Сосна" == "Дуб"));
        System.out.println((!(15 < 3)) && (10 < 20));
        System.out.println((6 / 2 == 3) || (7 * 5 == 20));

        printTask(4);

//        Записать в виде кода следующие выражения:
//        а) Света младше Андрея и Наташи
//        б) На полке стоят учебники, а на столе лежат справочники.
//        в) БОльшая часть детей — девочки. Остальные - мальчики.
//“Водительские права можно получить, только когда исполнится 16 лет.”
//”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”

        int ageAnd = 15;
        int ageSveta = 13;
        int ageNat = 17;
        System.out.println((ageSveta < ageAnd) && (ageSveta < ageNat));

        String book1 = "На полке стоят учебники";
        String book2 = "на столе лежат справочники";
        System.out.println((book1 == book1) && (book2 == book2));

        printTask(5);
        int girls = 15;
        int boys = 5;
        if (girls > boys) {
            System.out.println("БОльшая часть детей — девочки. Остальные - мальчики");
        } else {
            System.out.println("Мальчиков больше, чем девочек");
        }
        printTask(6);

        int ageDriver = 15;
        if (ageDriver >= 16) {
            System.out.println("Водительские права можно получить");
        } else {
            System.out.println("Права получить нельзя");
        }

        printTask(8);
//        Проверить число x, которое может принимать значения 10, 12, -3, 5 и 0.
//        Если x больше 10, то вывести на печать “x больше 10”.
//        Если x меньше нуля, то вывести на печать “x - отрицательное число”
//        Если x = 5, то вывести на печать “Разность x и 5 равна 0”
//        Иначе вывести на печать “Число x меньше 11, больше или равно 0, но не равно 5”. Проверить, соответствует ли последнее утверждение всем предыдущим утверждениям.

        int x = 10;
        if (x > 10) {
            System.out.println("x больше 10");
        } else if (x < 10) {
            System.out.println("x - отрицательное число");
        } else if (x == 5) {
            System.out.println("Разность x и 5 равна 0");
        } else {
            System.out.println("Число x меньше 11, больше или равно 0, но не равно 5");
        }

        printTask(9);
//        Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
//        Выведите результат работы алгоритма на печать.Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
        int num = 4;
        if (num % 2 == 0) {
            System.out.println("Число четное и удвоенное" + num * 2);
        } else {
            System.out.println("Число нечетное, возводим в квадрат: " + num * num);
        }
        printTask(11);
//        Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
//        5 - выдать похвальную грамоту и перевести в следующий класс
//        4 - перевести в следующий класс
//        3 - дать задание на лето и перевести в следующий класс
//        2 - вызвать родителей и оставить в текущем классе на второй год

        int grade = 2;
        if (grade == 5) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс");
        } else if (grade == 4) {
            System.out.println("перевести в следующий класс");
        } else if (grade == 3) {
            System.out.println("дать задание на лето и перевести в следующий класс");
        } else {
            System.out.println("вызвать родителей и оставить в текущем классе на второй год");
        }
        printTask(12);
//        Напишите метод, который примет на вход температуру в Цельсиях, и распечатает результат температуры в Цельсиях
//        и в Фаренгейтах.
        getTemp(28);

        printTask(13);
//        Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает числа, которые делятся на 3 без
//        остатка, и вычитает числа, которые делятся на 5 без остатка. ПРограмма выводит на печать результат вычислений.
//        Программа умножает числа, которые делятся на 2 без остатка, но если хотя бы одно число отрицательное, программа
//        умножает результат действия на (-1). ПРограмма выводит на печать результат вычислений.Если числа не прошли ни
//        одну проверку, программа выводит на печать ошибку о невозможности произвести действия.

        int number1 = 1;
        int number2 = 1;
        int result;

        if ((number1 % 3 == 0) && (number2 % 3 == 0)) {
            result = number1 + number2;
            System.out.println("Программа складывает числа: " + result);
        } else if ((number1 % 5 == 0) && (number2 % 5 == 0)) {
            result = number1 - number2;
            System.out.println("Программа вычитает числа: " + result);
        } else if ((number1 % 2 == 0) && (number2 % 2 == 0)) {
            if ((number1 < 0) || (number2 < 0)) {
                result = number1 * number2 * (-1);
            } else {
                result = (number1 * number2);
            }
            System.out.println("Программа умножает числа: " + result);
        } else{
            System.out.println("Numbers are invalid");
        }
        printTask(14);
//        Распечатать следующие выражения, используя метод и параметры k, l, m
        printExpressions(10.5, 3, 5.5);

        printTask(15);
//        В клетке находятся фазаны и кролики. Известно, что у них 35 голов и 94 ноги. Узнайте число фазанов и число
//    кроликов.
        int heads = 35;
        int legs = 94;

        int rabbits = 0;
        int fazans = 0;

        if(heads * 2 > 0){
            System.out.println("35 * 2 =  " + heads * 2);
        }if(heads * 2 == 70 && legs - 70 > 0){
            System.out.println("94 - 70 = " + (legs - 70));
        }if(legs - 70 >= 24){
            rabbits = 24 / 2;
            System.out.println("Кроликов в клетке: "+ rabbits);
        }if (heads - 12 > 0 ){
            fazans = heads - 12;
            System.out.println("Фазанов в клетке: "+ fazans);
        }
        //Test
        int expectedRabbits = 12;
        int expectedFazan = 23;

        if ((rabbits == expectedRabbits) && (fazans == expectedFazan)) {
            System.out.println("Тест пройден");
        }else {
            System.out.println("Тест провалился");
        }

        printTask(16);
        calculateSpeedAverage(100, 30);

        printTask(19);
        checkShort((short) -300);



        }

    }




