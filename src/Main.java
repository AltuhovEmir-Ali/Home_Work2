import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        courses.add(new ProgrammingCourse("Жава Программист", 40, "Alice"));
        courses.add(new DesignCourse("Графический ДизайнерР", 30, "Bob"));
        courses.add(new MathCourse("Матиматика", 50, "Emir"));
        courses.add(new LanguageCourse("Англиский язык", 20, "Diana"));

        for (Course course : courses) {
            course.startCourse();
            course.conductClass();

            if (course instanceof Online) {
                ((Online) course).provideOnlineAccess();
            }
            if (course instanceof Onsite) {
                ((Onsite) course).arrangeClassroom();
            }
        }
    }
}
