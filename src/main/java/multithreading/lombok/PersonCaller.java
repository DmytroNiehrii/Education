package multithreading.lombok;

/**
 * Created by dmitriyn on 5/24/16.
 */
public class PersonCaller {
    public static void main(String[] args) {
        /*PersonEntity.PersonEntityBuilder personBuilder = PersonEntity.builder()
                .name("Bill")
                .age(11);*/


        PersonEntity person1 = new PersonEntity("Bill", 21);


        System.out.println(person1);
        person1.run();



    }
}
