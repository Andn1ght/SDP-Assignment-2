/**
 * The GorillaHandsDecorator class represents hands enhanced with Gorilla Hands cyberware modification.
 * It extends the ModificationDecorator class.
 */
public class GorillaHandsDecorator extends ModificationDecorator{

    public GorillaHandsDecorator(Modification baseModification) {
        super(baseModification);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", enhanced with Gorilla Hands";
    }

    @Override
    public double getCost() {
        return super.getCost() + 200.50;
    }
}
