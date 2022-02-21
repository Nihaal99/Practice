package DefaultPackage;

public class EmailApp {
    public static void main(String[] args) {
        Email eml=new Email("John","Smith");
        eml.setAlternateEmail("abc@gmail.com");
        System.out.println("Alternate email Id is: "+eml.getAlternateEmail());
        /*
         * Method calling for modifying properties(Line 11 & 12)
         */
        //eml.setMailboxCapacity(4000);
        //eml.changePassword("5643@mail");
        //System.out.println(eml.getPassword());
        System.out.println(eml.showInfo());


    }
}
