public class Task {
    private String name;
    private String description;
    private static int idCounter = 1;
    private final int id;
    private StatusTask status = StatusTask.NEW;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = idCounter++;
    }

    public StatusTask getStatus() {
        return this.status;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", status=" + status +
                '}';
    }
}
