public abstract class Course {
    private String title;
    private int duration;
    private String instructor;

    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }

    public String getInstructor() {
        return instructor;

    }

    public Course(String title, int duration, String instructor) {
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }
    public void startCourse(){
        System.out.println(" Курсы " + title + " Начинается ");
    }
    public abstract void conductClass();
}
