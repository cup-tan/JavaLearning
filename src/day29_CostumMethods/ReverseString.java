package day29_CostumMethods;

public class ReverseString {
//7. create a method that can reverse any given String
    public static void main(String[] args) {
        reverse("Aslihan");
    }


    public static void reverse(String str){
        String result = "";
        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);

    }

}
