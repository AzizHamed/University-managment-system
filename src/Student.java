import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student extends Person {

    private Set<String> enrolledCourses = new HashSet<>();
    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getDetails() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(this.toString());
        stringBuilder.append(" Enrolled courses : {");
        stringBuilder.append(this.getEnrolledCourses());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }


    public void enrollCourse(String course){
        enrolledCourses.add(course);
    }

    public void dropCourse(String course){
        enrolledCourses.remove(course);
    }

    public String getEnrolledCourses(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        enrolledCourses.stream().forEach(s -> {
            stringBuilder.append(s.toString());
            stringBuilder.append(", ");
        });


        stringBuilder.delete(stringBuilder.length() - 2 , stringBuilder.length());
        stringBuilder.append("]");

        return stringBuilder.toString();


    }
}
