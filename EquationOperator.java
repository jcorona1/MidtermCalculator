/** The <code>EquationOperator</code> class provides a method to parse a <code>String</code> into
 * a usable <code>enum</code> for the calculator
 */
public class EquationOperator {

    private Operations equationOperator;
    public static boolean isInvalid;

    /** Checks if <code>inputEquationOperator</code> matches <code>String</code> values for the <code>Operations</code>
     * enums and sets <code>equationOperator</code> equal to the respective <code>enum</code> value, otherwise parses
     * <code>inputEquationOperator</code> into a usable <code>enum</code>. Prints additional prompts
     * if <code>inputEquationOperator</code> throws an exception
     * @param inputEquationOperator the <code>String</code> input to be parsed into a usable <code>enum</code>
     */
    public void setEquationOperator(String inputEquationOperator) {

        if(inputEquationOperator.equals("+")) {
            equationOperator = Operations.ADD;
            isInvalid = false;
        } else if (inputEquationOperator.equals("-")) {
            equationOperator = Operations.SUBTRACT;
            isInvalid = false;
        } else if (inputEquationOperator.equals("*")) {
            equationOperator = Operations.MULTIPLY;
            isInvalid = false;
        } else if (inputEquationOperator.equals("/")) {
            equationOperator = Operations.DIVIDE;
            isInvalid = false;
        } else if (inputEquationOperator.equals("%")) {
            equationOperator = Operations.MODULUS;
            isInvalid = false;
        } else if (inputEquationOperator.equals("^")) {
            equationOperator = Operations.POWER;
            isInvalid = false;
        } else if (inputEquationOperator.equalsIgnoreCase("v")) {
            equationOperator = Operations.ROOT;
            isInvalid = false;
        } else {    // Sets isInvalid to "true" if inputEquationOperator does not match the above expected values
            isInvalid = true;
            System.out.println("\nI don't know that operation, \ncan I help you with a different one?");
        }
    }

    /** Returns an <code>enum</code> value parsed in the <code>setEquationOperator</code> method
     * @return <code>equationOperator</code> - parsed <code>enum</code> value
     */
    public Operations getEquationOperator() {
        return equationOperator;
    }
}
