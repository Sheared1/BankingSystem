import java.util.Scanner;

public class Session {

    Scanner scanner = new Scanner(System.in);


    public Session (){

        launchInitialPrompt();



    }

    public void launchInitialPrompt(){

        System.out.println("Type REGISTER to register, LOGIN to login. \n");

        String userInput = scanner.nextLine().trim();

        if (userInput.equalsIgnoreCase("REGISTER")){
            System.out.println("Beginning registration process... \n");
            startRegistrationProcess();
        }
        else if (userInput.equalsIgnoreCase("LOGIN")){
            System.out.println("Beginning login process... \n");
            startLoginProcess();
        }
        else if (!userInput.equalsIgnoreCase("LOGIN") && !userInput.equalsIgnoreCase("REGISTER")){
            System.out.println("Unrecognized command, please try again. \n");
            launchInitialPrompt();
        }

    }

    public void startRegistrationProcess(){
        System.out.println("Please enter a Username for the new customer account: \n");
        System.out.println("Please enter a Password for the new customer account: \n");
        //TODO INSERT INTO DB (ENCRYPT)
    }

    public void startLoginProcess(){
        System.out.println("Please enter your Username: \n");
        System.out.println("Please enter your Password: \n");
        //TODO READ FROM DB (DECRYPT)
    }

    public void goToLandingPage(){
        System.out.println("Launching the landing page... \n");
        //TODO MAKE LANDING PAGE AFTER LOGIN/REGISTRATION
    }
}
