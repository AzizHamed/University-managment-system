public class Main {
    public static void main(String[] args) {
        University university = University.getInstance();

        Student student1 = new Student(1, "Alice", "alice@example.com");
        student1.enrollCourse("Math 101");
        student1.enrollCourse("Physics 101");

        Professor professor1 = new Professor(2, "Dr. Smith", "smith@example.com");
        professor1.assignCourse("Math 101");

        university.addPerson(student1);
        university.addPerson(professor1);

        university.printAllPeople();
        System.out.println(university.getPersonDetail(1));
    }
}