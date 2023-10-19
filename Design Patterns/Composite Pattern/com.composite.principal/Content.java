public abstract class Content {
    public void add(Content content) {
        throw new UnsupportedOperationException();
    }

    public void remove(Content content) {
        throw new UnsupportedOperationException();
    }

    public void display(int level) {
        throw new UnsupportedOperationException();
    }

    protected String spaceRepeat(int quantidade) {
        return " ".repeat(quantidade);
    }
}
