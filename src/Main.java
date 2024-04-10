import Controller.ToDo_Controller;
import Model.ToDo;
import View.View;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        ToDo_Controller task = new ToDo_Controller();



        Folder_Controller folder = new Folder_Controller();
        ToDo_Controller task = new ToDo_Controller();
        folder.createFolder("Проект1", "проверка кода", task);
        task.createTask("Go to school", "Just do it1", "high");
        task.createTask("Do hometask", "Just do it2", "low");
        task.createTask("Fuck bitch", "Just do it3", "high");
        task.createTask("Watch video", "Just do it4", "low");
//        task.deleteTask(1);
        folder.readFolder();
        task.readAllTask();
//        task.changeTask(1, 1, "");
        folder.readFolder();
        }
    }
