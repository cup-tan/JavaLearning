package day51_Exceptions.BrowsersTask;

public class ChromeBrowser extends WebDriver{// advantage of inherited is save memory definitely

    /*
    get(url), close()
     */
   @Override
   public void get(String url){
       System.out.println("Opening the "+url+" in the chrome browser");
   }

   public void close(){
       System.out.println("closing the chrome browser");
   }


}
