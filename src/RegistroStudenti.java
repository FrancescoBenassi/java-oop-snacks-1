import java.util.ArrayList;

public class RegistroStudenti {
    private ArrayList<Studente> studentList = new ArrayList<>();

    public RegistroStudenti(){

    }

    public void addStudent(Studente Student){
        this.studentList.add(Student);
    }

    public ArrayList<Studente> getStudents(){
        return studentList;
    }
}
