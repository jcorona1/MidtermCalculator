/**
 * This class serves to receive a String input and set a boolean value
 * depending on the contents of said String
 */
public class PowerStates implements StateSettable{

    private boolean powerState;
    public static boolean isInvalid;

    /**
     * This method serves to receive String input from the console <code>inputState</code> and
     * sets boolean variable <code>powerState</code> to <code>true</code> if the String input corresponds with "on,"
     * and sets <code>powerState</code> to <code>false</code> if the String input corresponds with "off." This method
     * also contains boolean variable <code>isInvalid</code> which is set to false unless an unexpected input is
     * received through String <code>inputState</code>
     * @param inputState String input received through the console
     */
    @Override
    public void setState(String inputState) {

        if(inputState.equalsIgnoreCase("on")) {
            powerState = true;
            isInvalid = false;
        } else if (inputState.equalsIgnoreCase("off")){
            powerState = false;
            isInvalid = false;
        } else {
            isInvalid = true;   // Sets isInvalid to "true" if inputState contains an unexpected value
            System.out.println("\nI'm not sure what you mean, could you repeat that?");
        }

    }

    /** Returns a <code>boolean</code> value converted in the <code>setState</code> method
     * @return <code>powerState</code> - converted <code>boolean</code> value
     */
    @Override
    public boolean getState() {
        return powerState;
    }

}
