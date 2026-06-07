import java.util.*;

public class ManagerTask <T extends Task>{
    private Map<Integer, T>  tasks;

    public ManagerTask() {}

    public List<T> getEntry(Map<Integer, T> tasks) {
        List<T> tasksValues = new ArrayList<>();
        for (T value : tasks.values()) {
            tasksValues.add(value);
        }
        return tasksValues;
    }

    public void deleteTasks(Map<Integer, T> tasks) {
        for (Integer key : tasks.keySet()) {
            tasks.remove(key);
        }
        System.out.println("tasks were deleted");
    }

    public T getTask(int id) {
        if (!tasks.containsKey(id)) {
            throw new NullPointerException("идентификатор не найден, попробуй другой");
        }
        return tasks.get(id);
    }


    public void createTask(Scanner scanner) {
        String nameOfTask = null;
        String description = null;
        System.out.println("Введите название задачи");
        nameOfTask = scanner.next();
        System.out.println("Введите описание");
        description = scanner.next();
        Task task = new Task(nameOfTask, description);
        System.out.println("Создана задача " + task.getId() + " " + task.getStatus() + " " + task.getName());
    }

    public void updateStatus() {
    }

    public void deleteTask() {
    }

    public void getSubtasksList() {
    }
}
