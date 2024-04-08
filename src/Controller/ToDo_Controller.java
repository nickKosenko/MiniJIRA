package Controller;

import Model.ToDo;

import java.util.ArrayList;

public class ToDo_Controller {
    private ArrayList<ToDo> taskBase = new ArrayList<ToDo>();

    private ArrayList<ToDo>tempVariable= new ArrayList<ToDo>();

    public void createTask(String title, String description, String priority){
        this.taskBase = taskBase;
        int priorityIndex = 0;
        String lowerCasePriority = priority.toLowerCase();
        if(lowerCasePriority == "high")
            priorityIndex = 0;
        else if(lowerCasePriority == "low")
            priorityIndex = 1;
        else
            throw new IllegalArgumentException("Priority can be only High or Low.");
        ToDo task = new ToDo(title, description);
        taskBase.add(priorityIndex, task);
    }
    public void deleteTask(int index){
        this.taskBase = taskBase;
        taskBase.remove(index);
    }
    public ArrayList<ToDo>readAllTasks(){
        return taskBase;
    }
    public changeTask(){
        tempVariable.clear();
        int indexInTask = 0;
        this.taskBase = taskBase;


    }
}
