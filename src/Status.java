public enum Status {
    NEW("Created"),
    IN_PROGRESS("Processing"),
    DONE("Done");

    private final String name;

    Status(String name) {
        this.name = name;
    }

    public Status next() {
        Status[] values = Status.values();
        int ordinal = this.ordinal();
        int next = (ordinal + 1) % values.length;
        return values[next];

    }

    public String getName() {
        return name;
    }
}
