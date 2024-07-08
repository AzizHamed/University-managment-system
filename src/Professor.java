import java.util.HashSet;
import java.util.Set;

public class Professor extends Person {

    private Set<String> teachingCourses = new HashSet<>();
    public Professor(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getDetails() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(this.toString());
        stringBuilder.append("Teaching courses : {");
        stringBuilder.append(this.getTeachingCourses());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void assignCourse(String course){
        teachingCourses.add(course);
    }

    public void removeCourse(String course){
        teachingCourses.remove(course);
    }


    public String getTeachingCourses(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        teachingCourses.stream().forEach(s -> {
            stringBuilder.append(s);
            stringBuilder.append(", ");
        });

        stringBuilder.delete(stringBuilder.length()  - 2, stringBuilder.length());
        stringBuilder.append("]");
        return stringBuilder.toString();

    }
}
