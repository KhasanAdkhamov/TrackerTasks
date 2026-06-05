import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerTask<Task> managerTask = new ManagerTask<>();

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            switch (command) {
                case 0 ->  {
                    System.out.println("exit");
                    scanner.close();
                    return;
                }
                case 1 -> {
                    managerTask.getEntry();
                }
                case 2 -> {
                    managerTask.deleteTasks();
                }
                case 3 -> {
                    managerTask.createTask();
                }
                case 4 -> {
                    managerTask.updateStatus();
                }
                case 5 -> {
                    managerTask.deleteTask();
                }
                case 6 -> {
                    managerTask.getSubtasksList();
                }

            }
        }

    }

    public static void printMenu() {
        System.out.println("Трекер Задач");
        System.out.println("0.Выход");
        System.out.println("1.Получение списка всех задач.");
        System.out.println("2. Удаление всех задач.");
        System.out.println("3.Создать задачу");
        System.out.println("4.Обновить статус задачи");
        System.out.println("5.Удалить задачи");
        System.out.println("6.Получить подзадачи определенного эпика");
    }

}
