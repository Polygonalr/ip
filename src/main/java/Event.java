public class Event extends Task {
    protected String by;

    public Event(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toString() {
        return super.toString().replaceFirst("\\[T\\]", "[E]") + " (" + by.replaceFirst(" ", ": ") + ")";
    }
}