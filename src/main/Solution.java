package main;

import male.MaleFactory;

/** Точка входа в приложение **/

public class Solution {
    public static void main(String[] args) {
        Human human = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.MALE).getPerson(19);
        System.out.println(human);
    }
}
