package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'A', 'B', 'B', 'C'));

        System.out.println(list); //  [A, A, B, B, C]

        ArrayList<Character> nonDub = new ArrayList<>(); // {A, B, C}

        for (Character each : list) {

            if (!nonDub.contains(each)) {
                nonDub.add(each);

            }


        }
    }}
