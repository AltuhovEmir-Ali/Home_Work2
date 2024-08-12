public class LanguageCourse  extends  Course{
    public LanguageCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }
    @Override
    public void conductClass() {
        System.out.println("Проведение урока языка");
    }
}

