import java.util.ArrayList;
import java.util.List;

public class Module extends Content {
    private String name;

    public Module(String name) {
        this.name = name;
    }
    private List<Content> contents = new ArrayList<>();

    @Override
    public void add(Content content) {
        contents.add(content);
    }

    @Override
    public void remove(Content content) {
        contents.remove(content);
    }

    @Override
    public void display(int level) {
        System.out.println(spaceRepeat(level) + name);
        contents.forEach(content -> content.display(level + 2));
    }
}
