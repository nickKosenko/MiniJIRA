import Controller.Folder_Controller;
import Controller.ToDo_Controller;
import Model.ToDo;

public class Main {
    public static void main(String[] args) {
        //Anti Static
        Folder_Controller folder = new Folder_Controller();
        ToDo_Controller task = new ToDo_Controller();
        //Creating folder
        folder.createFolder("Проект1", "проверка кода", task);
        //Creating tasks
        task.createTask("Go to school", "Just do it1", "high");
        task.createTask("Do hometask", "Just do it2", "low");
        //Edit smt
        task.setTaskStatus(0, "In Process");
        task.setTaskTitle(0, ";l;l");
        task.setTaskDescription(0, "12121");
        //

        //Raed folder
        folder.readFolder();

    }

}
