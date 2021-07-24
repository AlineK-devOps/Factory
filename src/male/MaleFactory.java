package male;

import main.AbstractFactory;
import main.Human;

/** Фабрика мужчин XD **/

public class MaleFactory implements AbstractFactory {
    public Human getPerson(int age){ //фабричный метод
        if (age <= KidBoy.MAX_AGE)
            return new KidBoy();

        else if (age <= TeenBoy.MAX_AGE)
            return new TeenBoy();

        else return new Man();
    }
}
