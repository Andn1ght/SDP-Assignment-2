/**
 * The ConcreteComponentHands class represents basic hands with standard functionality.
 * It implements the Modification interface.
 */
public class ConcreteComponentHands implements Modification{

    @Override
    public String getDescription() {
        return "Basic hands with standard functionality";
    }

    @Override
    public double getCost() {
        return 0.0;
    }
}
