package P06_SaveACustomObject;

import java.io.Serializable;

public class Course implements Serializable{
    private String name;
    private int students;

    public Course (String name, int students){
        name = this.name;
        students = this.students;
    }

    public String getName() {
        return name;
    }

    public int getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "{Course: " + this.getName() + ", Students: " + this.getStudents() + "}";
    }
}
