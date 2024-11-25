public class Studente {
    private String nameUser;
    private String surnameUser;
    private int ageUser;

    public Studente(String nameUser, String surnameUser, int ageUser){
        if(nameUser != "" && surnameUser != "" && ageUser > 0 && ageUser <120){
            this.nameUser = nameUser;
        this.surnameUser = surnameUser;
        this.ageUser = ageUser;
        } else {
            System.out.println("Non hai inserito correttamente uno dei campi");
        }
    }

    public String getNameUser(){
        return this.nameUser;
    }

    public String getSurnameUser(){
        return this.surnameUser;
    }
    
    public int getAgeUser(){
        return this.ageUser;
    }

    public String getAllValues(){
        return nameUser + ", "+ surnameUser + ", "+ ageUser + " anni";
    }
}
