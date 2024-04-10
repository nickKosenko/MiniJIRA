package Controller;

import Model.Folder;
import Model.ToDo;

import java.util.ArrayList;

public class Folder_Controller {
    ArrayList<Folder> foldersBase = new ArrayList<>();

    public void createFolder(String folderName, String description, ToDo_Controller tasks){
        ArrayList<ToDo> taskBase = tasks.getTaskBase();
        Folder folder = new Folder(folderName, description, taskBase);
        foldersBase.add(folder);
    }
    public void readFolder(){
        Folder folder = foldersBase.get(0);
        folder.print();
    }
    public void editFolder(String folderName, String description){
        Folder folder = foldersBase.get(0);
        folder.editFolder(folderName, description);
    }
    public void deleteFolder(int folderIndex){
        foldersBase.remove(folderIndex);
    }
}
