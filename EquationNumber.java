/** The <code>EquationNumber</code> class provides a method to parse a <code>String</code> into
 * a usable <code>double</code> for the calculator
 */
public class EquationNumber {

    private double equationNumber;
    public boolean isInvalid;

    /** Checks if <code>inputEquationNumber</code> matches <code>String</code> values for Pi or e and sets
     * <code>equationNumber</code> equal to the respective <code>double</code> value, otherwise parses
     * <code>inputEquationNumber</code> into a usable <code>double</code>. Prints additional prompts
     * if <code>inputEquationNumber</code> throws an exception
     * @param inputEquationNumber the <code>String</code> input to be parsed into a usable <code>double</code>
     */
    public void setEquationNumber(String inputEquationNumber) {
        try {
            if (inputEquationNumber.equalsIgnoreCase("pi")) {
                equationNumber = Math.PI;
                isInvalid = false;
            } else if (inputEquationNumber.equalsIgnoreCase("e")) {
                equationNumber = Math.E;
                isInvalid = false;
            } else {
                equationNumber = Double.parseDouble(inputEquationNumber);
                isInvalid = false;
            }

        } catch(NullPointerException e) {
            isInvalid = true;   // Sets isInvalid to "true" if inputEquationNumber is null
            System.out.println("\nI couldn't hear that one, what was that?");
        } catch (NumberFormatException e) {
            isInvalid = true;   // Sets isInvalid to "true" if inputEquationNumber cannot be converted into a double
            System.out.println("\nThat doesn't seem like a number, try again?");
        }
    }

    /** Returns a <code>double</code> value parsed in the <code>setEquationNumber</code> method
     * @return <code>equationNumber</code> - parsed <code>double</code> value
     */
    public double getEquationNumber() {
        return equationNumber;
    }

}
