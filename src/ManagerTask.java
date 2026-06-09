import java.util.*;

public class ManagerTask <T extends Task>{
    private Map<Integer, T>  tasks = new HashMap<>();

    public ManagerTask() {}

    public void getMapTasks() {
        if (tasks.isEmpty()) {
            throw new NullPointerException("Пока нет задач");
        }
        System.out.println(tasks);

    }

    public void deleteTasks() {
        for (Integer key : tasks.keySet()) {
            tasks.remove(key);
        }
        System.out.println("tasks were deleted");
    }

    public void getTask(Scanner scanner) {
        System.out.println("Введите id задачи");
        int id = scanner.nextInt();
        if (tasks.containsKey(id)) {
            System.out.println(tasks.get(id));
        } else {
            throw new NullPointerException("нет такого " + id + " id задачи не найден");
        }
    }


    public void createTask(Scanner scanner) {
        String nameOfTask;
        String description;
        System.out.println("Введите название задачи");
        nameOfTask = scanner.nextLine();
        System.out.println("Введите описание");
        description = scanner.nextLine();
        Task task = new Task(nameOfTask, description);
        System.out.println("Создана задача " + task.getId() + " " + task.getStatus() + " " + task.getName());
        tasks.put(task.getId(), (T) task);
    }

    public void updateStatus() {

    }

    public void deleteTask() {
    }

    public void getSubtasksList() {
    }

}
