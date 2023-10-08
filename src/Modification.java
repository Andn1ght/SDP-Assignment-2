/**
 * The Modification interface represents a cyberware modification.
 * It defines methods to get a description and the cost of the modification.
 */
public interface Modification {

    /**
     * Gets a description of the modification.
     *
     * @return The description of the modification.
     */
    String getDescription();

    /**
     * Gets the cost of the modification.
     *
     * @return The cost of the modification.
     */
    double getCost();
}
