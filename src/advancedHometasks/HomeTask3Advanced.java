package advancedHometasks;

public class HomeTask3Advanced {

        public static void main(String[] args) {
/*      Задача №1
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести сумму всех значений массива.*/

            int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
            int summ = 0;

            for (int i = 0; i < array.length; i++) {
                summ += array[i];
            }
            System.out.println("Сумма всех значений: " + summ);
            System.out.println("_________________________________________________");

      /*  Задача №2
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести максимальное значение массива.*/

            int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
            int max = array1[0];

            for (int i = 0; i < array1.length; i++) {
                if (max < array1[i]) {
                    max = array1[i];
                }
            }
            System.out.println("Maximum value: " + max);
            System.out.println("_________________________________________________");

/*      Задача №3
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести минимальное значение массива.*/


            int min = array1[0];
            for (int i = 0; i < array1.length; i++) {
                if (min > array1[i]) {
                    min = array1[i];
                }
            }
            System.out.println("Minimum value: " + min);
            System.out.println("_________________________________________________");

/*      Задача №4
        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива.*/

            int summa = 0;
            int count = 0;
            double avg = 0;

            for (int i = 0; i < array1.length; i++) {
                summa += array1[i];
                count += i;
            }

            avg = summa * 1.0 / count * 1.0;
            System.out.println("Среднее арифметическое всех значений массива: " + avg);
            System.out.println("_________________________________________________");

   /*   Задача №5
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести сумму элементов массива.*/

            int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
            int sum3 = 0;

            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    sum3 += array2[i][j];
                }
            }
            System.out.println("Сумму элементов массивов: " + sum3);
            System.out.println("_________________________________________________");

 /*     Задача №6
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести максимальное значение массива.*/

            int maxx = array2[0][0];

            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    if (maxx < array2[i][j]) {
                        maxx = array2[i][j];
                    }
                }
            }
            System.out.println("Вывести максимальное значение массивов: " + maxx);
            System.out.println("_________________________________________________");
/*
        Задача №7
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести количество элементов в массиве.*/

            int counter = 0;

            for (int i = 0; i < array2.length; i++) {
                counter += array2[i].length;         //сложить 2 массива;
            }
            System.out.println("Количество элементов в массиве: " + counter);

            System.out.println("_________________________________________________");
 /*     Extra Задача №1
        Написать программу что выводит на печать круг картинкой. Любыми символами. Круг может быть овальный, пустой
        внутри или наполненный символами. При написании программы можно использовать любые доступные знания.*/

            int r = 20;
            for (int i = 0; i <= (r * 2); i = i + 2) {
                for (int j = 0; j <= (r * 2); j++) {
                    if ((j - r) * (j - r) + (i - r) * (i - r) <= r * r) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println("_________________________________________________");

            int n = 17;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || j == 1 || i == n || j == n)
                        System.out.print(" 1 ");
                    else if (i == 2 || j == 2 || i == n - 1 || j == n - 1)
                        System.out.print(" 2 ");
                    else if (i == 3 || j == 3 || i == n - 2 || j == n - 2)
                        System.out.print(" 3 ");
                    else if (i == 4 || j == 4 || i == n - 3 || j == n - 3)
                        System.out.print(" 4 ");
                    else if (i == 5 || j == 5 || i == n - 4 || j == n - 4)
                        System.out.print(" 5 ");
                    else if (i == 6 || j == 6 || i == n - 5 || j == n - 5)
                        System.out.print(" 6 ");
                    else if (i == 7 || j == 7 || i == n - 6 || j == n - 6)
                        System.out.print(" 7 ");
                    else if (i == 8 || j == 8 || i == n - 7 || j == n - 7)
                        System.out.print(" 8 ");
                    else if (i == 9 || j == 9 || i == n - 8 || j == n - 8)
                        System.out.print(" 9 ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }

    }




