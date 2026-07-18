package day27.discussion;

public class View {

    public static void displayAllStudents(Repository repository) {
        for (Student student : repository.getStudents()) {
            System.out.println(student);
        }
    }
}
