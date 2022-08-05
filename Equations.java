/** The <code>Equations</code> class provides the method to calculate the final result of
 * the equation using the double <code>firstEquationNumber</code>, enum <code>equationOperator</code>, and
 * double <code>secondEquationNumber</code>
 */
public class Equations {

    private final double firstEquationNumber;
    private final Operations equationOperator;
    private final double secondEquationNumber;
    private double equationResult;

    public Equations(double inputFirstEquationNumber, Operations inputEquationOperator, double inputSecondEquationNumber) {

        firstEquationNumber = inputFirstEquationNumber;
        equationOperator = inputEquationOperator;
        secondEquationNumber = inputSecondEquationNumber;
    }

    /** Constructs an equation depending on the enum value of <code>equationOperator</code> using the
     * <code>double</code> values of <code>firstEquationNumber</code> and <code>secondEquationNumber</code>,
     * and returns the calculated result of the constructed equation
     * @return <code>equationResult</code> - end result of the calculation
     */
    public double calculateEquationResult() {

        if(equationOperator == Operations.ADD) {
            equationResult = firstEquationNumber + secondEquationNumber;
        } else if (equationOperator == Operations.SUBTRACT) {
            equationResult = firstEquationNumber - secondEquationNumber;
        } else if (equationOperator == Operations.MULTIPLY) {
            equationResult = firstEquationNumber * secondEquationNumber;
        } else if (equationOperator == Operations.DIVIDE) {
            equationResult = firstEquationNumber / secondEquationNumber;
        } else if (equationOperator == Operations.MODULUS) {
            equationResult = firstEquationNumber % secondEquationNumber;
        } else if (equationOperator == Operations.POWER) {
            equationResult = Math.pow(firstEquationNumber, secondEquationNumber);
        } else if (equationOperator == Operations.ROOT) {
            equationResult = Math.pow(firstEquationNumber, (1/secondEquationNumber));
        } else {    // Sets equationResult to "9999" if equationOperation does not match supported values.
                    // Safeguards in place to ensure this does not happen
            equationResult = 9999;
        }

        return equationResult;
    }
}
