package main;

import male.MaleFactory;

/** Точка входа в приложение **/

public class Solution {
    public static void main(String[] args) {
        MaleFactory maleFactory = new MaleFactory();
        System.out.println(maleFactory.getPerson(99));
        System.out.println(maleFactory.getPerson(4));
        System.out.println(maleFactory.getPerson(15));
    }
}
