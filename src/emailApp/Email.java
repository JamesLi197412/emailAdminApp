package emailApp;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "personalcompany.com";
    private String email;

    // Constructor
    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = setPassword(defaultPasswordLength);

        // Combine elements to generate email
        email = firstName.toLowerCase()+"."+ lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    // Ask for the department
    private String setDepartment(){
        System.out.println("Please input Department Code" +
                "\n1 for Sales" +
                "\n2 for Development" +
                "\n3 for Accounting " +
                "\n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {return "Sales";}
        else if(depChoice == 2) {return "dev";}
        else if(depChoice == 3) {return "act";}
        else {return "" ;}

    }

    // Generate a random password
    private String setPassword(int length){

        String wordSet = "ABCDEFGHIJKLIMNOPQRSTUVWXYZ1234567890!@#%^&*";
        char[] password = new char[length];
        for (int i = 0; i <length; i++){
            int rand = (int) (Math.random() * wordSet.length());
            password[i] = wordSet.charAt(rand);
        }
        return new String(password);

    }
    //  Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternative email
    public void setAlternateEmail(String email){
        this.alternateEmail = email;
    }

    // Change the password
    public void setPassowrd(String password){
        this.password = password;
    }

    // Set up constructor method
    public int getMailboxCapacity(){ return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}

    public String showInfo(){
        return "Display Name: " + firstName + lastName +
                "Random Passowrd" + password +
                "Company Name (Organisation): " + email +
                "MAILBOX Capacity" + mailboxCapacity + "mb";
    }

}
