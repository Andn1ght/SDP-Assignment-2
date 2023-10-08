/**
 * The ConcreteComponentLegs class represents basic legs with standard functionality.
 * It implements the Modification interface.
 */
public class ConcreteComponentLegs implements Modification{

    @Override
    public String getDescription() {
        return "Basic legs with standard functionality";
    }

    @Override
    public double getCost() {
        return 0.0;
    }
}
