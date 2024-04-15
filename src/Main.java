import Controller.Folder_Controller;
import Controller.ToDo_Controller;
import Model.ToDo;

public class Main {
    public static void main(String[] args) {
        Folder_Controller folder = new Folder_Controller();
        ToDo_Controller task = new ToDo_Controller();
        folder.createFolder("Проект1", "проверка кода", task);
        task.createTask("Go to school", "Just do it1", "high");
        task.createTask("Do hometask", "Just do it2", "low");
        task.setTaskStatus(0, "In Process");
        folder.readFolder();
        }

    }
