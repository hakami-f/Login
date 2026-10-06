import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        String domain = "";
        // Ask the user for First name, Last name and Company domain
        System.out.println("First name?");
        firstName = in.nextLine();
        System.out.println("Last name?");
        lastName = in.nextLine();
        System.out.println("Business domain name?");
        domain = in.nextLine();
        // Check if first name or last name is missing
       if (firstName.isEmpty()|| lastName.isEmpty()) {
            System.out.println("Error! First and/or last name is missing");
         
        }
        else {
        // Generate email and username
        GenerateEmail(firstName, lastName, domain);
        GenerateUsername(firstName, lastName);
        }

    }

    public static void GenerateEmail(String firstName,
            String lastName,
            String domain) {
        // Create the email address using first name, last name and domain
        String email = firstName + "." +
                lastName+ "@" + domain;
                email=email.toLowerCase();
                
        System.out.println(email);
    }

    public static void GenerateUsername(String firstName,
            String lastName) {

        // Take the first four characters of the first name
        String firstFour = firstName.substring(0, 4);
        // Take the last four characters of the last name
        String lastFour = lastName.substring(lastName.length() - 4);
        String userName = firstFour + lastFour;
        userName = userName.toLowerCase();

        System.out.println(userName);
    }

}
