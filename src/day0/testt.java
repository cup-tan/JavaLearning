package day0;

import java.util.Arrays;

public class testt {

    public static void main(String[] args) {
        helloPrint5X(5);
        age(1993,2021);
    }


    public static void helloPrint5X(int numberOfTimes){
        for (int i = 0; i < numberOfTimes; i++){
            System.out.println("hello");
        }
    }

    public static void age(int birthday, int currentYear){
        if (currentYear < birthday){
            System.out.println("invalid year");
        }else{
            int age = currentYear - birthday;
            System.out.println("you are "+age+" years old");
        }
    }




}

