/**
 * The LynxPawsDecorator class represents legs equipped with Lynx Paws for enhanced agility.
 * It extends the ModificationDecorator class.
 */
public class LynxPawsDecorator extends ModificationDecorator{
    public LynxPawsDecorator(Modification baseModification) {
        super(baseModification);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", equipped with Lynx Paws for enhanced agility";
    }

    @Override
    public double getCost() {
        return super.getCost() + 150.20;
    }
}
