package com.ironyard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sam on 10/18/16.
 */
public class Kata {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(5);
        ints.add(2);
        ints.add(3);
        ints.add(9);
        ints.add(6);

        boolean fL6 = Kata.firstLast6(ints);
        System.out.printf("Kata.firstLast6(%s) -> %s\n", ints, fL6);


        boolean sFL = Kata.sameFirstLast(ints);
        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", ints, sFL);


        List<Integer> two = new ArrayList<>(ints);

        Kata.rotateLeft3(ints);
        // two prints out original copy of list, ints prints out modified copy
        System.out.printf("Kata.rotateLeft3(%s) -> %s\n", two, ints);


        List<Integer> reverse = new ArrayList<>();
        reverse.add(5);
        reverse.add(2);
        reverse.add(3);
        reverse.add(9);
        reverse.add(6);

        List<Integer> rev = new ArrayList<>(reverse);

        Kata.reverse3(reverse);
        System.out.printf("Kata.reverse3(%s) -> %s\n", rev, reverse);


        List<Integer> sum = new ArrayList<>();
        sum.add(5);
        sum.add(2);
        sum.add(3);
        sum.add(9);
        sum.add(6);

        int sFP = Kata.sumFirstPenultimate(sum);
        System.out.printf("Kata.sumFirstPenultimate(%s) -> %s\n", sum, sFP);







    }



    

    public static boolean firstLast6(List<Integer> six) {

        if (six.get(0) == 6 || six.get(six.size() - 1) == 6) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean sameFirstLast(List<Integer> same) {

        if (same.size() >= 1 && same.get(0) == same.get(same.size() - 1)) {
            return true;
        } else {
            return false;
        }
    }


    public static void rotateLeft3(List<Integer> left) {
        int re = left.remove(0);
        left.add(left.size(), re);
    }


    public static void reverse3(List<Integer> rv3) {
        Collections.reverse(rv3);
    }


    public static int sumFirstPenultimate(List<Integer> sFP) {
        int sum = sFP.get(0) + sFP.get(sFP.size() - 2);
        int two = sFP.get(0);
        if (sFP.size() >= 2) {
            return sum;
        } else if (sFP.size() == 0) {
            return 0;
        }
        else {
            return two;
        }
    }






}
