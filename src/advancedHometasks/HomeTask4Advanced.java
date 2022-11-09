package advancedHometasks;

public class HomeTask4Advanced {
    public static void main(String[] args) {

        picture1();
        picture2();
        picture3();

        int a = 50;
        int b = 12;

        System.out.println(String.format("a = %s, b = %s, add = %d", a, b, add(a, b)));
        System.out.println(String.format("a = %s, b = %s, sub = %d", a, b, sub(a, b)));
        System.out.println(String.format("a = %s, b = %s, multiple = %d", a, b, multiple(a, b)));
        System.out.println(String.format("a = %s, b = %s, dev1 = %d", a, b, dev1(a, b)));
        System.out.println(String.format("a = %s, b = %s, dev2 = %f", a, b, dev2(a, b)));



    }

    private static void picture1() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void picture2() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 9 - i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void picture3() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 9 - i; j++){
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--){
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

/*  Задача №4
    Необходимо написать 4 метода:
    сложение 2х чисел
    вычитание 2х чисел
    умножение 2х чисел
    деление 2х чисел*/

    private static int add (int a, int b){
        return a + b;
    }

    private static int sub (int a, int b){
        return a - b;
    }

    private static int multiple (int a, int b){
        return a * b;
    }
    private static int dev1 (int a, int b){
        return a / b;
    }
    private static double dev2 (int a, int b){
        return 1.0 * a / b;
    }

}
