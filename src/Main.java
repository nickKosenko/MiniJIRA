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

        ToDo_Controller task2 = new ToDo_Controller();
        folder.createFolder("Project 2", "desccription 2", task2);
        task2.createTask("Make homework", "Just do it3", "high");
        task2.createTask("Make push ups", "Just do it4", "low");
        folder.readFolder();
        }

    }
