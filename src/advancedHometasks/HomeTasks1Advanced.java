package advancedHometasks;

public class HomeTasks1Advanced {
    public static void main (String args[]) {
    //Task 1
        System.out.println("\nBeautiful picture: \n \n" +
                "____888888______________________________\n" +
                "____888888______________________________\n" +
                "___8888888888___________________________\n" +
                "__888888888888__________________________\n" +
                "__8888111188888_________________________\n" +
                "_888881111188888___11___________________\n" +
                "_8888811111188888_11____________________\n" +
                "_8888811111188888_11____________________\n" +
                "_8888811111118888_11____________________\n" +
                "_8888881111118888_11___11__8888888______\n" +
                "_8888881111118888__1__11__88888888888___\n" +
                "_8888888111111888____11__8888888888888__\n" +
                "__888888111111888_111___88888888888888__\n" +
                "__8888888111118881111__888881111118888__\n" +
                "___888888811188881111_8888811111111888__\n" +
                "____8888888188881111188888111111118888__\n" +
                "_____88888888888111118888111111118888___\n" +
                "______888888888111118888811111188888____\n" +
                "______8888888881111188888888888888______\n" +
                "_____888888888811111888888888888________\n" +
                "____88888888888111118888888888__________\n" +
                "___88881111888811111888888888___________\n" +
                "__8888111111888111118888888888__________\n" +
                "_888881111118881111188811118888_________\n" +
                "_8888881111888811111881111118888________\n" +
                "_8888888118888811111888111188888________\n" +
                "__888888888888_1111888881188888_________\n" +
                "___8888888888___111_8888888888__________\n" +
                "____88888888_____1___88888888___________\n" +
                "_____888888___________888888____________\n" +
                "_______________________8888_____________\n"
        );
        //Maths operators:

        int a = 20;
        int b = 5;
        int res1 = a + b;
        int res2 = a - b;
        int res3 = a * b;
        int res4 = a / b;
        int res5 = a % b;

        System.out.println("Сумма чисел: " + res1 + ", Вычитание чисел: " + res2 + ", Умножение: " + res3 + ", Деление: " + res4 + ", Остаток от числа: " + res5);

        if (a % 2 == 0)
            System.out.println("Число A четное");
            else {
                System.out.println("Число A нечетное");
            }
        if (b % 2 == 0)
            System.out.println("Число B четное");
        else {
            System.out.println("Число B нечетное \n");
        }
        //Task related to show emoji:

        String emoji ="\uD83D\uDE00";
        System.out.println(emoji);
        System.out.println(emoji.length());

        //Task about char to number, from number to char:
        char letter_b ='B';
        int devition = letter_b/2;
        System.out.println("\nDevition: "+devition);

        int opposite =88;
        char letter_opposite= (char) opposite;

        System.out.println("\nThe opoosite from number to char: "+letter_opposite+ "\n");

        //Task:

        for (int i=3; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("Поехали!\n");

        //The same task
        System.out.println(String.format("%s\n%s\n%s\nPoehaly!", "one","two", "three"));


    }
    }




