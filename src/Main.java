import Controller.ToDo_Controller;
import Model.ToDo;
import View.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        ToDo_Controller task = new ToDo_Controller();

        //Test
        task.createTask("Привет", "Это я", "high");
        task.createTask("Привет2", "Это я", "low");
        view.display(task.readAllTasks());
        task.changeTask(1,2,"");
    }
}