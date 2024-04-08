import Controller.ToDo_Controller;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Nick!");

        // some comment
        //Mama
        ToDo_Controller task = new ToDo_Controller();
        task.createTask("Привет", "Это я", "high");
        task.createTask("Привет2", "Это я", "low");
    }
}