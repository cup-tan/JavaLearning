package day47_Encapsulations;

public class MyCredentials {

    public static void main(String[] args) {


        Credentials obj = new Credentials("Mike", 34); // existingConstructor ,so we create parameter

        //obj.userName = "cybertek";
        obj.setUserName("Cybertek");
        obj.setPassWord("Cybertek12345");

      //  System.out.println(obj.userName);
      //  System.out.println(obj.passWord);

        System.out.println(obj.getUserName());
        System.out.println(obj.getPassWord());

        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.companyName);


    }
}
