package Model;

public class ToDo {
    String title;
    String description;

    public ToDo(String title, String description) {
        this.title = title;
        this.description = description;
    }
    public void printTask(){
        System.out.println(title + "| "+ description+ "| ");
    }
}
