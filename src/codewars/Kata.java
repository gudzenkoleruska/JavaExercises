package codewars;

public class Kata {
    public static String noSpace(final String x){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < x.length(); i++){
            if(x.charAt(i) != ' '){
                stringBuilder.append(x.charAt(i));
            }
        }
    return stringBuilder.toString();
    }
}
