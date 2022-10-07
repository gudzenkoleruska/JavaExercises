package beginnerHometasks;

public class Hometask1Beginner {
    public static void main(String args[]) {
        String today = "Tue, ";
        String today_date= "Aug 30 ";
        int temp1_day = 30;
        int temp1_night =25;
        String description_weather1 ="Moderate rain";

        String tomorrow = "Wed, ";
        String tommorow_date= "Aug 31";
        int temp2_day = 33;
        int temp2_night =26;
        String description_weather2 ="Overcast clouds";
        String city = "Dallas County, US: ";

        System.out.println("The weather in " + city +"\n\n" +
                today + today_date+"          "+temp1_day +"°C" + "/"+ temp1_night+"°C"+ "          "+description_weather1+ "\n"+
                tomorrow +tommorow_date+"           "+temp2_day+"°C" + "/"+temp2_night+"°C"+ "          "+description_weather2

        );
    }
}