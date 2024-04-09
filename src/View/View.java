package View;

import Model.ToDo;

import java.util.ArrayList;

public class View {
    public void display(ArrayList<ToDo> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i));

        }
    }

}
