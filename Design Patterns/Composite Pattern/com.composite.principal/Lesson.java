public class Lesson extends Content{
    private String title;

    public Lesson(String title) {
        this.title = title;
    }

    @Override
    public void display(int level) {
        System.out.println(spaceRepeat(level) + title);
    }
}
