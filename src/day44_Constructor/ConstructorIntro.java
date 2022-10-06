package day44_Constructor;
/*
declear:

        Access-Modifier className(Parameters){
                statements;
        }
 */
public class ConstructorIntro {
    public ConstructorIntro(String arr){
        System.out.println("Hello "+arr);
        System.out.println("How are you "+arr);
    }
/*
Hello Muhtar
How are you Muhtar
Hello Dawud
How are you Dawud
Hello Zeliha
How are you Zeliha
 */

    public static void main(String[] args) {

       // ConstructorIntro obj1 = new ConstructorIntro(10);

      //   ConstructorIntro obj2 = new ConstructorIntro();

        ConstructorIntro obj3 = new ConstructorIntro("Muhtar"); // Hello Muhtar
        ConstructorIntro obj4 = new ConstructorIntro("Dawud");
        ConstructorIntro obj5 = new ConstructorIntro("Zeliha");
    }


}
