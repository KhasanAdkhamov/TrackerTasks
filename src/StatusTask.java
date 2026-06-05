public enum StatusTask {
    NEW("created"),
    IN_PROGRESS("processing"),
    DONE("completed");

    private final String name;

    StatusTask(String name) {
        this.name = name;
    }

}
