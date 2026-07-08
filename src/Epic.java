import java.util.ArrayList;
import java.util.List;

public class Epic extends Task{
    private List<SubTask> subTaskList = new ArrayList<>();

    public Epic(String name, String description, List<SubTask> subTasks) {
        super(name, description);
        addSubtask(subTasks);
    }

    public void addSubtask(List<SubTask> subTasks) {
        for (SubTask subTask: subTasks) {
            subTaskList.add(subTask);
            subTask.setEpic(this);
            System.out.println(subTask.getName() + " Добавлена подзадача в эпик");
        }

    }

    public List<SubTask> getSubTaskList() {
        return subTaskList;
    }
}
