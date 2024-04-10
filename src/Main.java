import Controller.Folder_Controller;
import Controller.ToDo_Controller;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Nick!");

        // some comment
        //Mama
        Folder_Controller folder = new Folder_Controller();
        ToDo_Controller task = new ToDo_Controller();
        folder.createFolder("Проект1", "проверка кода", task);
        task.createTask("Привет", "Это я", "high");
        task.createTask("Привет2", "Это я", "low");
        folder.readFolder();

    }
}