/**
 * The CyberpunkCharacter class is a driver class to demonstrate the use of cyberware modifications.
 */
public class CyberpunkCharacter {
    public static void main(String[] args) {
        Modification character;
        // Create a character with basic hands and legs
        character = new ConcreteComponentHands();
        character = new ConcreteComponentLegs();

        System.out.println("Character: " + character.getDescription());
        System.out.println("Total Cost: $" + character.getCost());

        // Upgrade hands and legs with cyberware modifications
        character = new GorillaHandsDecorator(character);
        character = new MantisHandsDecorator(character);
        character = new LynxPawsDecorator(character);
        character = new DoubleJumpDecorator(character);

        System.out.println("\nCharacter with Modifications: " + character.getDescription());
        System.out.println("Total Cost with Modifications: $" + character.getCost());
    }
}
