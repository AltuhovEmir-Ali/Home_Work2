public class ProgrammingCourse extends Course implements Onsite,Online{
    public ProgrammingCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }

    @Override
    public void arrangeClassroom() {

    }

    @Override
    public void provideOnlineAccess() {
        System.out.println("Предоставление онлайн-доступа к курсу программирования");
    }

    @Override
    public void conductClass() {
        System.out.println("Проведение урока программирования");
    }
}
