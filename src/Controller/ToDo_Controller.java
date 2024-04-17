package Controller;

import Model.ToDo;

import java.util.ArrayList;

public class ToDo_Controller {
    private ArrayList<ToDo> taskBase = new ArrayList<ToDo>();
    private ArrayList<ToDo> taskBaseDelleted = new ArrayList<ToDo>();


    public ArrayList<ToDo> getTaskBase() {
        return taskBase;
    }

    private ArrayList<ToDo> tempVariable = new ArrayList<ToDo>();

    public void createTask(String title, String description, String priority) {
        this.taskBase = taskBase;
        int priorityIndex = 0;
        String lowerCasePriority = priority.toLowerCase();
        if (taskBase.isEmpty())
            priorityIndex = 0;
        else if (lowerCasePriority == "high")
            priorityIndex = 0;
        else if (lowerCasePriority == "low")
            priorityIndex = 1;
        else
            throw new IllegalArgumentException("Priority can be only High or Low.");
        ToDo task = new ToDo(title, description);
        taskBase.add(priorityIndex, task);
    }

    public void deleteTask(int index) {
        this.taskBase = taskBase;
        ToDo task = taskBase.get(index);
        taskBaseDelleted.add(task);
        taskBase.remove(index);
    }


    //    public void editTask(int numTask, int indexInTask, ToDo task) {
//        this.taskBase = taskBase;
//        for (int i = 0; i < numTask + 1; i++) {
//            for (int j = 0; j < indexInTask+1; j++) {
//                taskBase.set(indexInTask, task);
//            }
//        }
//    }
    public void readAllTask() {
        for (int i = 0; i < taskBase.size(); i++) {
            ToDo task = taskBase.get(i);
            task.printTask();
        }
    }

    public void setTaskStatus(int index, String status) {
        ToDo task = taskBase.get(index);
        task.setStatus(status);
    }

    public void setTaskTitle(int index, String title) {
        ToDo task = taskBase.get(index);
        task.setTitle(title);
    }
    public void setTaskDescription(int index, String description) {
        ToDo task = taskBase.get(index);
        task.setDescription(description);
    }
}