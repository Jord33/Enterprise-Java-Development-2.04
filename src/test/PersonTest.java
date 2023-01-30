package test;

class PersonTest {


    @Test
    void setAge_LessThanZero_Result() {

        Person person = new Person("", "", 1, "");

        assertThrows(IllegalArgumentException.class, () -> person.setAge(-1));
        person.setAge(15);
        assertEquals(15, person.getAge());
    }

}