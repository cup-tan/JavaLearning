package day13_Scanner;
/*
2. write a program that can display the selected browser
            1.1  declare a String variable called browserName
            1.2  Assume that the valid browsers are: chrome, Firefox, opera, safari, edge
            1.3. if the browser name does not match with the valid browsers' names,
                    out put should be: Invalid Browser Name

        Do Not use: scanner, if statement, and ternary
 */
public class Browsers {

    public static void main(String[] args) {

      String browserName = "chrome";
      //boolean, long, double, float not accepted for switch statement
      switch (browserName){
          case "chrome":
              System.out.println("opening Chrome browser");
              break;

          case "firefox":
              System.out.println("opening Firefox browser");
              break;
          case "opera":
              System.out.println("opening Opera browser");
              break;
          case "safari":
              System.out.println("opening Safari browser");
              break;
          case "edge":
              System.out.println("opening Edge browser");
              break;
          default:
              System.out.println("invalid browser name");




      }


    }
}
