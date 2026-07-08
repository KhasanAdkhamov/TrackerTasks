import java.util.List;

public class App {
    public static void main(String[] args) {
        ManagerTasks managerTasks = new ManagerTasks();
        managerTasks.createTask(new Task("phone", "buy tomorrow"));
        List<Task> listTasks = managerTasks.getListTasks();
        System.out.println(listTasks);
        Task task = managerTasks.getTask(1);
        System.out.println(task);
        System.out.println(listTasks);
        //System.out.println(managerTasks.getListTasks());
        managerTasks.createTask(new Epic("house", "save up money",
                List.of(new SubTask("to find good work", "tomorrow"),
                        new SubTask("to buy everything for house", "to talk about budjet"))));
        List<Task> listTasks2 = managerTasks.getListTasks();
        System.out.println(listTasks2);
        managerTasks.createTask(new Epic("car", "save up money",
                List.of(new SubTask("to find good work", "next month"),
                        new SubTask("to learn how to drive", "to talk about budjet"))));
        System.out.println(managerTasks.getListTasks());

    }
}
