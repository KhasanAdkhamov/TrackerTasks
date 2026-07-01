import java.util.List;

public class App {
    public static void main(String[] args) {
        ManagerTasks managerTasks = new ManagerTasks();
        managerTasks.createTask(new Task("phone", "buy tomorrow"));
        List<Task> listTasks = managerTasks.getListTasks();
        System.out.println(listTasks);
        Task task = managerTasks.getTask(1);
        System.out.println(task);
        managerTasks.deleteTasks();
        System.out.println(listTasks);
        //System.out.println(managerTasks.getListTasks());
        managerTasks.createTask(new Epic("house", "save up money"));
        System.out.println(managerTasks.getListTasks());


    }
}
