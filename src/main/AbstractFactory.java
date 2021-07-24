package main;

/** Интерфейс фабрики **/

public interface AbstractFactory {
    Human getPerson(int age);
}
