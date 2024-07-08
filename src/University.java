import java.util.HashMap;
import java.util.Map;

public class University {

    private static University instance = null;

    private Map<Integer, Person> personMap = new HashMap<>();

    private University(){

    }

    public static University getInstance(){
        if(instance==null)
            instance = new University();

        return instance;
    }


    public void addPerson(Person person){
        personMap.put(person.getId(), person);
    }

    public void removePerson(int personId){
        personMap.remove(personMap.get(personId));
    }


    public String getPersonDetail(int id){
        StringBuilder stringBuilder = new StringBuilder();
        Person person = personMap.get(id);
        if(person instanceof Student)
            stringBuilder.append("Student: ");
        else
            stringBuilder.append("Professor: ");
        stringBuilder.append(person.getDetails());
        return stringBuilder.toString();
    }

    public void printAllPeople(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        personMap.values().stream().forEach(person -> {
            if(person instanceof Student)
                stringBuilder.append("Student: ");
            else
                stringBuilder.append("Professor: ");
            stringBuilder.append(person.getDetails());
            stringBuilder.append("\n");
        });

        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length() );
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }
}
