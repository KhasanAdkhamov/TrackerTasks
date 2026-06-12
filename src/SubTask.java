public class SubTask extends Task{
    private Epic epic;

    public SubTask(String name, String description) {
        super(name, description);
    }

    public void setEpic(Epic epic) {
        this.epic = epic;
    }

    public Epic getEpic() {
        return epic;
    }


}
