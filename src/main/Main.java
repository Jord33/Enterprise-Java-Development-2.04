package main;

public class Main {
    public static void main(String[] args) {
        Person monica = new Person("001", "Monica Geller", 30, "Chef");
        Person rachel = new Person("002", "Rachel Green", 32, "Fashion");
        Person phoebe = new Person("003", "Phoebe Buffay", 31, "Massage");

        Person[] friends = {monica, rachel, phoebe};

        PersonsList friendsList = new PersonsList(friends);

        try{
            Person personFound = friendsList.findByName("Rachel");

            System.out.println(personFound.getName());
        } catch (NullPointerException e){
            System.out.println("ERROR: " + e.getMessage() + ". You must write the name correctly!");
        }
    }
}