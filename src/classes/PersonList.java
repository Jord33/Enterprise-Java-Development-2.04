package classes;

public class PersonsList {
    private Person[] listOfPerson;

    public PersonsList(Person[] listOfPerson) {
        this.listOfPerson = listOfPerson;
    }

    public Person findByName(String name){

        for(int i = 0; i < listOfPerson.length; i++){
            if (listOfPerson[i].getName() == name){
                return listOfPerson[i];
            }
        }
        return null;
    }

    public Person[] getListOfPerson() {
        return listOfPerson;
    }

    public void setListOfPerson(Person[] listOfPerson) {
        this.listOfPerson = listOfPerson;
    }
}
