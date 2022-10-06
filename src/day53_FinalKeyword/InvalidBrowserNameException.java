package day53_FinalKeyword;

public class InvalidBrowserNameException extends RuntimeException {

    public InvalidBrowserNameException() {
        super("Invalid Browser Name");
    }

    public InvalidBrowserNameException(String str){  // super class constructor , and super keyword
        super(str);
        System.out.println("Are you kidding");
    }

}



    class Test2{

        public static void main(String[] args) {
            String name = "batch20";

            switch (name.toLowerCase()){
                case "chrome" :
                    System.out.println("Chrome is selected");
                    break;

                case "firefox":
                    System.out.println("Fire fox is selected");
                    break;

                case "safari":
                    System.out.println("Safari is selected");
                    break;

                default:
                   throw new InvalidBrowserNameException("Please enter a valid browser name "); // custom exception better choice
                  //  throw new RuntimeException();
            }


          //  throw new InvalidBrowserNameException();


    }
}
