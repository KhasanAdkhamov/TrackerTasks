public class Test {
    public static void main(String[] args) {
        Task lessonJava = new Task("lesson java", "10.00");
        StatusTask status = lessonJava.getStatus();
        System.out.println(status);

        SubTask subTask = new SubTask("macbook", "earn money");
        System.out.println(subTask.getStatus());


    }
}
