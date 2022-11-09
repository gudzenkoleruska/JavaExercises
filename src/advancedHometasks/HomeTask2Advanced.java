package advancedHometasks;

public class HomeTask2Advanced {
    public static void main(String[] args) {
      /*    Задача №1
    Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор
    и вывести следующие строки:
    a == b - если переменные равны
    a < b - если переменная a меньше b
    a > b - если переменная b меньше a*/

        System.out.println("Task1");
        int a = 10;
        int b = 20;
        if (a == b) {
            System.out.println("a == b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }
        System.out.println("\nTask2");
  /*    Задача №2
      Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор
      и вывести следующие строки:
      maybe a and b are even - если сумма переменных четная
      some variable is odd - если сумма переменных нечетная*/

        int a1 = 13;
        int b1 = 7;
        int summa = a1 + b1;

        if (summa % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
        System.out.println("\nTask3");
/*      Задача №3
      Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на
      ваш выбор и вывести следующие строки:
      больше 10 - если переменная больше 10
      меньше 100 - если переменная меньше 100
      результат деления на 2 больше 20 - если это соответствует истине
      значение переменной между 5 и 40 включительно - если это правда
      значение переменной меньше 5 или больше 40 - если предыдущие условие ложное*/

        int var = 55;

        if (var > 10) {
            System.out.println("переменная больше 10");
        }
        if (var < 100) {
            System.out.println("переменная меньше 100");
        }
        if (var / 2.0 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (var >= 5 && var <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
        System.out.println("\nTask4");

/*      Задача №4
      Необходимо вывести числа от 0 до 15.*/

        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }

        System.out.println("\nTask5");
      /*Задача №5
      Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
*/
        int number = 5;        // Возводимое в степень число
        int result = number;   // Результат возведения в степень
        int power = 1;         // Начальный показатель степени

        do {
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
            result = result * number;
        } while (result < 10000);

        System.out.println("\nTask6");

   /*   Задача №6
      Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
      Реализовать 2 варианта:
      использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
      без использования конструкции if (шаг цикла на ваше усмотрение).
*/

        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

    }
}












