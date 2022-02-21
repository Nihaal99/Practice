package DefaultPackage;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private int passwordLength;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private int mailboxCapacity=500;
    private  String companySuffix="anycompany.com";

    //Constructor to recieve the firstname and last name
    /*
    * In this programme most of the properties(ie.variables) are set for the first time using constructor
    * Remaining properties are set using methods with the help of parameters
    * If one wants to modify the property then  methods are implemented for that purpose(eg.modification of password field)
    * */
    public Email(String firstName,String lastName) {
        /*
        Taking firstName and lastName as parameters from EmailAppduring object
        initialization and assigning it to class variables of Email Class
        */
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("The firstname is: "+this.firstName+" and lastname is: "+this.lastName);

        //Call a method asking for department to candidate -return the department
        this.department=setDepartment();
        System.out.println("Department is: "+this.department);
        //Calling a method to enable user to set random password length
        this.passwordLength=setPasswordLength();
        //Calling a method for generating random password
        this.password=generateRandomPassword(this.passwordLength);
        System.out.println("Generated random password is: "+this.password);
        //Combine elements to generate email
        this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+this.companySuffix;
        //System.out.println("Your company email is: "+this.email);
    }
    //ask user for department
    private String setDepartment(){
        System.out.println("Enter the department\n1 for Sales\n2 for Developement\n3 for Accounting\n4 for none\nEnter the department code:");
        Scanner scn=new Scanner(System.in);
        int deptChoice=scn.nextInt();
        if(deptChoice==1){
            return "sales";
        }else if(deptChoice==2){
            return "developement";
        }else if(deptChoice==3){
            return "accounting";
        }else{
            return "";
        }
    }
    private int setPasswordLength(){
        System.out.println("Enter the password length more than 5");
        Scanner scn=new Scanner(System.in);
        int enteredLength=scn.nextInt();
        if(enteredLength>5)
            return this.passwordLength=enteredLength;
        else{
            System.out.println("Error random password cannot be generated");
        }
          return -1;
    }
//Generating a random password
private String generateRandomPassword(int length){
   String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
   char[] password=new char[length];
   for(int i=0;i<length;i++){
       int randomNumber=(int)(Math.random()*passwordSet.length());
       password[i]=passwordSet.charAt(randomNumber);
   }
   return new String(password);
}
//Set the mailbox capacity
   /*
    * Instead of accessing and modifying the properties directly we are using methods to modify the class properties
    * This is the example of data hiding and encapsulation
    */
    public int setMailboxCapacity(int mailboxCapacity){
        return this.mailboxCapacity=mailboxCapacity;
    }
    //Set the alternate email id
    public String setAlternateEmail(String alternateEmail){
        return this.alternateEmail=alternateEmail;
    }
    //Change the password
    public String changePassword(String password){
        return this.password=password;
    }
    public String getAlternateEmail(){
        return this.alternateEmail;
    }
    public int getMailboxCapacity(){
        return this.mailboxCapacity;
    }
    public String getPassword(){
        return this.password;
    }
    public String showInfo(){
        return "DISPLAYNAME: "+firstName+" "+lastName+"\n"+
                "COMPANYEMAIL: "+email+"\n"+
                "MAILBOXCAPACITY: "+mailboxCapacity+" mb";
    }
}
