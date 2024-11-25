public class Studente {
    private String nameUser;
    private String surnameUser;
    private int ageUser;

    public Studente(String nameUser, String surnameUser, int ageUser){
        this.nameUser = nameUser;
        this.surnameUser = surnameUser;
        this.ageUser = ageUser;
    }

    public String getAllValues(){
        return nameUser + ", "+ surnameUser + ", "+ ageUser + " anni";
    }
}
