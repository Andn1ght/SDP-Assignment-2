public class DoubleJumpDecorator extends ModificationDecorator{
    public DoubleJumpDecorator(Modification baseModification) {
        super(baseModification);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", featuring Double Jump capability";
    }

    @Override
    public double getCost() {
        return super.getCost() + 100.0;
    }
}
