package day39_CustomClass;

public class DogPark {


    public static void main(String[] args) {
        //dogPark

     //  Dog dog1 = new Dog(); // single variable

        Dog[] dogPark = { new Dog()  ,  new Dog()  , new Dog(), new Dog(),  new Dog()  } ; // multiple variable
           //              0              1           2           3           4
// array size has already fixed

        dogPark[0].setDogInfo("Karaoglan","German Shepperd", "Medium", 6,"white");
        dogPark[1].setDogInfo("Roko", "Retriever","small",3,"Brown");
        dogPark[2].setDogInfo("Champ", "retriever","Medium",2,"Brown");
        dogPark[3].setDogInfo("Akbas","Anatolian Sheppard","small",4,"white");
        dogPark[4].setDogInfo("Grizzly", "Pitbull","Large",5,"Black");

        for (int i = 0; i <= dogPark.length -1; i++ ) {
         dogPark[i].getDogInfo();
     }

        System.out.println("=============================================");

        for(Dog eachDog : dogPark){
            eachDog.getDogInfo();
        }

        System.out.println("===============================================");
        String food = "treats";
        for (Dog eachDog: dogPark){
           eachDog.eat("food");
        }

        System.out.println("==============================================");
        String drink = "milk";
        for(Dog eachDog : dogPark){
            eachDog.drink("drink");
        }


        System.out.println("==============================================");
        //play
      for (Dog eachDog : dogPark){
          eachDog.play();
      }

        System.out.println("===============================================");
        // sleep
        for (Dog eachDog : dogPark){
            eachDog.sleep();
        }








    }
}
