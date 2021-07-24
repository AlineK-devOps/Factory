package main;

import female.FemaleFactory;
import male.MaleFactory;

/** Управление фабриками **/

public class FactoryProducer {
    public static enum HumanFactoryType{ //тип фабрики
        MALE,
        FEMALE
    }

    public static AbstractFactory getFactory(HumanFactoryType type){ //получение типа фабрики
        AbstractFactory factory = null;
        switch (type){
            case MALE:
                factory = new MaleFactory();
                break;
            case FEMALE:
                factory = new FemaleFactory();
                break;
        }
        return factory;
    }
}
