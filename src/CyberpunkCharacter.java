public class CyberpunkCharacter {
    public static void main(String[] args) {
        Modification character;
        character = new ConcreteComponentHands();
        character = new ConcreteComponentLegs();

        System.out.println("Character: " + character.getDescription());
        System.out.println("Total Cost: $" + character.getCost());

        character = new GorillaHandsDecorator(character);
        character = new MantisHandsDecorator(character);
        character = new LynxPawsDecorator(character);
        character = new DoubleJumpDecorator(character);

        System.out.println("\nCharacter with Modifications: " + character.getDescription());
        System.out.println("Total Cost with Modifications: $" + character.getCost());
    }
}
