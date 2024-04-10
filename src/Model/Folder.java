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
        System.out.println(folderName+"\n"+
                           description+"\n"+
                           tasks);
    }

    public void editFolder(String folderName, String description) {
        this.folderName = folderName;
        this.description = description;
    }
}
