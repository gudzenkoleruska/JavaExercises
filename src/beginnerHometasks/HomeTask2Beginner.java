package beginnerHometasks;


public class HomeTask2Beginner {
    public static void main(String[] args) {
        int number = 3;
        System.out.println("Task:" + number + "\n");

        char subtaskA = 'a';
        char subtaskB = 'b';
        char subtaskC = 'c';
        System.out.println("Task:" + ++number + subtaskA);

        int x = 10;
        int y = 15;
        int z = 20;

        int sum = x + y;
        int multiple = x * y;
        int diff = x - y;
        System.out.println("Вывести значения переменных в столбик: " + "\n" + x + "\n" + y + "\n" + z + "\n");
        System.out.println("Task:" + number + subtaskB);
        System.out.println("Вывести значения переменных в строку: " + "\t" + x + "\t" + y + "\t" + z + "\n");

        System.out.println("Task:" + number + subtaskC);
        System.out.println("Вывести значения этих переменных так, чтобы было понятно, какое значение к какой"
                + "переменной относится: \n" + "x = " + x + "\n" + "y = " + y + "\n" + "z = " + z + "\n");

        System.out.println("Task:" + ++number);
        System.out.println("Используя конкатенацию, вывести в строку через запятую значения переменных из задания 4: "
                + x + ", " + y + ", " + z + "\n");

        System.out.println("Task:" + ++number);
        System.out.println("Распечатать следующие выражения, где вместо … будет выведен результат арифметической "
                + "операции: \nSum of x and y = " + sum + "\nx * z = " + multiple + "\nРазность переменных "
                + "y и z = " + diff + "\n");

        System.out.println("Task:" + ++number);

        int apple = 40;
        int student = 6;
        int division = apple / student;
        int reminder = apple % student;
        System.out.println("Если " + apple + " яблок поделить на" + student + " учеников, то каждый ученик получит по "
                + division + "яблок(a), и " + reminder + " яблок(а) останется учителю.\n ");

        System.out.println("Task:" + ++number);
        int limon = 6;
        int apples = limon + 24;
        int pear = apples - 12;
        int summ = limon + apples + pear;
        System.out.println("Всего привезли в школу килограммов фруктов: " + summ);

        System.out.println("\nTask:" + ++number);
        int num1 = 35;
        int num2 = 7;
        int devide1 = num1 / num2;

        int num3 = 8;
        int num4 = 48;
        int devide2 = num3 / num4;

        int num5 = 54;
        int num6 = 6;
        int minus1 = num5 - num6;
        System.out.println("Число " + num1 + " больше числа " + num2 + " в " + devide1 + " раз.");

        System.out.println("\nTask:" + ++number + ".a");
        int num7 = 48;
        int num8 = 8;

        if (num7 % num8 == 0) {
            System.out.println("Число1 кратно числу2");
        } else {
            System.out.println("Число1 некратно числу2!");
        }
        System.out.println("\nTask:" + number + ".b");

        if (num7 % 2 == 0 && num8 % 2 == 0) {
            System.out.println("Оба числа четные");
        }
        if (num7 % 2 == 0 && num8 % 2 != 0) {
            System.out.println("Только 1е число четное, 2е число нечетное");
        }
        if (num7 % 2 != 0 && num8 % 2 == 0) {
            System.out.println("Только 2е число четное, 1е число нечетное");
        } else if (num7 % 2 != 0 && num8 % 2 != 0){
            System.out.println("Оба числа нечетные");
        }

        System.out.println("\nTask:" + ++number);

        double x1 = 7;
        double y1 = 18;
        double n1 = 3;
        double z1 = Math.pow(x1, n1);
        double rez = z1*((5*x1 + 7*y1)/(8*x1 + 10*y1))/((3*x1 - y1)/(x1 + y1));
        System.out.println("Result of Expression: "+rez);

        System.out.println("\nTask:" + ++number);

        int day = 5;
        int suit = 15;
        int suit_per_day = suit/day;
        int all_suit = 69;
        int all_days = all_suit/suit_per_day;
        System.out.println("Всего понадобится дней "+ all_days + " для реализации "+all_suit + " костюмов");

        System.out.println("\nTask:" + ++number);
        int a1 = 5;
        int b1 = 8;
        int c1 = 12;

        int summ1 = a1 + b1 + c1++;
        int sumABC = a1 +b1 + c1--;
        int diff1 = b1++ - sumABC;
        System.out.println("Сумма чисел: " + summ1);
        System.out.println("Разница чисел: " + diff1);

        //°C = (°F - 32) × 5/9
        System.out.println("\nTask:" + ++number);
        
        int f = 101;
        int c = (f -32) * 5/9;
        System.out.println("Если температурв в F равна " + f + " тогда температура в C равна " + c);

    }
}
