import java.util.ArrayList;
import java.util.List;

public class Epic extends Task{
    private List<SubTask> subTasksList;

    public Epic(String name, String description) {
        super(name, description);
        subTasksList = new ArrayList<>();
    }

    public List<SubTask> getSubTasksList() {
        return subTasksList;
    }
}
