package Model;

public class ToDo {
    String title;
    String description;
    String status = "Recently added";

    public ToDo(String title, String description) {
        this.title = title;
        this.description = description;
    }
    public void printTask(){
        System.out.println("\n" + "• " + title + " (" + status + ")" + "\n"+ "  " + description+".");
    }
    public void setStatus(String status){
        this.status = status;
    }
}
