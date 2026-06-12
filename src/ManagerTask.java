import java.util.*;

public class ManagerTask {
    private Map<Integer, Task>  tasks = new LinkedHashMap<>();
    private Map<Integer, Epic> epics = new LinkedHashMap<>();
    private Map<Integer, SubTask> subTasks = new LinkedHashMap<>();

    public ManagerTask() {}

    public void getMapTasks() {
        if (tasks.isEmpty() ) {
            throw new NullPointerException("Пока нет задач");
        }
        System.out.println(tasks);
        System.out.println(epics);
        System.out.println(subTasks);
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
        String subTaskName;
        String subTaskDescription;
        String yes = "да";
        String no = "нет";
        String yesOrNo;
        System.out.println("Введите название задачи");
        nameOfTask = scanner.nextLine();
        System.out.println("Введите описание");
        description = scanner.nextLine();
        System.out.println("Будут ли подзадачи? Ответ: Да или Нет?");
        yesOrNo = scanner.nextLine().toLowerCase();
        if (yesOrNo.equals(no)) {
            Task task = new Task(nameOfTask, description);
            System.out.println("Создана задача " + task.getId() + " " + task.getStatus() + " " + task.getName());
            tasks.put(task.getId(), task);
        } else if (yesOrNo.equals(yes)) {
            Epic epic = new Epic(nameOfTask, description);
            epics.put(epic.getId(), epic);
            System.out.println("Создана задача " + epic.getId() + " " + epic.getStatus() + " " + epic.getName());
            System.out.println("Введите название подзадачи");
            subTaskName = scanner.nextLine();
            System.out.println("Введите описание");
            subTaskDescription = scanner.nextLine();
            SubTask subTask = new SubTask(subTaskName, subTaskDescription);
            subTasks.put(subTask.getId(), subTask);
            epic.addSubtask(subTask);
            System.out.println("Добавлена подзадача " + subTask.getName() + " в " + subTask.getEpic());
            System.out.println("Добавить подзадачу? Ответ: Да или Нет?");
            yesOrNo = scanner.nextLine().toLowerCase();
            if (yesOrNo.equals(yes)) {
                System.out.println("Введите название подзадачи");
                subTaskName = scanner.nextLine();
                System.out.println("Введите описание");
                subTaskDescription = scanner.nextLine();
                SubTask subTask2 = new SubTask(subTaskName, subTaskDescription);
                epic.addSubtask(subTask2);
                System.out.println("Добавлена подзадача " + subTask.getName() + " в " + subTask.getEpic());
                epics.put(epic.getId(), epic);
            } else if (yesOrNo.equals(no)) {
                epics.put(epic.getId(), epic);
            }
        }

    }

    public void updateStatus() {

    }

    public void deleteTask() {
    }

    public void getSubtasksList() {
    }

}
