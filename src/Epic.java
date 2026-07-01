import java.util.ArrayList;
import java.util.List;

public class Epic extends Task{
    private List<SubTask> subTaskList = new ArrayList<>();

    public Epic(String name, String description) {
        super(name, description);
    }

    public void addSubtask(SubTask subTask) {
        subTaskList.add(subTask);
        subTask.setEpic(this);
        System.out.println(subTask.getName() + " Добавлена подзадача в эпик");
    }

    public List<SubTask> getSubTaskList() {
        return subTaskList;
    }
}
