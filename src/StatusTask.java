public enum StatusTask {
    NEW("created"),
    IN_PROGRESS("processing"),
    DONE("completed");

    private final String name;

    StatusTask(String name) {
        this.name = name;
    }

    public StatusTask next() {
        StatusTask[] statusTasks = StatusTask.values();
        int currentStatus = this.ordinal();
        int i = (currentStatus + 1) % statusTasks.length;
        return statusTasks[i];

    }
}
