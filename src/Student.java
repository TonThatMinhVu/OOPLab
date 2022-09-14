import java.util.Scanner;
public class Student {
    private double GPA;
    private String Name;
    private String ID;
    public Student(double GPA, String Name, String ID) {
        this.GPA = GPA;
        this.Name = Name;
        this.ID = ID;
    }
    public Student(){

    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}


