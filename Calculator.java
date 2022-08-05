import java.util.Scanner;

/** A simple text-based calculator program with optional help prompts to
 * guide the user through the process
 * @author Julie Corona
 * @since 2022-08-05
 */
public class Calculator {

    /**
     * The main method that houses the <code>Calculator</code> code
     * @param args not used in this program
     */
    public static void main(String[] args) {

        // Instantiates the PowerStates, Scanner, and HelpStates classes for use later in the program
        PowerStates powerStates = new PowerStates();
        Scanner sc = new Scanner(System.in);
        HelpStates helpStates = new HelpStates();

        // Do-While loop used to ensure all prompts are printed at least once
        do {
            do {    // PowerStates prompt
                System.out.print("Type \"ON\" to power on, \nor \"OFF\" to power off: ");
                powerStates.setState(sc.nextLine());
            } while(PowerStates.isInvalid); // Checks if PowerStates received an invalid value

            // "true" - calculator is powered on
            if (powerStates.getState() == true) {
                do {    // Initial powered on message and prompt for additional help functionality
                    System.out.println("\nWelcome to the Midterm Calculator 7000! " +
                                       "\nWould you like some assistance entering " +
                                       "\nyour calculations today? 'YES'/'NO' ");
                    helpStates.setState(sc.nextLine());
                } while(HelpStates.isInvalid);  // Checks if HelpStates received an invalid value
                if(helpStates.getState() == true) { // "true" - help functionality is active, additional messages will print
                    System.out.println("\nNo problem! I will help walk you through " +
                                       "\nthe process of using the Midterm Calculator 7000 today.");
                    System.out.println("\nNow, just sit back and think of the equation " +
                                       "\nyou'd like to calculate today");
                }

                // Instantiates firstEquationNumber for storage of first number to be used in the calculation
                EquationNumber firstEquationNumber = new EquationNumber();
                do {    // Prints prompt for first equation number
                    System.out.print("Please enter first number: ");
                    firstEquationNumber.setEquationNumber(sc.nextLine());
                } while(firstEquationNumber.isInvalid); // Checks if firstEquationNumber received an invalid value

                // Additional help message listing valid equation operators
                if(helpStates.getState() == true) {
                    System.out.println("\nWhat kind of calculation would you like today?" +
                            "\nFor addition, use '+'" +
                            "\nFor subtraction, use '-'" +
                            "\nFor multiplication, use '*'" +
                            "\nFor division, use '/'" +
                            "\nFor modulo, use '%'" +
                            "\nFor exponents, use '^'" +
                            "\nFor roots, use 'v'");
                }
                // Instantiates EquationOperator for storage of the operator to be used in the calculation
                EquationOperator equationOperator = new EquationOperator();
                String inputOperator = "";  // Additional String create for ease of printing later
                do {    // Prints prompt for equation operator
                    System.out.print("Please enter operator: ");
                    inputOperator = sc.nextLine();
                    equationOperator.setEquationOperator(inputOperator);
                } while(EquationOperator.isInvalid);    // Checks if EquationOperator received an invalid value

                // Periodic message of encouragement
                if(helpStates.getState() == true) {
                    System.out.println("\nAlmost done!");
                }
                // Instantiates secondEquationNumber for storage of second number to be used in the calculation
                EquationNumber secondEquationNumber = new EquationNumber();
                do {    // Prints prompt for second equation number
                    System.out.print("Please enter second number: ");
                    secondEquationNumber.setEquationNumber(sc.nextLine());
                } while(secondEquationNumber.isInvalid);    // Checks if secondEquationNumber received an invalid value

                // Instantiates equation with firstEquationNumber, equationOperator, and secondEquationNumber
                Equations equation = new Equations(firstEquationNumber.getEquationNumber(),
                        equationOperator.getEquationOperator(), secondEquationNumber.getEquationNumber());
                if(helpStates.getState() == true) { // Message of encouragement
                    System.out.println("\nCongrats!!");
                }
                // Message printing equation calculated along with the calculated result
                System.out.printf("Your equation is: %.3f %s %.3f = %.3f \n\n", firstEquationNumber.getEquationNumber(),
                        inputOperator, secondEquationNumber.getEquationNumber(), equation.calculateEquationResult());
            } else {
                System.out.println("Goodbye! :)");  // Final message printed before calculator powers off
            }
        } while(powerStates.getState() == true);

        sc.close(); // Closes Scanner
    }
}
