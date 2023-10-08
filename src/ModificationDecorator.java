/**
 * The ModificationDecorator class is an abstract class that serves as the base class for concrete decorators.
 * It implements the Modification interface.
 */
abstract class ModificationDecorator implements Modification{

    private final Modification baseModification;

    public ModificationDecorator(Modification baseModification) {
        this.baseModification = baseModification;
    }

    @Override
    public String getDescription() {
        return baseModification.getDescription();
    }

    @Override
    public double getCost() {
        return baseModification.getCost();
    }
}
