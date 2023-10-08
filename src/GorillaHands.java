public class GorillaHands extends ModificationDecorator{

    public GorillaHands(Modification baseModification) {
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
