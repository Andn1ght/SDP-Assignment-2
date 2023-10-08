public class MantisHandsDecorator extends ModificationDecorator{

    public MantisHandsDecorator(Modification baseModification) {
        super(baseModification);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", upgraded with Mantis Hands";
    }

    @Override
    public double getCost() {
        return super.getCost() + 450.30;
    }
}
