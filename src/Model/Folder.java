package Model;

import java.util.ArrayList;

public class Folder {
    String folderName;
    String description;
    ArrayList<ToDo> tasks;
    public Folder(String folderName, String description, ArrayList<ToDo> tasks) {
        this.folderName = folderName;
        this.description = description;
        this.tasks = tasks;
    }
    public void print(){
        System.out.println("\n" + "✦ " + folderName+"\n"+description);
        for (int i = 0; i < tasks.size(); i++) {
           ToDo task = tasks.get(i);
            task.printTask();
        };
    }

    public void editFolder(String folderName, String description) {
        this.folderName = folderName;
        this.description = description;
    }
}
