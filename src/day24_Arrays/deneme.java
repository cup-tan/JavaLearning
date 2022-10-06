package day24_Arrays;

public class deneme {

    public static void main(String[] args) {



        String str = "banana";
        String nonDub ="";// ban
        String unique ="";


        for (int i =0; i <= str.length()-1; i++){
            String ch = ""+str.charAt(i);// b

            if (nonDub.contains(ch) ){ //ban
                continue;

            }else
            nonDub += ch;

        }

        String expectedResult = ""; //b1a3n2

        for (int j = 0;j<=nonDub.length()-1; j++) {

            char ch = nonDub.charAt(j);
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {

                    count++;
                }

            }
            if (count ==1){
                unique+= ch;

            }
            expectedResult += "" + ch + count;

        }
        System.out.println(unique);
        System.out.println(expectedResult);
    }
}
