package day62_maps;

public class Test {

    public static void main(String[] args) {


        //  String favoriteColor = "Pink";


        Color favoriteColor = Color.Red;

        System.out.println(favoriteColor);

     //  String browserName =

      // Browser browserName = Browser.firefox;

        Browser browserName = Browser.chrome;

        switch (browserName){
            case chrome:
                System.out.println("Chrome browser is set");
                break;

            case firefox:
                System.out.println("Firefox browser is set");

            case safari:
                System.out.println("Safari browser is set");

            case edge:
                System.out.println("Edge browser is set");
                break;
        }

        System.out.println("=================================");

        Day day = Day.Mon;
        Day day2 = Day.Thu;
        Day day3 = Day.Tue;

        Month month1 = Month.Jan;

        Level level1 = Level.Low;
        Level level2 = Level.Medium;
        Level level3 = Level.High;
        Level level4 = Level.ChuckNorries;
        //  Level level5 = Level.Khabib; // this level is not exist enum








    }










}
