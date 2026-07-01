import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ManagerTasks {
    private Map<Integer, Task> taskMap = new LinkedHashMap<>();
    private Map<Integer, Epic> epicMap = new LinkedHashMap<>();
    private Map<Integer, SubTask> subTaskMap =new LinkedHashMap<>();

    public <T extends Task> List<T> getListTasks() {
        List<T> listTask = new ArrayList<>();
        if (taskMap.isEmpty() && epicMap.isEmpty() && subTaskMap.isEmpty()) {
            throw new NullPointerException("пока нет задач");
        }
        if (!taskMap.isEmpty()) {
            for (Task value : taskMap.values()) {
                listTask.add((T) value);
            }
        }
        if (!epicMap.isEmpty()) {
            for (Epic value : epicMap.values()) {
                listTask.add((T) value);
            }
        }
        if (!subTaskMap.isEmpty()) {
            for (SubTask value : subTaskMap.values()) {
                listTask.add((T) value);
            }
        }
        System.out.println(listTask);
        return listTask;
    }

    public void deleteTasks() {
        if (!taskMap.isEmpty()) {
            for (Integer i : taskMap.keySet()) {
                taskMap.remove(i);
            }
        }
        if (!epicMap.isEmpty()) {
            for (Integer i : epicMap.keySet()) {
                epicMap.remove(i);
            }
        }
        if (!subTaskMap.isEmpty()) {
            for (Integer i : subTaskMap.keySet()) {
                subTaskMap.remove(i);
            }
        }
        System.out.println(taskMap + " удален " + epicMap + " удален " + subTaskMap + " удален");
    }

    public <T extends Task> T getTask(int id) {
        if (taskMap.containsKey(id)) {
            return (T) taskMap.get(id);
        } else if (epicMap.containsKey(id)) {
            return (T) epicMap.get(id);
        } else if (subTaskMap.containsKey(id)) {
            return (T) subTaskMap.get(id);
        } else {
            throw new NullPointerException("id " + id + " не существует");
        }
    }

    public <T extends Task> T createTask(T task) {
        System.out.println("задача создана " + task.getName());
        if (task.getClass() == Task.class) {
            taskMap.put(task.getId(), task);
        } else if (task.getClass() == Epic.class){
            epicMap.put(task.getId(), (Epic) task);
        } else {
            subTaskMap.put(task.getId(), (SubTask) task);
        }
        return task;
    }

    //public Status updateStatus() {}

    public void deleteTask(int id) {
        if (taskMap.containsKey(id)) {
            taskMap.remove(id);
        } else if (epicMap.containsKey(id)) {
            epicMap.remove(id);
        } else if (subTaskMap.containsKey(id)) {
            subTaskMap.remove(id);
        } else {
            throw new NullPointerException("введен неверный id " + id);
        }
    }

}
