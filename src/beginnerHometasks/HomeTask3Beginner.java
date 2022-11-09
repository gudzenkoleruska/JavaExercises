package beginnerHometasks;

public class HomeTask3Beginner {
    static public void main (String[] args) {
        int number = 2;
        System.out.println("Task:" + number + "\n");

        int k = 5;
        int l = 10;
        int m = 15;

        String line = "\t________________________________________________________________________________\n";
        String vLine = "\t|\t";
        String endLine = "\t|";
        String tab = "\t";

        System.out.println(
                line
                        + vLine + tab
                        + vLine + "+10"
                        + vLine + "-5"
                        + vLine + "*100"
                        + vLine + "/2"
                        + vLine + "%2"
                        + vLine + "^2"
                        + vLine + "++"
                        + vLine + "--"
                        + endLine
        );
        System.out.print(
                line
                        + vLine + "k = " + k
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100) + " "
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)
                        + vLine + (k--)
        );

        k--;

        System.out.println(vLine + k + endLine);

        k = l;

        System.out.print(
                line
                        + vLine + "l = " + l
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100)
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)
                        + vLine + (k--)
        );

        k--;

        System.out.println(vLine + k + endLine);

        k = m;

        System.out.print(
                line
                        + vLine + "m = 15"
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100)
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)
                        + vLine + (k--)
        );

        k--;
        System.out.println(vLine + k + endLine);
        System.out.println(line);

        System.out.println("Task:" + ++number + "\n");
        byte a = -127;
        byte b = 127;

        short s = 32767;
        short t = s ;

        long phonenumber = 18009998877L;
        float num1 = 100.101101F;
        double num2 = 100.101101;

        float ff = 10 / 3;
        double dd = 10 / 3;
        System.out.println(ff);
        System.out.println(dd);

        System.out.println("\nTask:" + ++number + "\n");

        Float f1 = 100.101101F;
        Float f2 = 150.101101F;

        float floatSum = f1 + f2;
        float floatSub = f1 - f2;
        float floatProduct = f1 * f2;
        float floatQuotient = f2 / f1;
        float floatRemainder = f2 % f1;

        System.out.println("Sum: "+ floatSum
                +"\nSubstruction: " + floatSub
                +"\nMultiply: " + floatProduct
                +"\nQuotient: " + floatQuotient
                +"\nReminder: " + floatRemainder);

        System.out.println("\nTask:" + ++number + "\n");

        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        double t4 = - 505.505;
        int t5 = 100100;
        long t6 = 100010001000L;
        float t7 = 2.66666666666666F;
        double t8 = - 1000000.001;
        short t9 = 1010;

        System.out.println("\nTask:" + ++number + "\n");

        Integer numm1 = 1000;
        Integer numm2 = 1200;
        System.out.println("Если num1 равно  num2, то результат сравнения методом .equals() = " + numm1.equals(numm2));

        System.out.println("\nTask:" + ++number + "\n");

        int number1 = 500;
        int number2 = 800;

        int compare = Integer.valueOf(number1).compareTo(number2);

//        System.out.println("Какое число будет больше: " + Integer.valueOf(number1).compareTo(number2));

        if (compare == 0){
            System.out.println("Если number1 = number2, то результат сравнения методом ==  " + compare);
        } else if (number1 > number2){
            System.out.println("Если number1 > number2, то результат сравнения будет " + compare);
        } else {
            System.out.println("Если number1 < number2, то результат сравнения будет " + compare);
        }

        System.out.println("\nTask:" + ++number + "\n");
        //Создать переменную типа Float, присвоить ей значение 234.9999, распечатать значение переменной в int

        Float fl = 234.9999F;
        int new_fl = fl.intValue();
        System.out.println(new_fl);

        System.out.println("\nTask:" + ++number + "\n");
        //С помощью метода sum() класса Double посчитать сумму двух переменных типа double.

        Double dd1 = 5.5;
        Double dd2 = 10.25;

        int ddd1 = dd1.intValue();
        int ddd2 = dd2.intValue();

        System.out.println("Сумма 2х Double: " + Double.sum(dd1,dd2));
        System.out.println("Сумма 2х Integer: "+ Integer.sum(ddd1,ddd2));

        System.out.println("\nTask:" + ++number + "\n");

        Short short1 = 12000;
        Short short2 = 12300;
        short diff = (short) (short1 - short2);
        System.out.println("Разница между числами: "+ diff);

        System.out.println("\nTask:" + ++number + "\n");

        String str1 = "123.56";
        String str2 = "123.55";

        double strdiff = Double.parseDouble(str1) - Double.parseDouble(str2);
        System.out.println("Разница String: " + strdiff);

        Double doub1 = 123.56;
        Double doub2 = 123.55;

        double doublediff = doub1 - doub2;
        System.out.println("Разница Double: " + Double.compare(strdiff,doublediff));

        System.out.println("Maximum value: " + Double.max(doub1,doub2));
        System.out.println("Minimum value: " + Double.min(doub1,doub2));

        System.out.println("\nTask:" + ++number + "\n");

        Integer n = 10;
        double n1 = n.doubleValue();
        n1 = 10.999999999;
        System.out.println("“Переменная n может принимать значения: " + n1);

        System.out.println("\nTask:" + ++number + "\n");

        Integer numberInteger = 100;
        String strnum = numberInteger.toString();

        int summ = numberInteger + 10;
        String concat = strnum + 10;

        System.out.println("Число:" + summ);
        System.out.println("String:" + concat);

    }
}






