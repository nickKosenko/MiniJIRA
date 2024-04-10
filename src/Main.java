import Controller.ToDo_Controller;
import Model.ToDo;
import View.View;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        ToDo_Controller task = new ToDo_Controller();


        //Test
        task.createTask("Go to school", "Just do it1", "high");
        task.createTask("Do hometask", "Just do it2", "low");
        task.createTask("Fuck bitch", "Just do it3", "high");
        task.createTask("Watch video", "Just do it4", "low");
//        task.deleteTask(1);
        task.readAllTask();
//        task.changeTask(1, 1, "");
        }
    }
