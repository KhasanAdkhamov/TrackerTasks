import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    public void createTask() {
    }

    public void updateStatus() {
    }

    public void deleteTask() {
    }

    public void getSubtasksList() {
    }
}
