package female;

import main.AbstractFactory;
import main.Human;

/** Фабрика женщин XD **/

public class FemaleFactory implements AbstractFactory {
    public Human getPerson(int age){ //фабричный метод
        if (age <= KidGirl.MAX_AGE)
            return new KidGirl();

        else if (age <= TeenGirl.MAX_AGE)
            return new TeenGirl();

        else return new Woman();
    }
}
