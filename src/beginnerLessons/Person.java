package beginnerLessons;


import java.sql.SQLOutput;

public class Person {
    public static void main (String args[]){
        int a = 10;
        int b = 20;
        int s = 100;
        int t = s;
        int yob = 1994;
        int currentYear =2022;
        int difference = currentYear -yob;

        String myNameInSlack ="Valeriia Hudzenko";
        System.out.println("Variable: "+ t + "\nMyNameInSlack: "+myNameInSlack);
        System.out.println("\nЕсли человек родился в "+ yob+ " году,то его возраст: "+difference );

        int yob1=yob+1;
        int last2Year=currentYear-2;
        int difference1=last2Year-yob1;
        System.out.println("\nЕсли человек родился в "+ yob1+ " году,то его возраст 2 года назад был: "+difference1);
    }

}
