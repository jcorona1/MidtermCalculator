/** The <code>HelpStates</code> class provides a method to convert a <code>String</code> into
 * a usable <code>boolean</code> for the calculator, implementing the <code>StateSettable</code>
 * interface
 */
public class HelpStates implements StateSettable {

    private boolean helpState;
    public static boolean isInvalid;

    /** Converts <code>inputHelpState</code> into boolean <code>helpState</code> used to determine whether
     * to print out helpful prompts later in the program
     * <ul>
     *     <li>Sets <code>helpState</code> to <code>true</code> if <code>inputHelpState</code> contains
     *     "yes" or "y" while ignoring case</li>
     *     <li>Sets <code>helpState</code> to <code>false</code> if <code>inputHelpState</code> contains
     *      "no" or "n" while ignoring case</li>
     * </ul>
     * This method also contains boolean variable <code>isInvalid</code> which is set to false unless an
     * unexpected input is received through String <code>inputState</code>
     * @param inputState <code>String</code> input for <code>setState</code>
     */
    @Override
    public void setState(String inputState) {

        if(inputState.equalsIgnoreCase("yes") || inputState.equalsIgnoreCase("y")) {
            helpState = true;
            isInvalid = false;
        } else if(inputState.equalsIgnoreCase("no") || inputState.equalsIgnoreCase("n")) {
            helpState = false;
            isInvalid = false;
        } else {
            isInvalid = true;   // Sets isInvalid to "true" if inputState contains an unexpected value
            System.out.print("\nCould you say that again for me please?");
        }
    }

    /** Returns a <code>boolean</code> value converted in the <code>setState</code> method
     * @return <code>helpState</code> - converted <code>boolean</code> value
     */
    @Override
    public boolean getState() {
        return helpState;
    }
}
